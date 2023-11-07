repositories {
	git.hub("telenornorway", "env.kt")
}

dependencies {
	compileOnly(project(":color"))
	implementation("no.telenor.kt:env:0.5.2")
	testImplementation("no.telenor.kt:setenv:2.0.1")
	testImplementation(project(":color"))
}
