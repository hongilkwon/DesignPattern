package creational.builder


class Car internal constructor (
    private val brand: String = "",
    private val model: String = "",

    private var color: String = "",
    private var tire: String = "",
    private var navigation: String? = null,
    private var seatCover: String = ""
){
    override fun toString(): String {
        return "Car(brand='$brand', model='$model', color='$color', tire='$tire', navigation=$navigation, seatCover='$seatCover')"
    }
}



