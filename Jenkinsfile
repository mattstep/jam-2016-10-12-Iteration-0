node {
    checkout scm
    docker.image('maven:3-jdk-8').inside {
        sh 'mvn clean install'
    }
    junit 'target/surefire-reports/**/*.xml'
}