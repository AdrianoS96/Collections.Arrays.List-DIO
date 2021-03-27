package one.digitalinovation.collections

fun main() {
    val joao = Funcionario("João", 2974.7)
    val pedro= Funcionario("Pedro", 6732.7)
    val maria = Funcionario("Maria", 4278.3)

    val funcionarios = listOf(joao, pedro, maria)
    funcionarios.forEach{ println(it)}

    println("---------------------")

    println(funcionarios.find{it.nome == "Maria"})

}


data class Funcionario(
    val nome: String,
    val salario: Double
    ){
    override fun toString(): String = """
        Nome:    $nome
        Salário: $salario
    """.trimIndent()
}