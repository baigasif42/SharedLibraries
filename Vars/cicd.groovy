def newDownload(repo)
{
  git "https://github.com/intelliqittrainings/ ${repo}.git"
}
def newBuild()
{
  sh 'mvn package'
}
def newDeploy(Jobname,IP,appname)
{
  sh "scp /var/lib/jenkins/workspace/${Jobname}/webapp/target/webapp.war  unbuntu@${IP}:/var/lib/tomcat9/webapps/${appname}.war"
}
def runSelenium(Jobname)
{
  sh "java -jar /var/lib/jenkins/workspace/${Jobname}/testing.jar"
}
def newDelivery(Jobname,IP,appname)
{
  sh "scp /var/lib/jenkins/workspace/${Jobname}/webapp/target/webapp.war  unbuntu@${IP}:/var/lib/tomcat9/webapps/${appname}.war"
}
