def call(String uname, String repo, String tag ){
    sh 'docker rmi ${uname}/${repo}:${tag}'
}