enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "BroCallie"
include(":androidApp")

include(":shared:feature:contacts")
include(":shared:feature:contactdetails")

include(":shared:core:generative-ai")
include(":shared:core:tts")