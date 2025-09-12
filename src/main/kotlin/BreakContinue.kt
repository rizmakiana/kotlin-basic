fun main(){

    var i = 0;

    println("Continue statement")
    while (i < 10){
        if (i == 5){
            i++
            continue
        }
        println("Hallo ke-$i")
        i++
    }

    println("\nBreak Statement")
    do {
        if (i == 5){
            break
        }
        println("Hallo ke-$i")
        i--
    } while (i > 0)
}