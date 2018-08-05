pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
		sh 'git tag -a 0.1 -m "my version"'
		sh "git push origin --tags"
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
