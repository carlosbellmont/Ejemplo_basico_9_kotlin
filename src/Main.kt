
fun main() {
    val a = ClasePadre()
    val b = ClaseHija()
    // No se puede ya que ClasePadre es abstracto
    // val c = ClasePadreAbstracto()
    val d = ClaseHijaAbstracta()
    val e = ClaseImplementaInterfaz()
}


open class ClasePadre {
    val atributoPadre = 1
}

class ClaseHija : ClasePadre() {
    val atributoHijo = 1
}


abstract class ClasePadreAbstracto {
    val atributoPadre = 1
    abstract fun funAbstracta()
}

class ClaseHijaAbstracta : ClasePadreAbstracto() {
    val atributoHijo = 1
    override fun funAbstracta() {
        println("Soy funAbstracta")
    }
}

interface MyInterface {
    fun funInterface()
}

class ClaseImplementaInterfaz : MyInterface{
    override fun funInterface() {
        println("Soy funInterface")
    }
}