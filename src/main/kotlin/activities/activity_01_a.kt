package activities

fun main() {
    /*You are tasked to create a directory of the students taking this course.
    The data will be used to send updates regarding the classes.
    There is also a need to know the progress of the students during the progress of this course.
    List down all data that can be used to implement this. Use the proper data types.*/

    println("Enter control number: ")
    val studentControlNumber: Int = readln().toInt()

//Student1
    var studentControlNumber9526: Int = 9526
    val lastName1 = "Johnson"
    val firstName1: String = "David"
    val middleName1: String = "Ford"
    val dateOfBirth1: String = "March 9, 1974"
    val address1: String = "Iloilo City"
    val mobileNumber1: Long = 9812685178
    val classAndSection1: String = "Mobile App Development - MD2P"

    var score1Week1 = 90
    var score1Week2 = 91
    var score1Week3 = 92
    var score1Week4 = 89

    var score1: Int = 90 + 91 + 92 + 89 / 4
    var grade1: Double = 90.5

//Student 2
    var studentControlNumber9527: Int = 9527
    var lastName2: String = "Parkinson"
    var firstName2: String = "Matthew"
    var middleName2: String = "Jackson"
    var dateOfBirth2: String = "July 29, 1984"
    var address2: String = "Quezon City"
    var mobileNumber2: Long = 9567766918
    var classAndSection2: String = "Mobile App Development - MD2P"

    var score2Week1 = 89
    var score2Week2 = 88
    var score2Week3 = 91
    var score2Week4 = 89

    var score2: Int = 90 + 91 + 92 + 89 / 4
    var grade2: Double = 89.25

//Student 3
    var studentControlNumber9528: Int = 9528
    var lastName3: String = "Collins"
    var firstName3: String = "Simon"
    var middleName3: String = "Monroe"
    var dateOfBirth3: String = "July 2, 1986"
    var address3: String = "Cebu City"
    var mobileNumber3: Long = 9213685178
    var classAndSection3: String = "Mobile App Development - MD2P"

    var score3Week1 = 89
    var score3Week2 = 88
    var score3Week3 = 91
    var score3Week4 = 90

//Student 4
    var studentControlNumber9529: Int = 9529
    var lastName4: String = "Jefferson"
    var firstName4: String = "Jay"
    var middleName4: String = "Jones"
    var dateOfBirth4: String = "April 2, 1985"
    var address4: String = "Davao City"
    var mobileNumber4: Long = 9367329568
    var classAndSection4: String = "Mobile App Development - MD2P"

    var score4Week1 = 91
    var score4Week2 = 89
    var score4Week3 = 87
    var score4Week4 = 92

//Student 5
    var studentControlNumber9530: Int = 9530
    var lastName5: String = "Monroe"
    var firstName5: String = "Marilyn"
    var middleName5: String = "Joe"
    var dateOfBirth5: String = "April 27, 1980"
    var address5: String = "Valenzuela City"
    var mobileNumber5: Long = 9394186347
    var classAndSection5: String = "Mobile App Development - MD2P"

    var score5Week1 = 73
    var score5Week2 = 74
    var score5Week3 = 75
    var score5Week4 = 76

    var studentControlNumberRange = 9526..9530

    if (studentControlNumber == 9526) {
        println("Control Number: $studentControlNumber")
        println("Full name: $lastName1, $firstName1 $middleName1")
        println("Date of birth: $dateOfBirth1")
        println("Address: $address1")
        println("Mobile number: $mobileNumber1")
        println("Class and section: $classAndSection1")
        println("grade: $grade1")

        if (studentControlNumber == 9527) {
            println("Control Number: $studentControlNumber")
            println("Full name: $lastName2, $firstName2 $middleName2")
            println("Date of birth: $dateOfBirth2")
            println("Address: $address2")
            println("Mobile number: $mobileNumber2")
            println("Class and section: $classAndSection2")
            println("grade: $grade2")

        }
    }
}










