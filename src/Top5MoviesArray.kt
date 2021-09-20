fun main(){

    val moviesArray = arrayOf("","","","","")

    println("Enter your top favorite 5 movies")
    for(i in 1..5){
        print("movie $i: ")
        moviesArray[i-1]= readLine().toString()
    }

    println("Your favorite movies are:")
    for(movie in moviesArray){
        println("  -$movie")
    }

}