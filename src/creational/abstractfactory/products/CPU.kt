package creational.abstractfactory.products

interface CPU {
    fun assembleCPU()
}

class NvidiaCpu : CPU {
    override fun assembleCPU() {
        // business logic relevant to Amd
        println("nvidiaCpu assembled")
    }
}

class AmdCpu : CPU {
    override fun assembleCPU() {
        // business logic relevant to Amd
        println("amdCpu assembled")
    }
}