plugins {
    alias(libs.plugins.androidApplication)
    id("com.google.gms.google-services")
}

android {
    namespace = "com.notes.code"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.notes.code"
        minSdk = 23
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.firebase.auth)
    implementation(libs.firebase.firestore)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    //FirebaseUI for Firebase Realtime Database
    implementation("com.firebaseui:firebase-ui-database:5.0.0")
    //FirebaseUI for Cloud Firestore
    implementation("com.firebaseui:firebase-ui-firestore:5.0.0")
    //FirebaseUI for Firebase Auth
    implementation("com.firebaseui:firebase-ui-auth:5.0.0")
    // FirebaseUI for Cloud Storage
    implementation("com.firebaseui:firebase-ui-storage:5.0.0")

}