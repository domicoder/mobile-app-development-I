
fun main(args: Array<String>) {

    val curry = Curry("curry", "spicy")
    println("Curry has color ${curry.color}")
}

abstract class Spice(val spiceName: String, val spiciness: String = "mild",
                     color: SpiceColor = YellowSpiceColor) : SpiceColor by color {
    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) :
        Spice(name, spiciness, color), Grinder {
    override fun grind() {
    }

    override fun prepareSpice() {
        grind()
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color = "yellow"
}