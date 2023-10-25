import no.telenor.kt.color.Styles
import no.telenor.kt.env.*
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

@Suppress("unused")
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
		val styles = construct<DifferentStyles>()
		assertEquals(styles.namedForeground.run("test"), "\u001b[30mtest\u001b[39m")
	}

}
