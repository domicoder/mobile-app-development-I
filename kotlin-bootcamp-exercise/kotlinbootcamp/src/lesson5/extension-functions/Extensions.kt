
fun Book.getBookWeight(): Double {
    return pages * 1.5
}

fun Book.tornPages(tornPages: Int) {
    if (pages >= tornPages) pages -= tornPages else pages = 0
}