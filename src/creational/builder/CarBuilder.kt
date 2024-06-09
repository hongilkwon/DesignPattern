package creational.builder

interface CarBuilder {
    fun model(model: String): CarBuilder

    fun color(color: String): CarBuilder

    fun tire(tire: String): CarBuilder

    fun navigation(navigation: String? = null): CarBuilder

    fun seatCover(seatCover: String): CarBuilder

    fun build(): Car
}