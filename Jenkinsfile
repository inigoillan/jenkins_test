pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
		git tag -a 0.1 -m "my version"
		git push origin --tags
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
