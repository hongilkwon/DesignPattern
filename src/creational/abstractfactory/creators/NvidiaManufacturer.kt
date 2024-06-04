package creational.abstractfactory.creators

import creational.abstractfactory.products.*

class NvidiaManufacturer : Company() {
    override fun createCPU(): CPU = NvidiaCpu()

    override fun createGPU(): GPU = NvidiaGpu()
}

