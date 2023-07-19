def call(String uname, String repo, String tag ){
    sh "docker build -t ${uname}/${repo}:${tag}"
}