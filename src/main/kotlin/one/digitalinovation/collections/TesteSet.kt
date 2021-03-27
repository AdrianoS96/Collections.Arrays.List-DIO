package one.digitalinovation.collections

fun main() {

    val joao = Funcionario ("João", 3214.3, "CLT")
    val pedro = Funcionario ("Pedro", 4789.5, "CLT")
    val maria = Funcionario ("Maria", 4879.2, "PJ")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resultadoUniao = funcionarios1.union(funcionarios2)
    resultadoUniao.forEach{println(it)}

    println("------------------------")

    val funcionarios3 = setOf(joao, pedro, maria)
    val resultadoSubtracao = funcionarios3.subtract(funcionarios2)
    resultadoSubtracao.forEach { println(it) }

    println("------------------------")

    val resultadoIntercessao = funcionarios3.intersect(funcionarios2)
    resultadoIntercessao.forEach { println(it) }

}