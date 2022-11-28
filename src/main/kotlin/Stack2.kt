
class Stack2(

    private val stack2: IntArray

    ) {
    fun put(e: Int): Int {

        val newStackSize = stack2.size+1 // intArray size is plus 1 because we are adding one element (5 elements, index 0-4) = 5
        val newStack = IntArray(newStackSize) // new intArray is now (0, 0, 0, 0, 0)
        for ((count, int) in stack2.withIndex()) { // new intArray is now (1, 2, 3, 4, 0)
            newStack[count] = int
        }

        newStack[newStack.size-1] = e // new intArray is now (1, 2, 3, 4, 5)

        return newStack[newStack.size-1]
    }

    fun pop(): Int {
        stack2.dropLast(1)
        return stack2[stack2.size-1]
    }

    fun getFirstNumber(): Int {
        return stack2[0]
    }

    fun getLastNumber(): Int {
        return stack2[stack2.size-1]
    }
}

fun main() {
    val stack = Stack2(intArrayOf(1, 2, 3, 4)) // 3
    stack.put(5)
    stack.pop()
    stack.getFirstNumber()
    stack.getLastNumber()
    println(stack)
}



