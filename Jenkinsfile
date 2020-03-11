pipeline {
    agent any

    tools {
        maven 'Maven 3.6.3'
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
                   sh 'mvn clean compile'
            }
        }
        stage ('Deployment Stage') {
            steps {
                   sh 'mvn clean compile'
            }
        }
    }
}