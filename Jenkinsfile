pipeline{
   agent any
   tools {
       maven 'M3'
       jdk 'JAVA 8'
   }
   stages {
       stage('Preparation'){
           steps {
	      
	      echo 'preparation'
	         
	   }    
     
        }
	stage('Build') {
	   steps {
	      echo 'Clean Build'
	      bat 'mvn clean package'
	   
	   }	
	}
	stage('Test') {
	   steps {
	      echo 'Testing'
	      bat 'mvn test'	   
	   }	
	}
	stage('JaCoCo') {
	   steps {
	      echo 'Code Coverage'
	      jacoco()
	   }	
	}
	stage('Sonar'){
	   steps {
	      echo 'Sonar Scanner'

	   
	   }
	}
	stage('Package'){
	   steps {
	      echo 'Packaging'
	      bat 'mvn package -DskipTests'
	   
	   }
	
	}
	stage('Deploy'){
	   steps {
	     echo 'Deployment'
	   
	   }
	
	}
   }
}

