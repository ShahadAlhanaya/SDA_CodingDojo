fun main() {
    var firstNumber: Int
    var secondNumber: Int

    while (true) {

        print("Enter your first number: ")
        firstNumber = verifyUserInput(readLine()!!.toString())
        print("Enter your second number: ")
        secondNumber = verifyUserInput(readLine()!!.toString())

        println("$firstNumber + $secondNumber = ${sumNumbers(firstNumber, secondNumber)}")

        print("Would you like to add more numbers? (y/n) >> ")
        if(!calculateAgain(readLine()!!.toString())){
            print("Finished")
            break
        }

    }
}

fun verifyUserInput(userInput: String): Int {
    var integer = 0
    try {
        integer = Integer.parseInt(userInput)
    } catch (e: Exception) {
        return integer
    }
    return integer
}

fun sumNumbers(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun calculateAgain(userInput: String): Boolean {
    if (userInput.lowercase() == "y") {
        return true
    }
    return false
}