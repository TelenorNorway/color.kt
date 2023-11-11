import no.telenor.kt.color.Styles
import no.telenor.kt.env.Construct.Companion.from
import no.telenor.kt.env.Env
import no.telenor.kt.env.EnvConstructor
import no.telenor.kt.env.Environment
import no.telenor.kt.env.EnvironmentSnapshot
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

data class DifferentStyles @EnvConstructor constructor(
	@Env val namedForeground: Styles,
)

class DeriveStylesTests {

	// region cleanup

	private var snapshot: EnvironmentSnapshot? = null

	@BeforeTest
	fun snapshot() {
		snapshot = Environment.snapshot()
		Environment.clear()
	}

	@AfterTest
	fun restore() {
		snapshot?.let {
			Environment.restore(it)
		}
	}

	// endregion

	@Test
	fun `derive styles from environment variable`() {
		Environment.set("NAMED_FOREGROUND", "fg=black")
		val styles = from<DifferentStyles>()
		assertEquals(styles.namedForeground.run("test"), "\u001b[30mtest\u001b[39m")
	}

}
