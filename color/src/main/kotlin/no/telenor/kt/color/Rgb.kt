package no.telenor.kt.color

data class Rgb(val r: UByte, val g: UByte, val b: UByte) {
	constructor(hex: UInt) : this(
		((hex shr 16) and 0xFFu).toUByte(),
		(hex shr 8 and 0xFFu).toUByte(),
		(hex and 0xFFu).toUByte()
	)
}
