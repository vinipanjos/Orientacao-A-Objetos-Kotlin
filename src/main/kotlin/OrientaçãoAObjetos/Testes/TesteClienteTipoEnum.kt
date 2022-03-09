package OrientaçãoAObjetos.Testes

import OrientaçãoAObjetos.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { println("${it.name} - ${it.descricao}")    }

    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.descricao}")
    val pj = ClienteTipo.PJ
    println("${pj.name} - ${pj.descricao}")
}