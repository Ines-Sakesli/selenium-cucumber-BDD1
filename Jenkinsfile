pipeline {
    agent any

    tools {
        jdk 'JAVA_HOME'      // Nom exact de ta JDK dans Jenkins
        maven 'MAVEN_HOME'   // Nom exact de ton Maven dans Jenkins
    }

    options {
        timestamps()
        disableConcurrentBuilds()
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                echo 'Lancement des tests Maven...'
                bat 'mvn clean verify'
            }
        }
      
    }

    post {
        always {
            echo 'Publication du rapport HTML'
            publishHTML(target: [
                reportDir: 'target/report',
                reportFiles: 'cucumber-report.html',
                reportName: 'Cucumber Report',
                keepAll: true,
                alwaysLinkToLast: true
            ])
        }
    }
}
