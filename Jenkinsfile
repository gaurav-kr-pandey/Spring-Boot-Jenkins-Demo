pipeline {
	agent any 
		stages {
			stage('Compile Stage') {
				steps {
					withMaven(maven : 'Maven'){
						sh 'maven clean compile'
					}
				}
			}
			stage('Test Stage') {
				steps {
					withMaven(maven : 'Maven') {
						sh 'maven test'
					}
				}
			}
			
			stage('Deploy stage') {
				steps {
						withMaven(maven : 'Maven') {
							sh 'maven deploy'
						}
					}
			}
	}
}