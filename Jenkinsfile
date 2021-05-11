node
{
    stage('SCM Checkout')
    {
        git branch: 'main', credentialsId: 'JasonKZhuang', url: 'https://github.com/JasonKZhuang/JenkinsExample.git'
    }
    
    stage('MVN package')
    {
       bat 'mvn clean package'
    }
    
    stage('Build Docker Image')
    {
    	bat 'docker build -t '
    }
}
