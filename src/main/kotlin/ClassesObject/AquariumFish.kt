package ClassesObject


// next interface delegation
//abstract class AquariumFish {
//
//    abstract val color: String
//
//}

interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color = "gold"
}

interface FishAction {

    fun eat()
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

class Shark : FishColor, FishAction {
    override val color: String = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor): FishColor by fishColor,
    FishAction by PrintingFishAction("eat algae") {

}