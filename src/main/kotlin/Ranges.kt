fun main(){

    println("Basic")
    for (i in 0..5){
        println("Hallo ke-$i")
    }

    println("\nStep")
    for (i in 0 until 10 step 2){
        println("Hallo ke-$i")
    }
}