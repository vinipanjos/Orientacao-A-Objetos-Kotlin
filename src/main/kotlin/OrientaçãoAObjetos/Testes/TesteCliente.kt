package OrientaçãoAObjetos.Testes

import OrientaçãoAObjetos.Cliente
import OrientaçãoAObjetos.ClienteTipo

fun main() {
    val victor = Cliente(
        nome = "Victor",
        cpf = "123.999.555-22",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(victor.toString())

    TesteAutenticacao().autentica(victor)

}