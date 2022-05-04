package Exercicio_01

class Triangulo() : Geometrica {
    override var raio: Double = 0.0
    override var base:Double = 0.0
        get() = field
    override var altura:Double = 0.0
        get() = field
    override fun calculoArea() {
        println("Valor base: ")
        base = readln().toDouble()
        println("Valor altura: ")
        altura = readln().toDouble()

        var resultado = base * altura
        var areaTotal = resultado / 2

        println("Resultado a area de triângulo é: $areaTotal")
    }
}