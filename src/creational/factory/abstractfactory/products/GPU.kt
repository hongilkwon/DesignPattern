package creational.factory.abstractfactory.products


interface GPU {
    fun assembleGPU()
}

class NvidiaGpu : GPU {
    override fun assembleGPU() {
        // business logic relevant to Amd
        println("nvidiaGpu assembled")
    }
}

class AmdGpu : GPU {
    override fun assembleGPU() {
        // business logic relevant to Amd
        println("amdGpu assembled")
    }
}