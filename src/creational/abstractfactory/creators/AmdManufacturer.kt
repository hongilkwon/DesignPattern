package creational.abstractfactory.creators


import creational.abstractfactory.products.AmdCpu
import creational.abstractfactory.products.AmdGpu
import creational.abstractfactory.products.CPU
import creational.abstractfactory.products.GPU

class AmdManufacturer : Company() {
    override fun createCPU(): CPU = AmdCpu()

    override fun createGPU(): GPU = AmdGpu()
}

