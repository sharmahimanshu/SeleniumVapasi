pipeline {
    agent any

    tools {
        maven 'maven_3_6_3'
        jdk 'jdk8'
    }

    stages {
        stage ('Compile Stage') {
            steps {
                   sh 'mvn clean compile'
            }
        }
        stage ('Testing Stage') {
            steps {
                   sh 'java -jar selenium-server-standalone-3.141.59.jar hub'
                   sh 'mvn clean test'
            }
        }
        stage ('Deployment Stage') {
            steps {
                   sh 'mvn clean compile'
            }
        }
    }
}