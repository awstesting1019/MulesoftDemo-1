pipeline {

agent any

stages {

stage('Build Application') {

steps {

sh 'mvn clean install'

}

}

stage('Test') {

steps {

echo 'Application in Testing Phase…'

sh 'mvn test'

}

}

stage('Deploy CloudHub') {

environment {

ANYPOINT_CREDENTIALS = credentials('anypointPlatform')

}

steps {

echo 'Deploying mule project due to the latest code commit…'

echo 'Deploying to the configured environment….'

sh 'mvn package deploy -DmuleDeploy -Dusername=awstesting1019A -Dpassword=Dallas2022@ -DworkerType=Micro -Dworkers=1 -Dregion=us-west-2'

}

}

}

}
