pipeline {
  agent {
    docker {
      image 'gradle'
    }

  }
  stages {
    stage('Build') {
      agent any
      steps {
        sh 'gradle clean install'
      }
    }
  }
}