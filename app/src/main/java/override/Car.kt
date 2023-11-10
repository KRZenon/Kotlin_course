package override

class Car : Vehicle() {
    fun superStart() {
        super.start()
    }
    fun superAccelerate() {
        super.accelerate(80)
    }
    fun superStop() {
        super.start()
    }
    override fun start() {
        println("Car has started.")
    }

    override fun accelerate(speed:Int) {
        println("Car accelerate at $speed.")
    }

    override fun stop() {
        println("Car has stopped.")
    }
}