package example.myapp.abstractclasses

abstract class AquariumFish : FishAction {
    abstract val color: String
    override fun eat() = println("yum")
}

interface FishAction  {
    fun eat()
}