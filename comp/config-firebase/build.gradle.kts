/*
 * Copyright 2022 WANG Yanke
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

plugins {
    id("common.main-component")
}

dependencies {
    implementation(project(":lib:init"))

    // Startup initialization
    implementation(Libs.STARTUP)

    // WorkManager
    implementation(Libs.WORK_RUNTIME_KTX)
    implementation(Libs.HILT_WORK)
    kapt(Libs.HILT_ANDROIDX_COMPILER)

    // Firebase
    implementation(platform(Libs.FIREBASE_BOM))
    implementation(Libs.FIREBASE_ANALYTICS)
    implementation(Libs.FIREBASE_CONFIG)
    implementation(Libs.COROUTINES_PLAY_SERVICE)

    // Serialization for parsing JSON values
    implementation(Libs.KOTLINX_SERIALIZATION)
}
