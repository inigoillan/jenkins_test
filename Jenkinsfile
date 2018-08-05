pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
		sbt 'compile'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
