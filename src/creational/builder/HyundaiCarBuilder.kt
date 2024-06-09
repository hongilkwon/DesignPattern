package creational.builder


class HyundaiCarBuilder(): CarBuilder {

    private val brand: String = "hyundai"
    private var model: String = ""

    private var color: String = "white"
    private var tire: String = "hankook"
    private var navigation: String? = null
    private var seatCover: String = "Leatherette"

    override fun model(model: String): CarBuilder {
        this.model = model
        return this
    }

    override fun color(color: String): CarBuilder {
        this.color = color
        return this
    }

    override fun tire(tire: String): CarBuilder {
        this.tire = tire
        return this
    }

    override fun navigation(navigation: String?): CarBuilder {
        this.navigation = navigation
        return this
    }

    override fun seatCover(seatCover: String): CarBuilder {
        this.seatCover = seatCover
        return this
    }

    override fun build(): Car {
        return Car(brand, model, color, tire, navigation, seatCover)
    }
}

