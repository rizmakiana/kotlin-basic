fun main(){
    val names = arrayOf("Zahra", "Hanifa", "Mafriandi")

    if ("Zahra" in names){
        println("Hello, Zahra!")
    } else {
        println("Hello, World!")
    }

    println("\nArray length")
    println("Array length of names is ${names.size}")

    println("\nLoop value of array")
    for (name in names){
        print("$name ")
    }

}