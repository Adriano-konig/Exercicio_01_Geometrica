package Exercicio_01

class Circulo() : Geometrica {
    override var base:Double = 0.0
        get() = field
    override var altura:Double = 0.0
        get() = field
    override var raio:Double = 0.0
        get() = field

    override fun calculoArea() {
        println("Valor raio: ")
        raio = readln().toDouble()

        var resultadoRaio = raio * raio
        var total = 3.14 * resultadoRaio

        println("Resultado a area de circulo é: $total")
    }
}