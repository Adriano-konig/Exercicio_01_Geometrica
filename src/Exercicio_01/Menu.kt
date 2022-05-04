package Exercicio_01

import kotlin.system.exitProcess

class Menu {
    var opcao:Int=0
    fun exibirOpcao() {
        for (i:Int in 0..opcao ) {
            println(
                "Qual geometrica gostaria fazer calculo?\n" +
                        "[1] -> Quadrado\n" +
                        "[2] -> Triangulo\n" +
                        "[3] -> Circulo\n" +
                        "[4] -> Retangulo\n" +
                        "[5] -> Losangulo\n" +
                        "[6] -> Sair\n"
            )
            opcao = readln().toInt()

        if (opcao == 1){
            Quadrado().calculoArea()
        }else if (opcao == 2){
            Triangulo().calculoArea()
        }else if (opcao == 3){
            Circulo().calculoArea()
        }else if(opcao == 4){
            Retangulo().calculoArea()
        }else if(opcao == 5){
            Losangulo().calculoArea()
        }else if(opcao == 6){
            println("Encerrado com sucesso")
            exitProcess(0)
        }else{
            println("Opção inválido!!!")
        }
            exibirOpcao()
        }
    }
}