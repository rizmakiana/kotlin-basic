fun main(){
    val score = 78

    println("If Condition")
    if (score > 75){
        println("Kamu Lulus")
    }

    println("If Else")
    if (score > 80) {
        println("Nilai anda bagus")
    } else {
        println("Nilai anda b aja")
    }

    println("\nElse If")
    var grade: Char;
    if (score > 90){
        grade = 'A'
    } else if (score > 80){
        grade = 'B'
    } else{
        grade = 'C'
    }
    println("Grade kamu $grade")
}