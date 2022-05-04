package Exercicio_01

class Quadrado:Geometrica {
    override var raio: Double = 0.0
    override var base:Double = 0.0
        get() = field
    override var altura:Double = 0.0
        get() = field

    override fun calculoArea(){
        println("Valor base: ")
        base = readln().toDouble()
        println("Valor altura: ")
        altura = readln().toDouble()

        var resultado = base * altura

        println("Resultado a area de quadrado é: $resultado")
    }

}