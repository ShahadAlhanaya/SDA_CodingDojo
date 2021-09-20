fun main(){

    val countryCapitalArrayList = arrayListOf<ArrayList<String>>()

    println("Enter 3 countries and their capital cities")
    for(i in 1..3) {
        print("($i) Country: ")
        val country = readLine().toString()
        print("    Capital: ")
        val capital = readLine().toString()
        countryCapitalArrayList.add(ArrayList(arrayListOf(country, capital)))
    }

    println("==============================================")
    for (i in 1..countryCapitalArrayList.size){
        println("Capital of ${countryCapitalArrayList[i-1][0]} is ${countryCapitalArrayList[i-1][1]}")
    }

}