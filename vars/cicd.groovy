def gitDownload(repo)
{
 git "https://github.com/ganeshgoud43/${repo}.git"   
def Build()
{
  sh "mvn package"
}
