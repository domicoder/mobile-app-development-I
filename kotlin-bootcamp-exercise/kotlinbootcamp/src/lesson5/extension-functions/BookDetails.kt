
fun main(args: Array<String>) {

    println("Weight of the book is :- ${Book().getBookWeight()}.")

    val book = Book()
    book.tornPages(2)

    println("Total page in the book after 2 pages gets torn :- ${book.pages}.")

    val puppy = Puppy()

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("${book.pages} left in book")
    }

}