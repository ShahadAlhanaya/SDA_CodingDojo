fun main(){

    print("Enter first integer number: ")
    val firstNumber = verifyNumber(readLine().toString())
    println("$firstNumber ")

    println("Addition\t\t\t\t+\nSubtraction\t\t\t\t-\nMultiplication\t\t\t*\nDivision\t\t\t\t/\nModulo\t\t\t\t\t%")
    print("Enter one of the above operators: ")
    val operator = verifyOperator(readLine().toString())
    println("$firstNumber $operator")

    print("Enter second integer number: ")
    val secondNumber = verifyNumber(readLine().toString())

    val result : Float = when(operator){
        "+" -> add(firstNumber,secondNumber)
        "-" -> subtract(firstNumber,secondNumber)
        "*" -> multiply(firstNumber,secondNumber)
        "/" -> divide(firstNumber,secondNumber)
        "%" -> mod(firstNumber,secondNumber)
        else -> add(firstNumber,secondNumber)
    }
    println("$firstNumber $operator $secondNumber = $result")

}

fun verifyNumber(number: String): Int{
    return try {
        number.toInt()
    }catch (e: Exception){
        0
    }
}

fun verifyOperator(operator: String): String{
    return if(operator == "/" || operator == "+" || operator == "-" || operator == "*" || operator =="%"){
        operator
    }else "+"
}

fun add(firstNumber: Int, secondNumber: Int):Float{
    return firstNumber.toFloat() + secondNumber.toFloat()
}
fun subtract(firstNumber: Int, secondNumber: Int):Float{
    return firstNumber.toFloat() - secondNumber.toFloat()
}
fun multiply(firstNumber: Int, secondNumber: Int):Float{
    return firstNumber.toFloat() * secondNumber.toFloat()
}
fun divide(firstNumber: Int, secondNumber: Int):Float{
    return try {
        firstNumber.toFloat() / secondNumber.toFloat()
    }catch (e: Exception){
        0f
    }
}
fun mod(firstNumber: Int, secondNumber: Int):Float{
    return firstNumber.toFloat() % secondNumber.toFloat()
}