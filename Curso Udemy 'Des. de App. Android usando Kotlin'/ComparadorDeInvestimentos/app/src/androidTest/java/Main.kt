/*
Ana e Paula são duas programadoras da empresa XDM. A empresa XDM possui um benefício para incentivar os funcionários a pouparem
dinheiro para a aposentadoria que funciona da seguinte maneira:
Se o funcionário destinar 5% do seu salário para o investimento, a empresa acrescenta o mesmo valor.
Ou seja, caso o funcionário invista 100 reais, a empresa investe mais 100. Esse funco de investimento possui rendimento de 0,2% ao mês.

Ana adorou a ideia e vai investir. Paula decidiu que vai investir os mesmos 5% por conta própria já que conhece investimentos que rendem mais que 0,2% ao mês.
Paula vai escolher investimentos que rendem 0,8 ao mês. Considere o salário de Ana e Paula iguais e no valor de 10 mil reais e que as duas estão começando
com saldo 0 e que investirão 5% do salário.
Em quantos meses o patrimônio de Paula vai superar o patrimônio de Ana?
*/

fun exercicio(){
    val porcaoInvestidaFuncionario : Float = 0.05f
    val porcaoInvestidaEmpresa : Float = porcaoInvestidaFuncionario * 2
    val rendimentoEmpresa : Float = 1.002f
    val rendimentoParalelo : Float = 1.008f
    val salario : Float = 10000f
    var patrimonioAna : Float = 0f
    var patrimonioPaula : Float = 0f
    var quantidadeDeMeses : Int = 0

    while(patrimonioPaula <= patrimonioAna){
        println("Quantidade de meses passados: $quantidadeDeMeses")
        patrimonioAna *= rendimentoEmpresa
        patrimonioAna += salario * porcaoInvestidaEmpresa
        patrimonioPaula *= rendimentoParalelo
        patrimonioPaula += salario * porcaoInvestidaFuncionario
        println("Patrimônio Ana: R$ $patrimonioAna")
        println("Patrimônio Paula: R$ $patrimonioPaula")
        quantidadeDeMeses++
    }
}

fun main(){
    exercicio()
}