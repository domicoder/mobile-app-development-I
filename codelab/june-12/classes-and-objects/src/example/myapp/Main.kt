package example.myapp

import example.myapp.abstractclasses.Plecostomus
import example.myapp.abstractclasses.Shark
import example.myapp.decor.makeDecorations

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 80
    myAquarium.printSize()
    val aquariumBeta = Aquarium(height = 56, length = 160)
//    aquariumBeta.volume = 900 => Kotlin: Cannot access 'volume': it is private in 'example/myapp/Aquarium'.
    aquariumBeta.printSize()

//    using secondary constructor
    println("Using secondary constructor...")
    val aquariumTrench = Aquarium(numberOfFish = 30)
    aquariumTrench.printSize()
    val volume = aquariumTrench.width * aquariumTrench.length * aquariumTrench.height / 1000
    println("Volume: $volume l.")

//    (5) Learn about subclasses and inheritance
    val myTowerTank = TowerTank(diameter = 25, height = 40)
    myTowerTank.printSize()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main() {
    buildAquarium()
    makeFish()
    makeDecorations()
}
