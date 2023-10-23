# Color.kt

_Simple functional coloring tools for Kotlin_

## Dependency

In your gradle file

_Follow [this guide](https://github.com/testersen/no.ghpkg) on how to set up your environment for GitHub packages._

```kt
plugins {
	id("no.ghpkg") version "0.3.3"
}

repositories {
	git.hub("telenornorway", "color.kt")
	// or <.. the below> if you're spicy 🌶️
	// git.hub("telenornorway")
}

dependencies {
	implementation("no.telenor.kt:color:<VERSION HERE>")
	// if you want to derive
	runtimeOnly("no.telenor.kt:color-env:<VERSION HERE>")
}
```

## Usage

```kt
println("Hello, ${green("world")}!")
```

Or with derive:

```kt
data class MyStyles @EnvConstructor constructor(
	@Env val names: Styles
)
```
