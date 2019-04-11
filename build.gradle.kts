import com.github.erizo.gradle.JcstressPluginExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    dependencies {
        classpath("com.github.erizo.gradle:jcstress-gradle-plugin:0.8.1")
    }
}

plugins {
    java
    kotlin("jvm") version "1.3.21"
}

apply {
    plugin("jcstress")
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
}

configure<JcstressPluginExtension> {
    jcstressDependency = "org.openjdk.jcstress:jcstress-core:0.4"
}
