def call() {
    pipeline {
        agent { node { label 'workstation' } }
        stages {
            stage('compile') {
                steps {
                    echo 'compile'
                }
            }
            stage('testcases') {
                steps {
                    echo 'testcases'
                }
            }
            stage('build') {
                steps {
                    echo 'build'
                }
            }
            stage('release'){
                steps{
                    echo 'release'
                }
            }
        }
    }
}