plugins {
    id("java")
    kotlin("jvm")
}

group = "dev.jsinco.brewery"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
}

dependencies {
    // Include the latest release of BreweryX instead of this version.
    compileOnly("com.github.BreweryTeam:BreweryX:snapshot-SNAPSHOT")

    // We need to include our own copy of whatever server software we're writing against!
    compileOnly("org.spigotmc:spigot-api:1.20.2-R0.1-SNAPSHOT")

    // Do NOT shade Kotlin's standard library, BreweryX loads it at runtime!
    compileOnly(kotlin("stdlib-jdk8"))
}

kotlin {
    jvmToolchain(17)
}