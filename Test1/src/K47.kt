fun main(){
    val localFileSize=1200
    val remoteFileSize=1200
    val message=when{
        localFileSize > remoteFileSize -> "Local file is larger"
        localFileSize < remoteFileSize -> "Local file is smaller"
        else->"local and remote files are of same size"
    }
    print(message)
}