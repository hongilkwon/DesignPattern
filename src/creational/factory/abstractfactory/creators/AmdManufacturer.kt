package creational.factory.abstractfactory.creators


import creational.factory.abstractfactory.products.AmdCpu
import creational.factory.abstractfactory.products.AmdGpu
import creational.factory.abstractfactory.products.CPU
import creational.factory.abstractfactory.products.GPU

class AmdManufacturer : Company() {
    override fun createCPU(): CPU = AmdCpu()

    override fun createGPU(): GPU = AmdGpu()
}

