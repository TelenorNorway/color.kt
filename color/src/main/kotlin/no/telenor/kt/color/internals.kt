@file:OptIn(ExperimentalUnsignedTypes::class)

package no.telenor.kt.color

/** Builds a [Code]. */
internal fun code(close: UByte, vararg open: UByte): Code {
	return Code(
		"\u001b[${open.joinToString(";")}m",
		"\u001b[${close}m",
		Regex("\\u001b\\[${close}m")
	)
}

/** RUns a [Code] on a string. */
fun runCode(str: String, code: Code): String = if (enabled) {
	"${code.open}${str.replace(code.regexp, code.close)}${code.close}"
} else {
	str
}

internal fun clamp(n: UByte, max: UByte = 255U, min: UByte = 0U) = if (n > max) max else if (n < min) min else n
