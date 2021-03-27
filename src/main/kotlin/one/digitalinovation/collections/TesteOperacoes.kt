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

    println("-------------")

    println(salarios.count{it in 2000.0 .. 5000.0}) //contar a quantidade de elemendos dentro do range

    println("-------------")

    println(salarios.find{it == 4839.2}) // conta a quantidade de elementos com valor igual ao definido
    println(salarios.find{it == 2000.0})

    println("-------------")

    println(salarios.any{it == 4839.2})//procura se a expressão é verdadeira
    println(salarios.any{it == 2000.0})

}