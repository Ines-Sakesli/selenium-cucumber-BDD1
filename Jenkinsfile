pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Generate Cucumber HTML Report') {
            steps {
                bat '''
                mvn net.masterthought:cucumber-reporting:5.7.0:generate ^
                -DcucumberOutput=target/report/cucumber.json ^
                -DoutputDirectory=target/cucumber-html-report ^
                -DprojectName="Selenium Cucumber BDD"
                '''
            }
        }
    }

    post {
        always {
            publishHTML(target: [
                reportDir: 'target/cucumber-html-report',
                reportFiles: 'index.html',
                reportName: 'Cucumber Report (Masterthought)',
                keepAll: true,
                alwaysLinkToLastBuild: true,
                allowMissing: false
            ])
        }
    }
}
