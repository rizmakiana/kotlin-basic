fun main(){

    val day = 4;

    val result = when (day){
        1 -> "Senin"
        2 -> "Selasa"
        3 -> "Rabu"
        4 -> "Kamis"
        5 -> "Jum'at"
        6 -> "Sabtu"
        7 -> "Minggu"
        else -> "Invalid"
    }

    println("Hari ke-$day adalah hari $result")
}