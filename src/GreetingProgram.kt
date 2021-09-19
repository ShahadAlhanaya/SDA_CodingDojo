fun main(){
    var helloUserMsg = "Hello user, welcome to my program!"
    print("Enter your name:  ")
    val name = readLine().toString()
    println("Hello $name, welcome to my program")
    println(helloUserMsg.replace("user",name))
}