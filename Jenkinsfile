node {
    checkout scm
    withEnv(["JAVA_HOME=${tool 'jdk8' }",
             "PATH+MAVEN=${tool 'maven3'}/bin:${env.JAVA_HOME}/bin"]) {
        sh 'mvn clean install'
    }
    junit 'target/surefire-reports/**/*.xml'
}