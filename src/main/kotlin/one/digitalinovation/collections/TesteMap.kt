package one.digitalinovation.collections

fun main() {

    val pair: Pair<String , Double> = Pair("João", 1234.4)
    val map1 = mapOf(pair)
    map1.forEach{(k, v) -> println("Chave: $k - Valor: $v")}

    val map2 = mapOf("Pedro" to 2341.4,
                     "Maria" to 4322.9)

    println("-----------------------------------")

map2.forEach{(k, v) -> println("Chave: $k - Valor: $v")}
}