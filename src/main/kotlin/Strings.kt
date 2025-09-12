fun main(){
    val name = "Zahra Hanifa";

    println(name[0])    // return Z
    println(name[5])    // return " "
    println(name.length)    // return name length

    println(name.uppercase())
    println(name.lowercase())

    println("\ncomparing string")
    val txt1 = "Hello, World!"
    val txt2 = "Hello, World!"
    println(txt1 == txt2)
    println(txt1.equals(txt2))

    println("\nString concat")
    val firstName = "Zahra"
    val lastName = "Hanifa"
    val fullName = firstName.plus(lastName)
    println("Full name = " + fullName)

    println("\nString template")
    println("Full name = $fullName")
}
