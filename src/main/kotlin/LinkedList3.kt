
data class Node3 (
    var value: Int,
    var next: Node3?
) {
    override fun toString(): String {
        return if (next != null) {
            "$value -> ${next.toString()}"
        } else {
            "$value"
        }
    }
}

class LinkedList3 {
    var head: Node3? = null
    var tail: Node3? = null
    var size = 0

    fun addAtHead(value: Int) {

//        if (size > 1) {
//
//        }
//
//        if (size == 1) {
//            head = Node3(value, tail)
//            println("${this.head?.value} -> ${this.head?.next?.value}")
//            size++ // now list.size = 2
//            return
//        }
//
//        if (size == 0) { // if the list is empty we want to set up the head and tail as the input Node
//            head = Node3(value, null)
//            tail = head
//            println("${this.head?.value} -> ${this.head?.next?.value}")
//            size++ // now list.size = 1
//            return
//        }

        head = Node3(value, head)
        size++

        if (tail == null) tail = head

    }

    fun addAtTail(value: Int) {

        if (size == 0) addAtHead(value) // adding at tail is equal to adding at head

        val newNode = Node3(value, null) // create a new node to be the tail node
        tail?.next = newNode // set the old tail node to point to the new tail node (using .next)
        tail = newNode // set the newNode as the new tail
        size++ // increase size again

    }
    // 1, 2, 3, 4
    // 10, 16, 22, 7
    // 2.5 -> 3 // 2.5.next = 2.next
    // 2 -> 2.5

    fun addNodeAfterValue(value: Int, newValue: Int): Node3? {

        var currentNode = head
        var currentValue = head?.value

        while (currentNode != null && currentValue != value) { // while currentNode isnt null (end of list) and while
            currentNode = currentNode.next // iterating through the nodes
            currentValue = currentNode?.value // iterating through the node values
        }

        val newNode = Node3(newValue, currentNode?.next)
        currentNode?.next = newNode
        size++

//        fun insertNode(afterNode: Node3? = currentNode, afterValue: Int? = currentValue) {
//            val newNode = Node3(newValue, afterNode?.next) // created a new Node with the newValue, and it points to the next node
//            afterNode?.next = newNode // and now afterNode.next points to newNode
//        }

        return currentNode // we found the value and the currentNode is the node holding that value
    }
}

// val newNode = (newValue, null) // (15, null)
// currentNode = (3, -> 2 -> 1 -> 11)
// currentValue = 3
// newNode.next = currentNode.next // 15.next = 2 -> 1 -> 11
// currentNode.next = newNode // 3.next = (15, 2 -> 1 -> 11)



fun main() {
    var linkedList = LinkedList3() // this is our empty linkedList
    linkedList.addAtHead(1)
    linkedList.addAtHead(2)
    linkedList.addAtHead(3)
    linkedList.addAtHead(4)
    linkedList.addAtTail(11) // 4 -> 3 -> 2 -> 1 -> 11
    linkedList.addNodeAfterValue(3, 15) // 4 -> 3 -> 15 -> 2 -> 1 -> 11
    linkedList.addNodeAfterValue(4, 16) // 4 -> 16 -> 3 -> 15 -> 2 -> 1 -> 11



}




