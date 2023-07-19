def call(creds){
    
       waitForQualityGate abortPipeline: false, credentialsId: creds
    
}