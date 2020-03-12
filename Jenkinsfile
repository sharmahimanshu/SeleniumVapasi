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
                   sh 'mvn clean test'
            }
        }
        stage ('Deployment Stage') {
            steps {
                   echo '++++++In Deployment Stage++++++++'
            }
        }
    }
}