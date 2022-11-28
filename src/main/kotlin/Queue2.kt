class Queue2(

    private var queue2: IntArray

) {
    fun put(e: Int) { // this puts e at the end of the array so (1, 2, 3, 4) -> (1, 2, 3, 4, 5)
        if (queue2.isEmpty()) { // if the array is empty, need to create new array size 1 and put e inside
            val newArray = IntArray(1)
            newArray[0] = e
            println("*PUT $e IN EMPTY ARRAY*")
            println(newArray[0])
            queue2 = newArray
            return
        }
        println("*PUT $e*")
        val newArray = IntArray(queue2.size+1) // instance of a new array with size+1 for the new e (0, 0, 0, 0, 0)
        var count = 0
        for (int in queue2) { // for loop puts old array in new array by order
            newArray[count] = int
            count++
            print(int)
        } // newArray = (1, 2, 3, 4, 0)
        newArray[count] = e // (1, 2, 3, 4, 5)
        queue2 = newArray
        print(newArray[newArray.size-1])
        println("")

    }

    fun pop(): Int { // this pops an Int out of the array (FIFO) so (1, 2, 3, 4) -> (2, 3, 4), and returns the Int
        if (queue2.isEmpty()) {
            println("*ARRAY IS EMPTY, NO POPPING ALLOWED*")
            return -1
        }
        if (queue2.size == 1) {
            println("*POP*")
            val intPopped = queue2[0]
            val newArray = IntArray(0)
            queue2 = newArray
            println("")
            println(intPopped)
            println("*ARRAY IS NOW EMPTY*")
            println("")
            return -1

        }
        println("*POP*")
        val newArray = IntArray(queue2.size-1) // one less in the newArray (0, 0, 0)
        var count = 0
        val intPopped = queue2[0]
        for (int in queue2[1]..queue2[queue2.size-1]) { // this loop skips the first element
            newArray[count] = int
            count++
            print(int)
        } // newArray = (2, 3, 4)
        queue2 = newArray
        println("")
        println(intPopped)
        println("")
        return intPopped

    }
}

fun main() {

    val array = Queue2(intArrayOf())
    array.put(5)
    array.put(6)
    array.pop()
    array.pop()
    array.pop()
    array.pop()
    array.pop()
    array.pop()


}