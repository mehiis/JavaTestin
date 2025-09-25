pipeline{
    agent any
    environment {
            PATH = "C:\\Program Files\\Docker\\Docker\\resources\\bin;${env.PATH}"

            // Define Docker Hub credentials ID
            DOCKERHUB_CREDENTIALS_ID = 'Docker_Hub'
            // Define Docker Hub repository name
            DOCKERHUB_REPO = 'amirdirin/week6_livedemo_sep1'
            // Define Docker image tag
            DOCKER_IMAGE_TAG = 'latest'
        }
    tools{
        maven 'MAVEN'
    }
    stages{
        stage('checking'){
            steps{
                git branch:'master', url:'https://github.com/ADirin/livedemo_week6_sep1.git'
            }
        }

        stage ('build'){
            steps {
              bat  'mvn clean install'
            }
        }

  stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Code Coverage') {
            steps {
                bat 'mvn jacoco:report'
            }
        }
        stage('Publish Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
        stage('Publish Coverage Report') {
            steps {
                jacoco()
            }
        }

    }
}