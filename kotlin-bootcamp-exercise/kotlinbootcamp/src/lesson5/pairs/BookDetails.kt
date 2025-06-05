
fun main(args: Array<String>) {

    val book = Book("The New One Minute Manager",
            "Kenneth Hartley Blanchard & Spencer Johnson", 2009)

    val titleAuthorPair = book.getTitleAuthorPair()
    val titleAuthorYearTriple = book.getTitleAuthorYearTriple()

    println("The book ${titleAuthorPair.first} is written by ${titleAuthorPair.second}.")

    println("The book ${titleAuthorYearTriple.first} is written by ${titleAuthorYearTriple.second} " +
            "in ${titleAuthorYearTriple.third}.")
}