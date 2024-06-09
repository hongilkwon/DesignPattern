package creational.factory.abstractfactory.creators

import creational.factory.abstractfactory.products.*

class NvidiaManufacturer : Company() {
    override fun createCPU(): CPU = NvidiaCpu()

    override fun createGPU(): GPU = NvidiaGpu()
}

