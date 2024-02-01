class NovaOperacao() {

    private var operacaoSolicitada: Int = 0
    private var num1: Int = 0
    private var num2: Int = 0
    private var repetir: Int = 0

    fun inicializacao() {
        do {
            println("Digite qual operação será realizada: \n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão")
            operacaoSolicitada = readln().toInt()

            if (operacaoSolicitada in 1..4) {
                when (operacaoSolicitada) {
                    1 -> println("Operação selecionada: $operacaoSolicitada - Soma")
                    2 -> println("Operação selecionada: $operacaoSolicitada - Subtração")
                    3 -> println("Operação selecionada: $operacaoSolicitada - Multiplicação")
                    else -> println("Operação selecionada: $operacaoSolicitada - Divisão")
                }

                println("\nDigite o primeiro dígito: ")
                num1 = readln().toInt()
                println("\nDigite o segundo dígito: ")
                num2 = readln().toInt()

                print("Resultado: ")

                println(
                    when (operacaoSolicitada) {
                        1 -> num1 + num2
                        2 -> num1 - num2
                        3 -> num1 * num2
                        else -> num1 / num2
                    }
                )

            } else println("Operação não reconhecida.")

            println("\nDeseja fazer outra operação? Digite 1 para Sim")
            repetir = readln().toInt()
        } while (repetir == 1)
    }
}


fun main() {
    val novaOperacao: NovaOperacao = NovaOperacao()
    novaOperacao.inicializacao()

    //val calculos : Calculos = Calculos()
}