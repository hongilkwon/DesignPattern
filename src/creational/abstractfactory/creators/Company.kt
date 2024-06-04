package creational.abstractfactory.creators

import creational.abstractfactory.products.CPU
import creational.abstractfactory.products.GPU


abstract class Company {
    fun assembleCPU(): CPU {
        val cpu = createCPU()
        cpu.assembleCPU()
        return cpu
    }

    protected abstract fun createCPU(): CPU

    fun assembleGPU(): GPU {
        val gpu = createGPU()
        gpu.assembleGPU()
        return gpu
    }

    protected abstract fun createGPU(): GPU
}

