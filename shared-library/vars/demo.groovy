// check README.md file in git repo for more clarity.
def call() {
    node {
        stage('code checkout') {
            echo 'code checkout'
        }
        stage('compile') {
            echo 'compile'
        }
        sh 'env'
        if (env.BRANCH_NAME == "main") {
            stage('build') {
                echo 'build'
            }
        } else if (env.BRANCH_NAME ==~ "PR.*" ) {
            stage('Unit test cases') {
                echo 'unit test cases'
            }
            stage('Integration test cases') {
                echo 'Integration test cases'
            }
        }
        else if (env.BRANCH_NAME ==~ "v..*") {
            stage('build') {
                echo 'build'
            }
            stage('release') {
                echo 'release'
            }
        }
        else {
            stage('Unit test cases') {
                echo 'unit test cases'
            }
        }
    } sub line
}

