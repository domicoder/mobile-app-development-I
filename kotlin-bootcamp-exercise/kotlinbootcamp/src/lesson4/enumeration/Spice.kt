
fun main(args: Array<String>) {

    val curry = Curry("curry", "spicy")
    println("Curry has color ${curry.color}")

}

sealed class Spice(val spiceName: String, val spiciness: String = "mild",
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
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

enum class Color(val rgb: Int) {
    GREEN(0x00FF00), BLUE(0x0000FF), RED(0xFF0000), YELLOW(0xFFFF00);
}