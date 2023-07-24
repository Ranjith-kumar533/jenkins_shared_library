def call(String uname, String repo, String tag, String repository, String region ){
   
     if (repository == "Docker"){
     sh """
     docker rmi ${tag}:latest
     docker rmi ${uname}/${repo}:${tag}
     """
    }
    else{
    sh """
    docker rmi ${tag}:latest
    docker rmi ${uname}.dkr.ecr.${region}.amazonaws.com/${repo}:${tag}
    """
    }
}