plugins {
	kotlin("jvm") version "1.9.0"
	id("no.ghpkg") version "0.3.3"
	`maven-publish`
}

allprojects {
	apply(plugin = "org.jetbrains.kotlin.jvm")
	apply(plugin = "maven-publish")
	apply(plugin = "no.ghpkg")

	group = "no.telenor.jb"
	version = versioning.environment()

	repositories {
		mavenCentral()
	}

	dependencies {
		testImplementation(kotlin("test"))
	}

	tasks.test {
		useJUnitPlatform()
	}

	kotlin {
		jvmToolchain(17)
	}

	publishing {
		repositories.github.actions()
		publications.register<MavenPublication>("gpr") {
			from(components["kotlin"])
		}
	}
}
