val school = arrayOf("shark", "salmon", "minnow")

for (element in school) {
  print(element + ", ")
}

for ((index, element) in school.withIndex()) {
  println("Item at $index is $element\n")
}


for (i in 10..50) print(i)

var coins = 0
while (coins < 50) {
    coins++
}
println("$coins coins in the table\n")

do {
  coins--
} while (coins > 50)
println("$coins coins in the table\n")

repeat(2) {
     println("A person is doing his homework")
}