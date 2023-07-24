def call(String uname, String repo, String tag, String region ){

   sh """
   aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${uname}.dkr.ecr.${region}.amazonaws.com
   docker tag ${tag}:latest ${uname}.dkr.ecr.${region}.amazonaws.com/${repo}:${tag}
   docker push ${uname}.dkr.ecr.${region}.amazonaws.com/${repo}:${tag}
   """
}
