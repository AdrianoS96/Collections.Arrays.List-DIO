package one.digitalinovation.collections

fun main() {

    val joao = Funcionario("João", 2974.7, "CLT")
    val pedro= Funcionario("Pedro", 6732.7,"PJ")
    val maria = Funcionario("Maria", 4278.3, "CLT")

    println("--------- LIST ---------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{println(it)}

    println("------------------------")
    funcionarios.add(pedro)
    funcionarios.forEach{println(it)}

    println("------------------------")
    funcionarios.remove(joao)
    funcionarios.forEach{println(it)}

    println("---------  SET ---------")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach{println(it)}

    println("------------------------")
    funcionariosSet.add(joao)
    funcionariosSet.add(pedro)
    funcionariosSet.forEach{println(it)}

}
