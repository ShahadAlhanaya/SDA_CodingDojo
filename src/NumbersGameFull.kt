import java.lang.Exception
import kotlin.random.Random

fun main(){
    var count = 0
    var userGuess : String
    var generatedNumber = Random.nextInt(11)
    println("Guess a number from 0 to 10\nYou have 3 times to guess \nIf you want to give up at any point type \"quit\" ;D")
    while (count < 3){
        try {
            print("Your guess: ")
            userGuess = readLine()!!.toString()
            if(userGuess.lowercase()==("quit")){
                println("aww :(( goodbye")
                break;
            }
            if(userGuess.toInt()<0 || userGuess.toInt()>10){
                println("guess between 0 and 10 >:O!")
                continue
            }
            if(userGuess.toInt()==generatedNumber) {
                println("You guessed it! Amazing xDDD!!!")
                break;
            }else{
                print("Wrong guess :P ")
            }
            count++
        }catch (e: Exception){
            println("only integer numbers >:(")
        }
    }
    print("game is over~ ")
    if(count>=3){
        print("the number was $generatedNumber")
    }
}