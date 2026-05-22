pipeline {
    agent none
    environment {
        PLUGIN_NAME = "com.cdsoftware.lirion.structure"
        PLUGIN_DEPENDENCY_1 = "com.cdsoftware.payroll"
        PLUGIN_DEPENDENCY_2 = "com.cdsoftware.act"
        PLUGIN_DEPENDENCY_3 = "com.cdsoftware.pluginconfig"
        PLUGIN_DEPENDENCY_4 = "org.globalqss.idempiere.LCO.detailednames"
        IDEMPIERE_VERSION = "12.0.0"
    }
    stages {
        stage('Compile') {
            agent {
                docker {
                     image 'carl0jgr/idempiere-source-builder:12'
                     args '--entrypoint=\'\' -u root:root -v /var/jenkins_home/.m2:/root/.m2'              
                  }
            }
            steps {
                dir ('d1'){
                    checkout scmGit(branches: [[name: '*/12.0.0']], extensions: [], userRemoteConfigs: [[credentialsId: 'jenkins', url: 'git@bitbucket.org:cdsoftware/com.cdsoftware.payroll.git']])                        
                }  
                dir ('d2'){
                    checkout scmGit(branches: [[name: '*/12.0.0']], extensions: [], userRemoteConfigs: [[credentialsId: 'jenkins', url: 'git@bitbucket.org:cdsoftware/com.cdsoftware.act.git']])                           
                }  
                dir ('d3'){
                     checkout scmGit(branches: [[name: '*/12.0.0']], extensions: [], userRemoteConfigs: [[credentialsId: 'jenkins', url: 'git@bitbucket.org:cdsoftware/com.cdsoftware.pluginconfig.git']])                             
                }   
                dir ('d4'){
                checkout scmGit(branches: [[name: '*/12.0.0']], extensions: [], userRemoteConfigs: [[credentialsId: 'jenkins', url: 'git@bitbucket.org:cdsoftware/globalqss-idempiere-lco.git']])                           
                }                                                                
                dir('target-platform') {
                    git branch: '10', url: 'https://github.com/ingeint/idempiere-target-platform-plugin.git'
					sh './plugin-builder build ../${PLUGIN_NAME} ../d1/${PLUGIN_DEPENDENCY_1} ../d2/${PLUGIN_DEPENDENCY_2} ../d3/${PLUGIN_DEPENDENCY_3} ../d4/${PLUGIN_DEPENDENCY_4}'
                    archiveArtifacts artifacts: "target/${PLUGIN_NAME}-${IDEMPIERE_VERSION}.${BUILD_NUMBER}.jar", fingerprint: true
                    sh 'rm -rf target ../${PLUGIN_NAME}/target '
                }
            }
        }
    }
}
