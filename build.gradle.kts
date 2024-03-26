plugins {
    kotlin("multiplatform") version "2.0.0-Beta5"
}

repositories {
    mavenCentral()
}



kotlin {
    macosArm64()
    sourceSets.macosMain.dependencies {
        implementation("net.thauvin.erik.urlencoder:urlencoder-lib:1.4.0")
    }
}

dependencies {
    commonTestImplementation(kotlin("test"))
}