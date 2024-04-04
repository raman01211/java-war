pipeline {
    agent any

    tools {
        maven 'Maven-3.9.6'
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
            post {
                success {
                    echo 'Archiving the artifacts'
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }

        stage('Deployments') {
            steps {
                script {
                    deploy adapters: [tomcat7(credentialsId: '04206806-1f05-4781-9ac3-634a7875a0e0', path: '', url: 'http://localhost:8081/')], contextPath: null, war: '**/*.war'
                }
            }
        }
    }
}
