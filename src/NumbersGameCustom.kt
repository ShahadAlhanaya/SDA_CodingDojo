import java.lang.Exception
import kotlin.random.Random

fun main(){
    var userNumber1 = 0
    var userNumber2 = 0
    var userGuess = 0
    var userNumber1isInt = false;
    var userNumber2isInt = false;
    var generatedNumber = Random.nextInt(11)
    var result = 0

    while (!userNumber1isInt) {
        try {
            print("Enter your first number: ")
            userNumber1 = readLine()!!.toInt()
            userNumber1isInt = true
        } catch (e: Exception) {
            println("Only integer numbers >:(")
        }
    }
    while (!userNumber2isInt) {
        try {
            print("Enter your first number: ")
            userNumber2 = readLine()!!.toInt()
            userNumber2isInt = true
        } catch (e: Exception) {
            println("Only integer numbers >:(")
        }
    }
    result = userNumber1*generatedNumber*userNumber2
    println("$userNumber1 * X * $userNumber2 = $result ")
    print("What is the value of X? ")

    try {
        userGuess = readLine()!!.toInt()
        if(userGuess == generatedNumber) {
            println("Correct! xD Good job")
        }else{
            println("Wrong :(( the answer is $generatedNumber")
        }
    } catch (e: Exception) {
        println("Wrong! Only integer numbers >:(")
    }
    print("game is over")

}