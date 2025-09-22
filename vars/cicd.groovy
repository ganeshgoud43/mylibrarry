def gitDownload(repo)
{
 git "https://github.com//${repo}.git"
}
def Build()
{
  sh "mvn package"
}
