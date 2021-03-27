package one.digitalinovation.collections

fun main() {

    val salarios = doubleArrayOf(1932.3, 4839.2, 8092.4)

    for(salario in salarios){
        println(salario)
    }

    println("-------------")
    println("Maior salário: ${salarios.max()}")
    println("Menor salário: ${salarios.min()}")
    println("Média salarial: ${salarios.average()}")

    println("-------------")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    salariosMaiorQue2500.forEach{ println(it)}
}