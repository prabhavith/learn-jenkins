// check README.md file in git repo for more clarity.
def call() {
    node {
        sh 'env'
        if (env.BRANCH_NAME == "main") {
            stage('code checkout') {
                echo 'code checkout'
            }
            stage('compile') {
                echo 'compile'
            }
            stage('build') {
                echo 'build'
            }
        } else if (env.BRANCH_NAME ==~ "PR.*" ) {
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
        }
        else if (env.BRANCH_NAME ==~ "v..*") {
            stage('code checkout') {
                echo 'code checkout'
            }
            stage('compile') {
                echo 'compile'
            }
            stage('build') {
                echo 'build'
            }
            stage('release') {
                echo 'release'
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
    }
}

