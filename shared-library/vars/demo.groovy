// check README.md file in git repo for more clarity.
def call() {
    node{
        sh 'env'
        if(BRANCH_NAME == "main") {
            stage('code checkout') {
                echo 'code checkout'
            }
            stage('compile') {
                echo 'compile'
            }
            stage('build') {
                echo 'build'
            }
        }
        else {
            stage('code checkout') {
                echo 'code checkout'
            }
            stage('compile') {
                echo 'compile'
            }
            stage('Unit test cases') {
                echo 'unit test cases'
            }
        }
        stage('code checkout') {
            echo 'code checkout'
        }
        stage('compile') {
            echo 'compile'
        }
        stage('Unit test cases') {
            echo 'unit test cases'
        }
        stage('Integration test cases') {
            echo 'Integration test cases'
        }
        stage('build') { build line
            echo 'build'
        }
        stage('release'){
            echo 'release'
        }
    }
}