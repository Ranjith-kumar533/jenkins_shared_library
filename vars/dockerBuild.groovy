def call(String uname, String repo, String tag , String repository, String region){
    if (repository == "Docker"){
    sh "docker build -t ${uname}/${repo}:${tag} ."
    }
    else{
    sh """
      aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${uname}.dkr.ecr.${region}.amazonaws.com
      docker build -t ${uname}.dkr.ecr.${region}.amazonaws.com/${repo}:${tag} .
    """
    }
}