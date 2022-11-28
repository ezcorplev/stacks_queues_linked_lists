

//data class Node<T: Any> (
//    var value: T,
//    var next: Node<T>? = null
//) {
//    override fun toString(): String {
//        return if (next != null) {
//            "$value -> ${next.toString()}"
//        }
//    }
//}
class LinkedList {
    private inner class Node(
        var first: Any?,
        var next: Node?,

        ) { init {
        println("$first -> ${next?.first}")
    }
    }
    private var start: Node? = null

    fun add(index: Int, value: Any?) {
        require (index == 0)
        start = Node(value, start)
    }
}


fun main() {
    val linkedList = LinkedList()
    linkedList.add(0, 1)
    linkedList.add(0,2)
    linkedList.add(0,3)
    linkedList.add(0,4)
    linkedList.add(0,5)


}

// 1001 1002 1003
// 0000 0001 -> 1
// 0000 0010 -> 2
// 0000 0011 -> 3
// 0000 0101 -> 5

//println(array)
//array[2] 1000 + (2 * 4)

// array (1, 2, 3, 4) ->
// 1000 1004 1008 1012 1016 1020
//  1    2    3    4        "BLA"