package interfaces

class Vehicle : CanGo, CanStop {
    override val name: String
        get() = "Ferrari"

    override fun stop() {
        println("vehicle can stop.")
    }
}