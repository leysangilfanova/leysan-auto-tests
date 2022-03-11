# leysan-auto-tests

plugins {
id 'java-library'
}

repositories {
mavenCentral()
}

dependencies {
testImplementation 'com.codeborne:selenide:5.18.0'
testImplementation 'org.junit.jupiter:junit-jupiter-api:5.6.2'
testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.6.2'
}

test {
useJUnitPlatform()
}