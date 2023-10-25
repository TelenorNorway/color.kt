@file:Suppress("unused")

package no.telenor.kt.color

class Styles(
	private vararg val decorations: Code,
	private val fg: Code? = null,
	private val bg: Code? = null,
) {
	fun run(txt: String): String {
		var output = txt
		if (fg != null) output = runCode(output, fg)
		if (bg != null) output = runCode(output, bg)
		for (code in decorations) {
			output = runCode(output, code)
		}
		return output
	}

	companion object {
		fun parse(options: String): Styles {
			val decorations = mutableListOf<Code>()
			var fg: Code? = null
			var bg: Code? = null

			for (option in options.split(Regex("[,;\\s]+]"))) {
				val eqIndex = option.indexOf("=")
				if (eqIndex == -1) {
					val code = decorationTable[option] ?: continue
					decorations.add(code)
					continue
				}
				val key = option.substring(0, eqIndex)
				val value = option.substring(eqIndex + 1)
				if (key == "fg") {
					val code = fgTable[value]
					if (code != null) {
						fg = code
						continue
					}
					if (value.startsWith("#")) {
						fg = rgb24(value.substring(1).toUInt(16))
					}
				} else if (key == "bg") {
					val code = bgTable[value]
					if (code != null) {
						bg = code
						continue
					}
					if (value.startsWith("#")) {
						bg = bgRgb24(value.substring(1).toUInt(16))
					}
				}
			}
			return Styles(*decorations.toTypedArray(), fg = fg, bg = bg)
		}
	}
}

private val decorationTable = mutableMapOf(
	"reset" to RESET,
	"bold" to BOLD,
	"dim" to DIM,
	"italic" to ITALIC,
	"underline" to UNDERLINE,
	"inverse" to INVERSE,
	"hidden" to HIDDEN,
	"strikethrough" to STRIKETHROUGH,
)

private val fgTable = mutableMapOf(
	"black" to BLACK,
	"red" to RED,
	"green" to GREEN,
	"yellow" to YELLOW,
	"blue" to BLUE,
	"magenta" to MAGENTA,
	"cyan" to CYAN,
	"white" to WHITE,
	"brightBlack" to BRIGHT_BLACK,
	"brightRed" to BRIGHT_RED,
	"brightGreen" to BRIGHT_GREEN,
	"brightYellow" to BRIGHT_YELLOW,
	"brightBlue" to BRIGHT_BLUE,
	"brightMagenta" to BRIGHT_MAGENTA,
	"brightCyan" to BRIGHT_CYAN,
	"brightWhite" to BRIGHT_WHITE,
)

private val bgTable = mutableMapOf(
	"black" to BG_BLACK,
	"red" to BG_RED,
	"green" to BG_GREEN,
	"yellow" to BG_YELLOW,
	"blue" to BG_BLUE,
	"magenta" to BG_MAGENTA,
	"cyan" to BG_CYAN,
	"white" to BG_WHITE,
	"brightBlack" to BG_BRIGHT_BLACK,
	"brightRed" to BG_BRIGHT_RED,
	"brightGreen" to BG_BRIGHT_GREEN,
	"brightYellow" to BG_BRIGHT_YELLOW,
	"brightBlue" to BG_BRIGHT_BLUE,
	"brightMagenta" to BG_BRIGHT_MAGENTA,
	"brightCyan" to BG_BRIGHT_CYAN,
	"brightWhite" to BG_BRIGHT_WHITE,
)
