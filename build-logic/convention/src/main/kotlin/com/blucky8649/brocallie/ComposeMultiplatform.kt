package com.blucky8649.brocallie

import com.android.build.gradle.internal.scope.ProjectInfo.Companion.getBaseName
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.compose.ComposePlugin
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

internal fun Project.configureComposeMultiplatform() {
    extensions.configure<KotlinMultiplatformExtension> {
        sourceSets.apply {
            androidMain.dependencies {
                val navigationCompose = libs.findLibrary("androidx-navigation-compose").get()
                implementation(navigationCompose.get())
            }
            commonMain.dependencies {
                val compose = ComposePlugin.Dependencies(this@configureComposeMultiplatform)
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material3)
                implementation(compose.ui)
                implementation(compose.components.resources)
                implementation(compose.components.uiToolingPreview)
            }
        }
    }
}