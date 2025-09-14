fun main(){

    var name: String? = "Rizky Maulana"
    // name = null
    val length = name?.length ?: 0

    println("$name have a $length character")

}