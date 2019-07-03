pipeline {
  agent any
  stages {
    stage('Build') {
      agent any
      steps {
        sh 'gradle clean install'
      }
    }
  }
}