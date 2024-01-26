def call() {
    pipeline {
        //agent { node { label 'workstation' } }
        agent any
        stages {
            stage('compile') {
                steps {
                    echo 'compile'
                }
            }
            stage('Unit test cases') {
                steps {
                    echo 'unit test cases'
                }
            }
            stage('Integration test cases') {
                steps {
                    echo 'Integration test cases'
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

