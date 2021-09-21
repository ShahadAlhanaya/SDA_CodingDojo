fun main(){

    val countryCapitals = mutableMapOf<String,String>()

    println("Enter 3 countries and their capital cities")
    for(i in 1..3) {
        print("($i) Country: ")
        val country = readLine().toString()
        print("    Capital: ")
        val capital = readLine().toString()

        countryCapitals[country] = capital
    }


    println("==============================================")
    for (pair in countryCapitals){
        println("Capital of ${pair.key} is ${pair.value}")
    }

}