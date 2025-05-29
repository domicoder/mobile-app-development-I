val cars = arrayOf("Toyota", "Ford", "Chevrolet")

// to print it out an Array
println(java.util.Arrays.toString(cars))
// => [Toyota, Ford, Chevrolet]

val mixedArray = arrayOf("Toyota", 1, 2.0, true)

println(java.util.Arrays.toString(mixedArray))
// => [Toyota, 1, 2.0, true]

// to get the size of the array
println(mixedArray.size)
// => 4

val numbers = intArrayOf(1, 2, 3, 4, 5)

println(java.util.Arrays.toString(numbers))
// => [1, 2, 3, 4, 5]

val oceans = arrayOf("Pacific", "Atlantic", "Indian", "Arctic", "Southern")

val oddList = arrayOf(numbers, oceans, mixedArray, "newElements")

println(oddList)

