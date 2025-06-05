
class Book(val title: String, val author: String, val year: Int) {

    fun getTitleAuthorPair(): Pair<String, String> {
        return (title to author)
    }

    fun getTitleAuthorYearTriple(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}