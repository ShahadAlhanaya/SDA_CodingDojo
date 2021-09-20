fun main(){

    val favoriteMovies =  arrayListOf<String>()
    var stop = false
    var count = 0
    println("Enter 3 of your favorite movies")
    for(i in 1..3){
        count++
        print("movie $count: ")
        favoriteMovies.add(readLine().toString())

    }

    while(!stop) {
        print("Do you want to add more favorite movies (y/n)? ")
        val userInput =readLine().toString().lowercase()
        if (userInput == "y"){
            count++
            print("movie $count: ")
            favoriteMovies.add(readLine().toString())
        }else if (userInput == "n"){
            stop = true;
        } else {
            println("invalid input")
        }
    }

    println("Your favorite movies are:")
    for(movie in favoriteMovies){
        println("  -$movie")
    }
}