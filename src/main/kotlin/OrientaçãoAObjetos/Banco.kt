package OrientaçãoAObjetos

data class Banco(
    val nome:String,
    val num: Int
){
    fun info() = "$nome e $num"
}