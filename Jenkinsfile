pipeline {
    agent none
    environment {
        PLUGIN_NAME = "com.cdsoftware.lirion.structure"
        PLUGIN_DEPENDENCY_1 = "com.cdsoftware.payroll"
        PLUGIN_DEPENDENCY_2 = "com.cdsoftware.act"
        PLUGIN_DEPENDENCY_3 = "com.cdsoftware.pluginconfig"
        PLUGIN_DEPENDENCY_4 = "org.globalqss.idempiere.LCO.detailednames"
        IDEMPIERE_VERSION = "10.0.0"
    }
    stages {
        stage('Compile') {
            agent {
                docker {
                    image 'idempiereofficial/idempiere:source-release-10.0'
                    args '-u root:root'               
                  }
            }
            steps {
                dir ('d1'){
                    checkout scmGit(branches: [[name: '*/10.0.0']], extensions: [], userRemoteConfigs: [[credentialsId: 'bitbucket', url: 'git@bitbucket.org:cdsoftware/com.cdsoftware.lirion.payroll.git']])                        
                }  
                dir ('d2'){
                    checkout scmGit(branches: [[name: '*/10.0.0']], extensions: [], userRemoteConfigs: [[credentialsId: 'bitbucket', url: 'git@bitbucket.org:cdsoftware/com.cdsoftware.lirion.act.git']])                           
                }  
                dir ('d3'){
                     checkout scmGit(branches: [[name: '*/10.0.0']], extensions: [], userRemoteConfigs: [[credentialsId: 'bitbucket', url: 'git@bitbucket.org:cdsoftware/com.cdsoftware.lirion.pluginconfig.git']])                             
                }   
                dir ('d4'){
                    git branch: '10.0.0', url: 'https://github.com/egil0902/globalqss-idempiere-lco.git'             
                }                                                                
                dir('target-platform') {
                    git branch: '10', url: 'https://github.com/ingeint/idempiere-target-platform-plugin.git'
					sh './plugin-builder build ../${PLUGIN_NAME} ../${PLUGIN_NAME}.test ../d1/${PLUGIN_DEPENDENCY_1} ../d2/${PLUGIN_DEPENDENCY_2} ../d3/${PLUGIN_DEPENDENCY_3} ../d4/${PLUGIN_DEPENDENCY_4}'
                    archiveArtifacts artifacts: "target/${PLUGIN_NAME}-${IDEMPIERE_VERSION}.${BUILD_NUMBER}.jar", fingerprint: true
                    sh 'rm -rf target ../${PLUGIN_NAME}/target ../${PLUGIN_NAME}.test/target'
                }
            }
        }
    }
}
