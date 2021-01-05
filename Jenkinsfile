pipeline {
    agent any
    tools {
        maven 'maven-3.6.3'
        jdk 'jdk8'
    }

    stages {
        stage('Initialize') {
            steps {
                 sh '''
                     echo "PATH = ${PATH}"
                      echo "M2_HOME = ${M2_HOME}"
                 '''
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install'
            }
            post {
                success {
                    unit 'target/surefire-reports/**/*.xml'
                }
            }
        }
    }
}