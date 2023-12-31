@file:Suppress("unused")

package no.telenor.kt.color

// @formatter:off
@OptIn(ExperimentalUnsignedTypes::class) val RESET = code(0U, 0U)
@OptIn(ExperimentalUnsignedTypes::class) val BOLD = code(22U, 1U)
@OptIn(ExperimentalUnsignedTypes::class) val DIM = code(22U, 1U)
@OptIn(ExperimentalUnsignedTypes::class) val ITALIC = code(23U, 3U)
@OptIn(ExperimentalUnsignedTypes::class) val UNDERLINE = code(24U, 4U)
@OptIn(ExperimentalUnsignedTypes::class) val INVERSE = code(27U, 7U)
@OptIn(ExperimentalUnsignedTypes::class) val HIDDEN = code(28U, 8U)
@OptIn(ExperimentalUnsignedTypes::class) val STRIKETHROUGH = code(29U, 9U)
@OptIn(ExperimentalUnsignedTypes::class) val BLACK = code(39U, 30U)
@OptIn(ExperimentalUnsignedTypes::class) val RED = code(39U, 31U)
@OptIn(ExperimentalUnsignedTypes::class) val GREEN = code(39U, 32U)
@OptIn(ExperimentalUnsignedTypes::class) val YELLOW = code(39U, 33U)
@OptIn(ExperimentalUnsignedTypes::class) val BLUE = code(39U, 34U)
@OptIn(ExperimentalUnsignedTypes::class) val MAGENTA = code(39U, 35U)
@OptIn(ExperimentalUnsignedTypes::class) val CYAN = code(39U, 36U)
@OptIn(ExperimentalUnsignedTypes::class) val WHITE = code(39U, 37U)
@OptIn(ExperimentalUnsignedTypes::class) val BRIGHT_BLACK = code(39U, 90U)
@OptIn(ExperimentalUnsignedTypes::class) val BRIGHT_RED = code(39U, 91U)
@OptIn(ExperimentalUnsignedTypes::class) val BRIGHT_GREEN = code(39U, 92U)
@OptIn(ExperimentalUnsignedTypes::class) val BRIGHT_YELLOW = code(39U, 93U)
@OptIn(ExperimentalUnsignedTypes::class) val BRIGHT_BLUE = code(39U, 94U)
@OptIn(ExperimentalUnsignedTypes::class) val BRIGHT_MAGENTA = code(39U, 95U)
@OptIn(ExperimentalUnsignedTypes::class) val BRIGHT_CYAN = code(39U, 96U)
@OptIn(ExperimentalUnsignedTypes::class) val BRIGHT_WHITE = code(39U, 97U)
@OptIn(ExperimentalUnsignedTypes::class) val BG_BLACK = code(49U, 40U)
@OptIn(ExperimentalUnsignedTypes::class) val BG_RED = code(49U, 41U)
@OptIn(ExperimentalUnsignedTypes::class) val BG_GREEN = code(49U, 42U)
@OptIn(ExperimentalUnsignedTypes::class) val BG_YELLOW = code(49U, 43U)
@OptIn(ExperimentalUnsignedTypes::class) val BG_BLUE = code(49U, 44U)
@OptIn(ExperimentalUnsignedTypes::class) val BG_MAGENTA = code(49U, 45U)
@OptIn(ExperimentalUnsignedTypes::class) val BG_CYAN = code(49U, 46U)
@OptIn(ExperimentalUnsignedTypes::class) val BG_WHITE = code(49U, 47U)
@OptIn(ExperimentalUnsignedTypes::class) val BG_BRIGHT_BLACK = code(49U, 100U)
@OptIn(ExperimentalUnsignedTypes::class) val BG_BRIGHT_RED = code(49U, 101U)
@OptIn(ExperimentalUnsignedTypes::class) val BG_BRIGHT_GREEN = code(49U, 102U)
@OptIn(ExperimentalUnsignedTypes::class) val BG_BRIGHT_YELLOW = code(49U, 103U)
@OptIn(ExperimentalUnsignedTypes::class) val BG_BRIGHT_BLUE = code(49U, 104U)
@OptIn(ExperimentalUnsignedTypes::class) val BG_BRIGHT_MAGENTA = code(49U, 105U)
@OptIn(ExperimentalUnsignedTypes::class) val BG_BRIGHT_CYAN = code(49U, 106U)
@OptIn(ExperimentalUnsignedTypes::class) val BG_BRIGHT_WHITE = code(49U, 107U)
// @formatter:on

fun reset(text: String) = runCode(text, RESET)
fun bold(text: String) = runCode(text, BOLD)
fun dim(text: String) = runCode(text, DIM)
fun italic(text: String) = runCode(text, ITALIC)
fun underline(text: String) = runCode(text, UNDERLINE)
fun inverse(text: String) = runCode(text, INVERSE)
fun hidden(text: String) = runCode(text, HIDDEN)
fun strikeThrough(text: String) = runCode(text, STRIKETHROUGH)
fun black(text: String) = runCode(text, BLACK)
fun red(text: String) = runCode(text, RED)
fun green(text: String) = runCode(text, GREEN)
fun yellow(text: String) = runCode(text, YELLOW)
fun blue(text: String) = runCode(text, BLUE)
fun magenta(text: String) = runCode(text, MAGENTA)
fun cyan(text: String) = runCode(text, CYAN)
fun white(text: String) = runCode(text, WHITE)
fun brightBlack(text: String) = runCode(text, BRIGHT_BLACK)
fun brightRed(text: String) = runCode(text, BRIGHT_RED)
fun brightGreen(text: String) = runCode(text, BRIGHT_GREEN)
fun brightYellow(text: String) = runCode(text, BRIGHT_YELLOW)
fun brightBlue(text: String) = runCode(text, BRIGHT_BLUE)
fun brightMagenta(text: String) = runCode(text, BRIGHT_MAGENTA)
fun brightCyan(text: String) = runCode(text, BRIGHT_CYAN)
fun brightWhite(text: String) = runCode(text, BRIGHT_WHITE)
fun bgBlack(text: String) = runCode(text, BG_BLACK)
fun bgRed(text: String) = runCode(text, BG_RED)
fun bgGreen(text: String) = runCode(text, BG_GREEN)
fun bgYellow(text: String) = runCode(text, BG_YELLOW)
fun bgBlue(text: String) = runCode(text, BG_BLUE)
fun bgMagenta(text: String) = runCode(text, BG_MAGENTA)
fun bgCyan(text: String) = runCode(text, BG_CYAN)
fun bgWhite(text: String) = runCode(text, BG_WHITE)
fun bgBrightBlack(text: String) = runCode(text, BG_BRIGHT_BLACK)
fun bgBrightRed(text: String) = runCode(text, BG_BRIGHT_RED)
fun bgBrightGreen(text: String) = runCode(text, BG_BRIGHT_GREEN)
fun bgBrightYellow(text: String) = runCode(text, BG_BRIGHT_YELLOW)
fun bgBrightBlue(text: String) = runCode(text, BG_BRIGHT_BLUE)
fun bgBrightMagenta(text: String) = runCode(text, BG_BRIGHT_MAGENTA)
fun bgBrightCyan(text: String) = runCode(text, BG_BRIGHT_CYAN)
fun bgBrightWhite(text: String) = runCode(text, BG_BRIGHT_WHITE)

@OptIn(ExperimentalUnsignedTypes::class)
fun rgb8(color: UByte) = code(39U, 38U, 5U, clamp(color))

@OptIn(ExperimentalUnsignedTypes::class)
fun bgRgb8(color: UByte) = code(49U, 48U, 5U, clamp(color))

@OptIn(ExperimentalUnsignedTypes::class)
fun rgb24(r: UByte, g: UByte, b: UByte) = code(39U, 38U, 2U, r, g, b)

fun rgb24(color: UInt) = rgb24(
	((color shr 16) and 0xFFU).toUByte(),
	((color shr 8) and 0xFFU).toUByte(),
	(color and 0xFFU).toUByte()
)

fun rgb24(color: Rgb) = rgb24(color.r, color.g, color.b)

@OptIn(ExperimentalUnsignedTypes::class)
fun bgRgb24(r: UByte, g: UByte, b: UByte) = code(49U, 48U, 2U, r, g, b)

fun bgRgb24(color: UInt) =
	bgRgb24(((color shr 16) and 8U).toUByte(), ((color shr 8) and 8U).toUByte(), (color and 8U).toUByte())

fun bgRgb24(color: Rgb) = bgRgb24(color.r, color.g, color.b)
