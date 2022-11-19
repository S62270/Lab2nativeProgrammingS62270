//Activity 4
//3: Define and use variables
fun main() {
    val count: Int = 2
    println(count)
}

fun main() {
    val count: Int = 2
    println("You have count unread messages.")
}

fun main() {
    val count: Int = 2
    println("You have $count unread messages.")
}

fun main() {
    val count: Int = 10
    println("You have $count unread messages.")
}

//mathematical operation
fun main() {
    val unreadCount = 5
    val readCount = 100
    println("You have ${unreadCount + readCount} total messages in your inbox.")
}

fun main() {
    val numberOfPhotos = 100
    val photosDeleted = 10
    println("$numberOfPhotos photos")
    println("$photosDeleted photos deleted")
    println("${numberOfPhotos - photosDeleted} photos left")
}

//4: update variables
fun main() {
    var cartTotal = 0
    cartTotal = 20
    println("Total: $cartTotal")
}


fun main() {
    val count: Int = 10
    println("You have $count unread messages.")
}

//increment count=count+1
fun main() {
    var count = 10
    println("You have $count unread messages.")
    count = count + 1
    println("You have $count unread messages.")
}

//increment count++
fun main() {
    var count = 10
    println("You have $count unread messages.")
    count++
    println("You have $count unread messages.")
}

//decrement count--
fun main() {
    var count = 10
    println("You have $count unread messages.")
    count--
    println("You have $count unread messages.")
}
// Explore other datatype
//double
fun main() {
    val trip1 = 3.20
    val trip2 = 4.10
    val trip3 = 1.72
    val totalTripLength = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")
}

//string
fun main() {
    val nextMeeting = "Next meeting is: "
    val date = "January 1"
    val reminder = nextMeeting + date + " at work"
    println(reminder)
}

//display the ""
fun main() {
    println("Say \"hello\"")
}
//output
    //Say "hello"

//boolean
fun main() {
    val notificationsEnabled: Boolean = false
    println("Are notifications enabled? " + notificationsEnabled)
}

//comments
/**
 * This program displays the number of messages
 * in the user's inbox.
 */
fun main() {
    // Create a variable for the number of unread messages.
    var count = 10
    println("You have $count unread messages.")

    // Decrease the number of messages by 1.
    count--
    println("You have $count unread messages.")
}