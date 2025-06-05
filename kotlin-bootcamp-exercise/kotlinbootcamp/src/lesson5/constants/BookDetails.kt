
fun main(args: Array<String>) {

    val newBook = Book()

    println("I can borrow more book :- ${newBook.canBorrow(10)}")
    println("I can borrow more book :- ${newBook.canBorrow(5)}")

    newBook.printUrl("TheNewOneMinuteManager")

}