import java.lang.Exception

fun main(){
    var userGuess : Int
    val secretNumber = 8
    print("Guess a number between 0 and 10: ")
    try {
        userGuess = readLine()!!.toInt()
        if(userGuess>10 || userGuess<0){
            println("Wrong! it is between 0 and 10!!")

        }else{
            if(userGuess == secretNumber){
                println("Correct ! you got it xD!")
            }else{
                println("Wrong guess :P")
            }
        }
    }catch (e: Exception){
        print("only integer numbers >:(!")
    }
    print("~ game over ~")
}