package one.digitalinovation.collections

fun main() {

    val joao = Funcionario("João", 2974.7, "CLT")
    val pedro= Funcionario("Pedro", 6732.7,"PJ")
    val maria = Funcionario("Maria", 4278.3, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))

}