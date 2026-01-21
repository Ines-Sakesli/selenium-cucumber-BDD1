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
        echo 'Publication du rapport Cucumber (JSON → HTML via Jenkins)'

        cucumber(
            buildStatus: 'UNSTABLE',
            fileIncludePattern: '**/target/report/cucumber.json',
            sortingMethod: 'ALPHABETICAL'
        )
    }
}
}
