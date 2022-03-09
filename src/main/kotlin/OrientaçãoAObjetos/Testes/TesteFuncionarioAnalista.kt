package OrientaçãoAObjetos.Testes

import OrientaçãoAObjetos.Analista
import OrientaçãoAObjetos.Funcionario
import OrientaçãoAObjetos.Testes.ImprimeRelatorioFuncionario.Companion.imprime

fun main() {
    //instanciando a classe
    val vinicius = Analista(nome = "Vinicius", cpf = "123.123.123-12", salario = 5000.0)

    ImprimeRelatorioFuncionario.imprime(vinicius)
}

