package one.digitalinovation.collections

fun main() {
    val joao = Funcionario("João", 2974.7, "CLT")
    val pedro= Funcionario("Pedro", 6732.7,"PJ")
    val maria = Funcionario("Maria", 4278.3, "CLT")

    val funcionarios = listOf(joao, pedro, maria)
    funcionarios.forEach{ println(it)}

    println("---------------------")

    println(funcionarios.find{it.nome == "Maria"})

    println("---------------------")

    funcionarios.sortedBy { it.salario }//organiza os elementos com base no item escolhido
        .forEach{println(it)}

    println("---------------------")

    funcionarios.groupBy { it.tipoContratacao }//separa os itens por grupo especificado
        .forEach{println(it)}



}


data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
    ){
    override fun toString(): String = """
        Nome:    $nome
        Salário: $salario
    """.trimIndent()
}