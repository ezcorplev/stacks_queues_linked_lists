
class Queue(

    private var queue: IntArray

    ) {
    fun put(e: Int): Int {

        val newQueueSize = queue.size+1 // intArray size is plus 1 because we are adding one element (5 elements, index 0-4) = 5
        val newQueue = IntArray(newQueueSize) // new intArray is now (0, 0, 0, 0, 0)
        newQueue[0] = e // new intArray is now (5, 0, 0, 0, 0)
        var count = 1
        for (int in queue) { // (5, 1, 0, 0, 0) /// (5, 1, 2, 0, 0) ///...
            newQueue[count] = int
            count++
        }
        queue = newQueue
        println("PUT $e")
        for (i in queue) print(i)
        println()
        return queue[0] // .also { println(newQueue.toString()) }
    }

    fun pop(): Int {
        println("*")
        for (i in queue) print(i)
        println()
        println("POP ${queue[0]}")
        queue = queue.copyOfRange(1, queue.size)
        for (i in queue) print(i)
        println()
        println(queue[0])
        return queue[0]
    }

    fun getFirstNumber(): Int {
        println("GET FIRST ${queue[0]}")
        println(queue[0])
        return queue[0]
    }

    fun getLastNumber(): Int {
        println("GET LAST ${queue[queue.size-1]}")
        println(queue[queue.size-1])
        return queue[queue.size-1]
    }
}

fun main() {
    val queue = Queue(intArrayOf(1, 2, 3, 4)) // size = 4, index 0..3
    queue.put(5) // (5, 1, 2, 3, 4)
    queue.put(6) // (6, 5, 1, 2, 3, 4)
    queue.pop()
    queue.getFirstNumber()
    queue.getLastNumber()
}



