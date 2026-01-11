//NOT FULLY UNDERSTOOD
class Booklet(val totalPages:Int):Iterable<Int>{
    override fun iterator():Iterator<Int>{
        return object: Iterator<Int> {
            var current=1
            override fun hasNext()=current<=totalPages
            override fun next()=current++
        }
    }
}

fun main(){
    val booklet1=Booklet(3)
    for(page in booklet1){
        println("Reading page $page")
    }
}