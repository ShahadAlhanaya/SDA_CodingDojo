import kotlin.random.Random

class Country(val name: String, val capital: String) {
    fun print() {
        println("Capital of $name is $capital")
    }
}

fun main() {

    while (true){
        val countriesList = random3Countries()
        var points = 0
        println("<<---Guess countries capital cities--->>")
        for(i in 1..3){
            print("\t($i) ${countriesList[i-1].name}: ")
            if(countriesList[i-1].capital.lowercase() == readLine()!!.lowercase()){
                points++
                println("✓ Correct Answer. ")
            }else{
                print("✗ Wrong Answer. ")
                countriesList[i-1].print()
            }
        }

        println("\n${message(points)} You got $points out of 3.")
        print("Do you want to guess again (y/n)? ")
        if(readLine()!!.lowercase() == "y"){
            println()
            continue;
        }else{
            println("<<---Game Over--->>")
            break;
        }

    }



}
fun message(points: Int): String{
    return when(points){
        0 -> "\uD83D\uDE2C try again?"
        1 -> "Maybe try again \uD83E\uDD14."
        2 -> "\uD83D\uDE0F Not bad!"
        3 -> "Oh wow!! \uD83D\uDE0E"
        else -> "\uD83E\uDD2B"
    }
}

fun random3Countries():ArrayList<Country>{

    val countries = listOf<Country>(
        Country("Saudi Arabia", "Riyadh"),
        Country("Russia", "Moscow"),
        Country("Hungary", "Budapest"),
        Country("China", "Beijing"),
        Country("Japan", "Tokyo"),
        Country("Nigeria", "Abuja"),
        Country("Ireland", "Dublin"),
        Country("United Kingdom", "London"),
        Country("Austria", "Vienna"),
        Country("South Korea", "Seoul"),
    )
    val random3Countries = arrayListOf<Country>()
    var count = 0;
    while (count < 3) {
        val random = Random.nextInt(9)
        if (!random3Countries.contains(countries[random])) {
            random3Countries.add(countries[random])
            count++
        }
        else{
            continue
        }
    }
    return random3Countries
}