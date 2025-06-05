
open class Book(var title: String,var author: String) {

    private var currentPage = 0

    open fun readPage() {
        currentPage++
    }
}

class Ebook(title: String, author: String, var format: String = "text") : Book(title, author) {

    private var wordsRead = 0

    override fun readPage() {
        wordsRead += 250
    }
}