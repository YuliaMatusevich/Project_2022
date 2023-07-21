pipeline {
    agent any
    options {
        buildDiscarder(logRotator(daysToKeepStr: '10', numToKeepStr: '10'))
        timeout(time: 12, unit: 'HOURS')
    }
    stages {
        stage("Hello!\nPlease read the logs.") {
            steps {
                echo "Hello!"
            }
        }
    }
}
    agent { docker { image 'maven:3.9.0-eclipse-temurin-11' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn test'
            }
        }
    }

