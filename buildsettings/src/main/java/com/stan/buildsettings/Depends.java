package com.stan.buildsettings;

/**
 * Author: Stan
 * Date: 2022/11/13
 * Description: 依赖管理
 */
public class Depends {

    public static class AndroidX {
        private static final String room_version = "2.4.3";
        private static final String databinding_version = "7.3.1";
        private static final String lifecycle_version = "2.5.1";

        // base
        public static final String core_ktx = "androidx.core:core-ktx:1.9.0";
        public static final String appcompat = "androidx.appcompat:appcompat:1.5.1";
        public static final String multidex = "androidx.multidex:multidex:2.0.1";

        // databinding
        public static final String databinding_adapter = "androidx.databinding:databinding-adapters:" + databinding_version;
        public static final String databinding_common = "androidx.databinding:databinding-common:" + databinding_version;
        public static final String databinding_runtime = "androidx.databinding:databinding-runtime:" + databinding_version;
        public static final String databinding_viewbinding = "androidx.databinding:viewbinding:" + databinding_version;

        // lifecycle
        public static final String lifecycle_livedata = "androidx.lifecycle:lifecycle-livedata:" + lifecycle_version;
        public static final String lifecycle_livedata_ktx = "androidx.lifecycle:lifecycle-livedata-ktx:" + lifecycle_version;
        public static final String lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:2.2.0";
        public static final String lifecycle_viewmodel = "androidx.lifecycle:lifecycle-viewmodel:" + lifecycle_version;
        public static final String lifecycle_viewmodel_ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:" + lifecycle_version;
        public static final String lifecycle_viewmodel_savedstate = "androidx.lifecycle:lifecycle-viewmodel-savedstate:" + lifecycle_version;
        public static final String lifecycle_common = "androidx.lifecycle:lifecycle-common-java8:" + lifecycle_version;
        public static final String lifecycle_runtime = "androidx.lifecycle:lifecycle-runtime:" + lifecycle_version;
        public static final String lifecycle_runtime_ktx = "androidx.lifecycle:lifecycle-runtime-ktx:" + lifecycle_version;
        public static final String lifecycle_core = "androidx.lifecycle:lifecycle-livedata-core-ktx:" + lifecycle_version;

        // room
        public static final String room_runtime = "androidx.room:room-runtime:" + room_version;
        public static final String room_compiler = "androidx.room:room-compiler:" + room_version;
        public static final String room_testing = "androidx.room:room-testing:" + room_version;
    }

    public static class Google {
        public static final String material = "com.google.android.material:material:1.7.0";
        public static final String constraintlayout = "androidx.constraintlayout:constraintlayout:2.1.4";
        public static final String gson = "com.google.code.gson:gson:2.8.9";
    }

    public static class Kotlin {
        private static final String kotlin_coroutines_version = "1.5.2";

        public static final String kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:1.7.10";
        public static final String kotlinx_coroutines_core_jvm = "org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:1.6.1";
        public static final String kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:" + kotlin_coroutines_version;
        public static final String kotlinx_coroutines_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:" + kotlin_coroutines_version;
        public static final String kotlinx_coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:" + kotlin_coroutines_version;
    }

    public static class OpenSource {

    }
}
