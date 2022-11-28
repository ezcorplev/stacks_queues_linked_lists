
class Node2(
    var value: Int,
    var next: Node2?
) {
    fun addHeadNode(value: Int) { // this adds a node at the start(head) of the list (2, (1, (0, null)))
        var newNode = Node2(0, null) // (0 -> null)
//        newNode = Node2(e, newNode) // (1 -> 0) -> (0 -> null)
        newNode.value = value
        newNode.next = newNode
        println("${newNode.value} -> ${newNode.next?.value}")
    }

    fun addTailNode() { // this adds a node at the end (tail) of the list, pointing to null



    }

    fun addNodeAfterValue() {

    }
}

fun main() {
    var linkedList = Node2(0, null)
    linkedList.addHeadNode(1)
    linkedList.addHeadNode(2)
    linkedList.addHeadNode(3)

}



