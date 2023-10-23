package no.telenor.kt.color

internal var enabled = System.getenv("NO_COLOR") != "1"

fun isColorEnabled() = enabled
fun setColorEnabled(state: Boolean) {
	enabled = state
}
