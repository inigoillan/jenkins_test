pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sbt('SBT 0.12.3', 'test', '-Dsbt.log.noformat=true', '-Xmx2G -Xms512M', 'subproject')
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
