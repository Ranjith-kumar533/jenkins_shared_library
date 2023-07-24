def call(String uname, String repo, String tag, String region ){
   sh "docker push ${uname}.dkr.ecr.${region}.amazonaws.com/${repo}:${tag}"
}
}