plugins {
    kotlin("jvm") version "1.3.61"
}

group = "example.com"
version = "1.0-SNAPSHOT"

allprojects {
    extra.apply {
        set("ktorVersion", "1.3.0")
        set("jUnitVersion", "5.3.1")
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}