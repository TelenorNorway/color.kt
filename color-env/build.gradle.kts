repositories {
	git.hub("telenornorway", "env.kt")
}

dependencies {
	compileOnly(project(":color"))
	implementation("no.telenor.kt:env:0.1.0")
	testImplementation("no.telenor.kt:setenv:2.0.0")
	testImplementation(project(":color"))
}
