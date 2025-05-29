val fruits = listOf("apple", "banana", "cherry")

println("Fruits $fruits")

for (fruit in fruits) {
  println(fruit)
}

// you can also use the index
for (index in fruits.indices) {
  println("${fruits[index]} is at index $index")
}

val fishesList = mutableListOf("goldfish", "clownfish", "catfish")

val res: Boolean = fishesList.remove("goldfish")

println("Goldfish removed in the list \"fishesList\" $res")