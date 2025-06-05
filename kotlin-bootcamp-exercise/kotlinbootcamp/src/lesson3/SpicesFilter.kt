
fun main(args: Array<String>) {

  val spiceList = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")

  println(spiceList.filter { it.contains("curry") }.sortedBy { it.length })

  println(spiceList.filter { it.startsWith('c') }.filter { it.endsWith('e') })

  println(spiceList.filter { it.startsWith('c') && it.endsWith('e') })

  println(spiceList.take(3).filter { it.startsWith('c') })

}