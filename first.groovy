pipeline {
  agent any

  environment {
    //setup env var
    REPO = "jnks"
    USER = "Parth"
  }

  stages {
    stage("Override") {
      environment {
        // Override
        USER = "TEST"
      }
      steps {
        sh 'echo "Repo = $REPO; USER = $USER"'
      }
    }
    stage("Local") {
      steps {
        sh 'echo "Repo = $REPO; USER = $USER"'
      }
    }
  }
}

