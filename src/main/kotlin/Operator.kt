fun main(){
    var x = 10;
    var y = 2

    println("aritmatika operator")
    println(x + y) // tambah hasilnya adalah 12
    println(x - y) // kurang hasilnya adalah 8
    println(x * y) // kali hasilnya adalah 20
    println(x / y) // bagi hasilnya adalah 5
    println(x % y) // modulo hasilnya adalah 0

    println("increment and decrement")
    println(x++) // hasilanya adalah 10, karena operasi dilakukan setelah println
    println(y--) // hasilnya adalah 2, karena operasi dilakukan setelah println
    println()

    println(++x) // increment hasilnya 12, karena operasi dilakukan sebelum println
    println(--y) // decrement hasilnya 0, karena operasi dilakukan sebelum println

    println("comparator")
    println(x == y) // operator perbandingan sama dengan. hasil false
    println(x != y) // operator perbandingan tidak sama dengan. hasil true
    println(x > y)  // operator perbandingan lebih besar dari. hasil true
    println(x < y)  // operator perbandingan lebih kecil dari. hasil false
    println(x >= y) // operator perbandingan lebih besar sama dengan. hasil true
    println(x <= y) // operator perbandingan lebih kecil sama dengan. hasil false

    println("logical operator")
    println((10 == 10) && (1 == 1)) // operator and. return true if both statements are true. true
    println((10 == 10) && (1 == 2)) // operator and. return true if both statements are true. false

    println((10 == 10) || (1 == 1)) // operator or. return true if one of statements are true
    println((10 == 10) || (1 == 2)) // operator or. return true if one of statements are true

    println("Negasi / Not")
    println(!(10 == 10))

}