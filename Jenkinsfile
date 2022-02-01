pipeline {
    agent any

    tools {
        maven "Maven-3.8.4"
    }

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/ivdanchuk/jenkins1.git'
                bat "mvn clean install"
            }
        }
    }
}
