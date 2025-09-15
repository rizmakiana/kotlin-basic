fun main(){
    print("Masukan nama anda : ")
    var name = readln();

    println("Hello, $name")

    print("Enter first number : ")
    var first = readln()

    print("Enter second number : ")
    var second = readln()

    var firstNumber = first.toInt()
    var secondNumber = second.toInt()

    println("$firstNumber add $secondNumber equal ${firstNumber + secondNumber}")

}