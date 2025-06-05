
class Book {

    companion object {
        const val BASE_URL = "https://www.bookstore.com/books/all/"
    }

    fun canBorrow(books: Int): Boolean {
        return books < BOOKS_BORROW_LIMIT
    }

    fun printUrl(bookTitle: String) {
        println("Book-URL :- ${BASE_URL.plus(bookTitle).plus(".html")}")
    }
}