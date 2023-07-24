def call(String uname, String repo, String tag , String repository, String region){
    if (repository == "Docker"){
    sh "docker build -t ${uname}/${repo}:${tag} ."
    }
    else{
    sh "docker build -t ${uname}.dkr.ecr.${region}.amazonaws.com/${repo}:${tag} ."
    }
}