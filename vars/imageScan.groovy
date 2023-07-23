def call(String uname, String repo, String tag ){
    sh "trivy image ${uname}/${repo}:${tag} > imagescanreport.txt"
}