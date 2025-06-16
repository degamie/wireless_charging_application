//import androidx.room.compiler.processing.util.compiler.compile
import java.util.regex.Pattern.compile

plugins {
    id:'maven-publish'
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)

}
//java lib
afterEvaluate{
    publishing{
        mavanJava(MavenPublishingcation){
            from components.java{
                group-id="com.giniapps.artifacts.ID.gaio.java"
                artifactid="gaio.java"
                artifact-version="1.0"
                artifact packageJavaDoc
            }
        }
    }
}
javaDoc{
    source=source.sets.main.allJava
    classPath=configurations.compileclassPath
    options.setMemberlevel.javaDocMemeberLevel.PUBLISH

}

android {
    namespace = "com.example.wirelesschargingapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.wirelesschargingapplication"
        minSdk = 24
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
        viewBinding = true
    }
    dependenciesInfo {
        includeInApk = true
        includeInBundle = true
    }
    buildToolsVersion = "35.0.0"
}

dependencies {
    compile ("com.squareup.retrofit2:retrofit:2.3.0")
    compile ("com.squareup.retrofit2:converter-gson:2.3.0")
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.firebase.inappmessaging)
    implementation(libs.testng)
    implementation(libs.junit.junit)
    implementation(libs.androidx.room.compiler.processing.testing)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

}
//    <!-- https://mvnrepository.com/artifact/com.squareup.retrofit2/retrofit -->
//    <dependency>
//    <groupId>com.squareup.retrofit2</groupId>
//    <artifactId>retrofit</artifactId>
//    <version>2.9.0</version>
//    </dependency>
