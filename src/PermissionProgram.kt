fun main(){
    val minAge = 21
    var age : Int
    print("Enter your age: ")
    try {
        age = readLine()!!.toInt()
        if(age>=minAge){
            println("You're old enough :D")
        }else{
            println("Sorry, you're not old enough D:")
        }
    }catch (e: Exception){
        print("your age is a number >:(")
    }
}