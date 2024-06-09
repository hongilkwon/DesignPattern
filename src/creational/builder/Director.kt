package creational.builder

class Director {
    companion object{
        fun buildBasicAvante(builder: CarBuilder): Car=
            builder
                .model("Avante")
                .color("White")
                .tire("NoBrand")
                .navigation(null)
                .seatCover("Leatherette")
                .build()

        fun buildFullOptionAvante(builder: CarBuilder): Car=
            builder
                .model("Avante")
                .color("White")
                .tire("KumHO")
                .navigation("inavi")
                .seatCover("High-quality calfskin")
                .build()
    }
}