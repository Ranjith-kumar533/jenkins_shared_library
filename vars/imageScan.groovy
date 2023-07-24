def call(String name){
    sh "trivy image ${name}:latest > imagescanreport.txt"
}