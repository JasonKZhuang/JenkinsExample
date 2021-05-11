FROM tomcat:8
COPY target/*.war /usr/local/tomcat/webapps/JenkinsExample.war
# Added to test webhook
