def call(String name){
   // if (repository == "Docker"){
    sh "docker build -t ${name} ."
   // }
    // else{
    // sh "docker build -t ${uname}.dkr.ecr.${region}.amazonaws.com/${repo}:${tag} ."
    // }
}