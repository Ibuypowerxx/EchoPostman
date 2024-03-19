plugins {
    id("java")
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("io.rest-assured:rest-assured:4.3.1")
    implementation("io.rest-assured:json-schema-validator:4.3.1")
}

tasks.test {
    useJUnitPlatform()
}