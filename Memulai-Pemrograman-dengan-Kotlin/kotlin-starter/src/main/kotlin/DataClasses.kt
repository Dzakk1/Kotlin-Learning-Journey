class User(val name : String, val age : Int) {
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}


data class DataUser(val name : String, val age : Int)

fun main(){
    val user = User("nrohmen", 17)
    val dataUser = DataUser("Dzaky", 21)
    val dataUser2 = DataUser("Dzaky", 21)
    val dataUser3 = DataUser("dimas", 24)
    val dataUser4 = dataUser.copy(age = 99)

    println(user)
    println(dataUser)
    println(dataUser.equals(dataUser2)) // equals
    println(dataUser.equals(dataUser3))
    println(dataUser4)
}