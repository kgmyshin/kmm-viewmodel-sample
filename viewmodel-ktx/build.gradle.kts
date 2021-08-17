plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdk = 30
    defaultConfig {
        minSdk = 26
        targetSdk = 30
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.1"
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("androidx.compose.runtime:runtime:1.0.1")
}