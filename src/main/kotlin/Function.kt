fun main(){

    sayHello()
    sayHello("Zahra")
    println(kotlinHello())
    val number = 10
    val isEven = isEven(number);
    println("$number is Even = $isEven")

}

// function without parameter and without return value
fun sayHello(){
    println("Hello, World!")
}

// function with parameter and without return value
fun sayHello(name: String){
    println("Hello, $name!")
}

// function without parameter and with return values
fun kotlinHello(): String{
    return "Hello, Kotlin!"
}

// function with parameter and return value
fun isEven(x: Int): Boolean{
    return  x % 2 == 0
}

