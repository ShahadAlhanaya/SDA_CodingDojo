fun main(){

    val countriesList = listOf<String>("Saudi Arabia", "Russia","Hungary")
    val countiresArrayList = arrayListOf<String>()

    println("Enter capital city of the following countries:")
    for (i in 1..3){
        print("($i) ${countriesList[i-1]}: ")
        countiresArrayList.add(readLine().toString())
    }

    println("==============================================")
    for(i in 1..3){
        println("($i) Capital of ${countriesList[i-1]} is ${countiresArrayList[i-1]} ")
    }

}