package OrientaçãoAObjetos.Testes

import OrientaçãoAObjetos.Analista
import OrientaçãoAObjetos.Funcionario
import OrientaçãoAObjetos.Gerente

fun main(){
    //instanciando a classe
    val luciana = Gerente(nome = "Luciana", cpf = "123.123.123-12", salario = 5000.0, senha = "12345")

    ImprimeRelatorioFuncionario.imprime(luciana)

    TesteAutenticacao().autentica(luciana)
}
