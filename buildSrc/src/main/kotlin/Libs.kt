import kotlin.String

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Update this file with
 *   `$ ./gradlew buildSrcVersions`
 */
object Libs {
    /**
     * http://tools.android.com/
     */
    const val com_android_tools_build_gradle: String = "com.android.tools.build:gradle:" +
            Versions.com_android_tools_build_gradle

    const val androidx_test_ext_junit: String = "androidx.test.ext:junit:" +
            Versions.androidx_test_ext_junit

    const val junit_junit: String = "junit:junit:" + Versions.junit_junit

    const val de_fayard_refreshversions_gradle_plugin: String =
            "de.fayard.refreshVersions:de.fayard.refreshVersions.gradle.plugin:" +
            Versions.de_fayard_refreshversions_gradle_plugin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_android_extensions_runtime: String =
            "org.jetbrains.kotlin:kotlin-android-extensions-runtime:" +
            Versions.kotlin_android_extensions_runtime

    const val desugar_jdk_libs_configuration: String =
            "com.android.tools:desugar_jdk_libs_configuration:" +
            Versions.desugar_jdk_libs_configuration

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_android_extensions: String =
            "org.jetbrains.kotlin:kotlin-android-extensions:" + Versions.kotlin_android_extensions

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_gradle_plugin: String = "org.jetbrains.kotlin:kotlin-gradle-plugin:" +
            Versions.kotlin_gradle_plugin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_stdlib_jdk7: String = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:" +
            Versions.kotlin_stdlib_jdk7

    const val constraintlayout: String = "androidx.constraintlayout:constraintlayout:" +
            Versions.constraintlayout

    const val desugar_jdk_libs: String = "com.android.tools:desugar_jdk_libs:" +
            Versions.desugar_jdk_libs

    const val espresso_core: String = "androidx.test.espresso:espresso-core:" +
            Versions.espresso_core

    const val lint_gradle: String = "com.android.tools.lint:lint-gradle:" + Versions.lint_gradle

    const val appcompat: String = "androidx.appcompat:appcompat:" + Versions.appcompat

    const val core_ktx: String = "androidx.core:core-ktx:" + Versions.core_ktx

    const val aapt2: String = "com.android.tools.build:aapt2:" + Versions.aapt2
}
