package no.telenor.kt.color.parsers

import no.telenor.kt.color.Styles
import no.telenor.kt.env.Parser
import kotlin.reflect.KType

class StyleParser : Parser {
	@Suppress("UNUSED_PARAMETER", "unused")
	fun parseStyles(type: KType, name: String, value: String): Styles = Styles.parse(value)
}
