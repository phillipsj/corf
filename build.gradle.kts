plugins {
    kotlin("jvm") version "2.0.0"
    application
}

group = "com.github.phillipsj.corf"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("com.github.phillipsj.corf.MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.github.ajalt.clikt:clikt:4.4.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}
