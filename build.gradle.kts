// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    val kotlinVersion = "1.3.60-eap-25"
    repositories {
        google()
        jcenter()
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.0.0-alpha02")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}
plugins {
    id("de.fayard.refreshVersions") version "0.7.0"
    id("com.diffplug.gradle.spotless") version "3.25.0"
}
fun isVersionNotStable(version: String): Boolean {
    val rejectedVersions = listOf("cr", "m", "preview", "eap")
    rejectedVersions.forEach {
        if (version.contains(it)) {
            return false
        }
    }
    return true
}

buildSrcVersions {
    rejectVersionIf {
        isVersionNotStable(candidate.version)
    }
}

spotless {
    kotlin {
        target("**/*.kt")
        ktlint()
    }
    kotlinGradle {
        target("*.gradle.kts", "additionalScripts/*.gradle.kts")
        targetExclude("buildSrc/**/*.gradle.kts")
        ktlint()
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
    }
}

tasks {
    val updateGradle by registering(Wrapper::class) {
        gradleVersion = Versions.gradleLatestVersion
        distributionType = Wrapper.DistributionType.ALL
    }
}
