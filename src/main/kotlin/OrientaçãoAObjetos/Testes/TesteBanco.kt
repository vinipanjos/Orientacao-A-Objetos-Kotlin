package OrientaçãoAObjetos.Testes

import OrientaçãoAObjetos.Banco

fun main() {
    val viniBank = Banco(nome= "viniBank",num= 22)

    println("${viniBank.nome} e ${viniBank.num}")
    //alterando um dado a partir de uma copia
    val viniBank2 = viniBank.copy(nome="viníBank")
    println("\"${viniBank2.nome} e ${viniBank2.num}\"")
}