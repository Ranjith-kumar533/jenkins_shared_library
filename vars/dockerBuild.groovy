def call(String uname, String repo, string tag ){
    sh "docker build -t ${uname}/${repo}:${tag}"
}