fun main() {
    getStarted()
}

fun getStarted() {
    println("Hello World")
    // Hello World
    
    // 2. Learn about operators and types
    println(2+2.plus(4))
    // 8
    println(1+1)
    // ⇒ res8: kotlin.Int = 2
    println(6.0*50.0)
    // ⇒ res14: kotlin.Double = 300.0
    println(6.0*50)
    // ⇒ res15: kotlin.Double = 300.0
    println(2.times(3))
    // ⇒ res5: kotlin.Int = 6
    println(3.5.plus(4))
    // ⇒ res8: kotlin.Double = 7.5
    println(2.4.div(2))
    // ⇒ res9: kotlin.Double = 1.2
    
    // Step 2: Practice using types
    // println(XX)
    val tempY: Int = 6
    val tempX = tempY.toByte()
    println("tempX => $tempX")
    // 6
    
    val b2: Byte = 1
    // val i1: Int = b2
    // val i2: String = b2
   	// val i3: Double = b2
    // ⇒ error: type mismatch: inferred type is Byte but Double was expected
    
    val i4: Int = b2.toInt()
    println("i4 => $i4")
    
    val i5: String = b2.toString()
    println("i5 => $i5")


    val i6: Double = b2.toDouble()
    println("i6 => $i6")

    val oneMillion = 1_000_000
    println("oneMillion => $oneMillion")
    
    // Next class
    // Step 3: Learn the value of variable types
    var fish = 1
    fish = 2
    // val aquarium = 1
    // aquarium = 2 // ==> Error: error: val cannot be reassigned
}

