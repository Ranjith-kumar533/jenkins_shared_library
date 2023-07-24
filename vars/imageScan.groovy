def call(String uname, String repo, String tag, String repository, String region){
    if (repository = "Docker"){
    sh "trivy image ${uname}/${repo}:${tag} > imagescanreport.txt"
    }
    else{
    sh "trivy image ${uname}.dkr.ecr.${region}.amazonaws.com/${repo}:${tag} > imagescanreport.txt"
    }
}