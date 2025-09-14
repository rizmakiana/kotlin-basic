fun main(){

    // String default behavior is nullable
    var firstName: String = "Rizky"
    // firstName = null //Error: Null can not be a value of a non-null type String

    var lastName: String? = null
    // name can be a value of a null
    lastName = "Maulana"

    println("Hello. My name is $firstName $lastName")
}