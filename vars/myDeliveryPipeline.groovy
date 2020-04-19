def call(body) {
    // evaluate the body block, and collect configuration into the object
    def pipelineParams= [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipelineParams
    body()

    pipeline {
    agent any
        environment {
            COMPUTERNAME = 'MacBook Air'
        }
    stages {
        stage('test1') {
            steps{
                echo "Build number is ${env.BUILD_NUMBER}"
                script {
                    currentBuild.description = pipelineParams.build_description
                    currentBuild.displayName = pipelineParams.displayName
                }
                sayHello pipelineParams.name
                notify (type: 'slack', message: 'a slack notification')
                printHello (user: 'Max', greet:'Hi')
                script {
                    logs.info 'Starting'
                    logs.warning 'Nothing to do!'
                }
            }
        }
    }
}
}
