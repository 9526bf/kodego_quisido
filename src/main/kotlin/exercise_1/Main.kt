fun main() {
    println("Enter position:")
    var desiredPosition: String = readln()
    println("Desired salary:")
    var desiredSalary: Int = readln().toInt()
    println("Date available to work:")
    var dateAvailableEvent: String = readln()
    println("Last name:")
    var lastName: String = readln()
    println("First name:")
    var firstName: String = readln()
    println("Middle name:")
    var middleName: String = readln()
    println("Address: Enter city")
    var address: String = readln()
    println("State")
    var state: String = readln()
    println("Zip")
    var zip: Int = readln().toInt()
    println("Homephone")
    var homePhone: Int = readln().toInt()
    println("Cell phone")
    var cellPhone: Long = readln().toLong()
    println("Email address:")
    var emailAddress: String = readln()
    println("Social Security Number")
    var socialSecurityNumber: Long = readln().toLong()
    println("Are you a US citizen?:")
    var nationality: String = readln().toString()
    println("Have you ever been convicted to a felony?")
    val convicted: Boolean = readln().toBoolean()
    println("If selected for employment are you willing to a pre-employment drug testing?")
    val willing: Boolean = readln().toBoolean()

}