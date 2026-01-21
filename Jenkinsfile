pipeline {
    agent any

    tools {
        maven 'JAVA_HOME'
        jdk 'MAVEN_HOME'
    }

    environment {
        MAVEN_OPTS = "-Xmx1024m"
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/Ines-Sakesli/selenium-cucumber-BDD1.git'
            }
        }

        stage('Clean') {
            steps {
                bat 'mvn clean'
            }
        }

        stage('Compile') {
            steps {
                bat 'mvn compile'
            }
        }

        stage('Run Tests') {
            steps {
                // Génère le JSON report pour Cucumber
                bat 'mvn test -Dcucumber.plugin="json:target/report/cucumber.json"'
            }
        }

        stage('Cucumber Report') {
            steps {
                // Utilise le plugin Cucumber Jenkins pour générer le HTML à partir du JSON
                cucumber(
                    jsonReportDirectory: 'target/report',
                    fileIncludePattern: 'cucumber.json'
                )
            }
        }
    }

    post {
        always {
            //archiveArtifacts artifacts: '*/target/.jar', fingerprint: true
            junit '*/target/report/surefire-reports/.xml'
        }
        failure {
            echo '❌ Pipeline échoué'
        }
        success {
            echo '✅ Tests exécutés avec succès'
        }
    }
}