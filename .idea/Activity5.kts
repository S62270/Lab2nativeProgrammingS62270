//Activity 5:
//2: Define and Call a function
fun main() {
    birthdayGreeting()
}

fun birthdayGreeting() {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}

//3: Return a Value From a Function
fun main() {
    val greeting = birthdayGreeting()
    println(greeting)
}
fun birthdayGreeting(): String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

//4: Adding Parameter To The birthdayGreeting() Function
fun main() {

    println(birthdayGreeting("Rover"))
    println(birthdayGreeting("Rex"))
}
fun birthdayGreeting(name: String): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

//5: Function With Multiple Parameters
fun main() {
    println(birthdayGreeting("Rover", 5))
    println(birthdayGreeting("Rex", 2))
}
fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

//6: Named Arguments
fun main() {
    println(birthdayGreeting(name = "Rover", age = 5))
    println(birthdayGreeting(age = 2, name = "Rex"))
}
fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

//question 7: Default Arguments
fun main() {
    println(birthdayGreeting(age = 5))
    println(birthdayGreeting("Rex", 2))
}
fun birthdayGreeting(name: String = "Rover", age: Int): String {
    return "Happy Birthday, $name! You are now $age years old!"
}
