plugins {
    kotlin("jvm")
}

group = "example.com"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    implementation("io.ktor:ktor-server-netty:${extra["ktorVersion"]}")
    implementation(project(":main:api"))
    implementation(project(":main:domain"))
    implementation(project(":main:data"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}