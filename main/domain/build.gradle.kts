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

    testImplementation("org.junit.jupiter:junit-jupiter-api:${extra["jUnitVersion"]}")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:${extra["jUnitVersion"]}")
}

tasks.test {
    useJUnitPlatform()
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}