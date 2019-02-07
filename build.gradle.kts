import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("application")
    kotlin("jvm") version "1.3.11"
    id("org.jetbrains.kotlin.kapt") version "1.3.20"
}

group = "bryansills.ninja"
version = "1.0-SNAPSHOT"

application {
    mainClassName = "ninja.bryansills.buttz.MainKt"
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.google.dagger:dagger:2.21")
    kapt("com.google.dagger:dagger-compiler:2.21")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.20")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}