package one.digitalinovation.collections

fun main() {

    val salarios = DoubleArray(3)

    salarios[0] = 2000.0
    salarios[1] = 1500.0
    salarios[2] = 2340.0

    salarios.forEach { println(it) }

    println("---------------------")
    //faz a alteração nos valores atravéz do index
    salarios.forEachIndexed{index , salario ->
        salarios[index] = salario * 1.1
    }

    salarios.forEach { println(it) }

    println("---------------------")

    val salarios2 = doubleArrayOf(2345.0, 3456.9, 4321.7)
    salarios.sort()
    salarios2.forEach { println(it) }

}