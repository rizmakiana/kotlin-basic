fun main(){
    var name = "Rizky"; // kotlin will assign string to this variable
    val pi = 3.14159; // kotlin will assign double to this variable

    println(name);
    println(pi);

    name = "Maulana";
    // pi = 3.14150; // val cannot be modifed because val is final/constant variable

    println(name);
    println(pi);
}