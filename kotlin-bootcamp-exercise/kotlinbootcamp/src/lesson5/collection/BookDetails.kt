
fun main(args: Array<String>) {

    val allBooks = setOf("A Midsummer Night's Dream", "Romeo and Juliet", "Hamlet", "Macbeth",
            "The New One Minute Manager",
            "Kenneth Hartley Blanchard & Spencer Johnson")

    val library = mapOf("William Shakespeare" to allBooks)

    println("${library.any { it.value.contains("Hamlet") }}")

    val moreBooks = mutableMapOf("The New One Minute Manager"
            to "Kenneth Hartley Blanchard & Spencer Johnson")

    moreBooks.getOrPut("The Value of Honesty") { "Spencer Johnson" }
    moreBooks.getOrPut("Know Can Do!") { "Kenneth Hartley Blanchard" }

    println(moreBooks)

}