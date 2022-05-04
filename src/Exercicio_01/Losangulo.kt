package Exercicio_01

class Losangulo() :Geometrica {
    override var base: Double=0.0
    override var altura: Double=0.0
    override var raio: Double=0.0
    override fun calculoArea() {
        println("Valor base: ")
        base = readln().toDouble()
        println("Valor altura: ")
        altura = readln().toDouble()

        var resultado = base * altura
        var areaTotal = resultado / 2

        println("Resultado a area de losangulo é: $areaTotal")
    }

}