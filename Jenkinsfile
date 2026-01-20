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

        stage('Fake HTML Test') {
            steps {
                echo 'Création d’un fichier HTML factice pour test...'
                bat '''
                if not exist target\\report mkdir target\\report
                echo <html><body><h1>Test Cucumber Report</h1></body></html> > target\\report\\cucumber-report.html
                '''
            }
        }

        stage('Check Report') {
            steps {
                echo 'Vérification du contenu du dossier target\\report'
                bat 'dir target\\report'
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
