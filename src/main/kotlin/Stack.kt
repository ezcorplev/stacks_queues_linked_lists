interface Stack<Int> {

    fun put(e: kotlin.Int): kotlin.Int // adds element to array, returns last(top) element

    fun pop(): kotlin.Int // removes last element from array, returns new last(top) element

    fun getFirstNumber(): kotlin.Int // returns first(bottom) number

    fun getLastNumber(): kotlin.Int // returns last(top) number

}

class StackImpl<Int>: Stack<kotlin.Int> {

    private var stack: IntArray = IntArray(5)

    override fun put(e: kotlin.Int): kotlin.Int {
        stack.plus(e)
        return stack[stack.size-1]
    }

    override fun pop(): kotlin.Int {
        stack.dropLast(1)
        return stack[stack.size-1]
    }

    override fun getFirstNumber(): kotlin.Int {
        return stack[0]
    }

    override fun getLastNumber(): kotlin.Int {
        return stack[stack.size-1]
    }

}

fun main() {
    var sampleStack: StackImpl<Int> = StackImpl()
}