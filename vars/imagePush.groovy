def call(String uname, String repo, String tag ){
    def image = "${uname}/${repo}:${tag}"
    // This step should not normally be used in your script. Consult the inline help for details.
    withDockerRegistry(credentialsId: 'Docker_creds', url: 'https://index.docker.io/v1/') {
    image.push()
}
}