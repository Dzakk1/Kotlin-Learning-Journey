import kotlin.random.Random

fun main(){

    // TIPE DATA
    val nama : String = "Arif"
    var umur = 17

    val firstWord = "Dicoding"
    val lastWord = "Academy"

    var vocal = 'A'

    val text = "Kotlin"
    val firstChar = text[0]


    println("Hello $nama Umur Saya $umur ")
    println(firstWord + lastWord)

    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)

    println("First Character of $text is $firstChar")

    for (char in text) {
        println("$char ")
    }

    // IF EXPRESSION
    val openhours = 7
    val now = 7
    val office : String
    office = if (now > 7) {
        "Office already open"
    } else if (now == openhours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    println(office)

    // END EXPRESSION
    val officeOpen = 7
    val officeClosed = 16
    val now1 = 20

    val isOpen = if (now1 >= officeOpen && now1 <= officeClosed){
        true
    } else {
        false
    }

    println("Office is open : $isOpen")

    fun getRegisterNumber() = Random.nextInt(100)

    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }


    // FOR
    val ranges = 1..5
    for (i in ranges) {
        println("value is $i")
    }

}