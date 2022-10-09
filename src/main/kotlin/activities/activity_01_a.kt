package activities

fun main() {
    /*You are tasked to create a directory of the students taking this course.
    The data will be used to send updates regarding the classes.
    There is also a need to know the progress of the students during the progress of this course.
    List down all data that can be used to implement this. Use the proper data types.*/

    println("Enter control number: ")
    val studentControlNumber: Int = readln().toInt()

//Student1
    val studentControlNumber9526: Int = 9526
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
    val grade1: Double = 90.5

//Student 2
    val studentControlNumber9527: Int = 9527
    val lastName2: String = "Parkinson"
    val firstName2: String = "Matthew"
    val middleName2: String = "Jackson"
    val dateOfBirth2: String = "July 29, 1984"
    val address2: String = "Quezon City"
    val mobileNumber2: Long = 9567766918
    val classAndSection2: String = "Mobile App Development - MD2P"

    var score2Week1 = 89
    var score2Week2 = 88
    var score2Week3 = 91
    var score2Week4 = 89

    var score2: Int = 90 + 91 + 92 + 89 / 4
    val grade2: Double = 89.25

//Student 3
    val studentControlNumber9528: Int = 9528
    val lastName3: String = "Collins"
    val firstName3: String = "Simon"
    val middleName3: String = "Monroe"
    val dateOfBirth3: String = "July 2, 1986"
    val address3: String = "Cebu City"
    val mobileNumber3: Long = 9213685178
    val classAndSection3: String = "Mobile App Development - MD2P"

    var score3Week1 = 87
    var score3Week2 = 85
    var score3Week3 = 80
    var score3Week4 = 75

    var score3: Int = 87 + 85 + 80 + 75 / 4
    val grade3: Double = 81.75

//Student 4
    val studentControlNumber9529: Int = 9529
    val lastName4: String = "Jefferson"
    val firstName4: String = "Jay"
    val middleName4: String = "Jones"
    val dateOfBirth4: String = "April 2, 1985"
    val address4: String = "Davao City"
    val mobileNumber4: Long = 9367329568
    val classAndSection4: String = "Mobile App Development - MD2P"

    var score4Week1 = 91
    var score4Week2 = 89
    var score4Week3 = 87
    var score4Week4 = 92

    var score4: Int = 91 + 89 + 87 + 92 / 4
    val grade4: Double = 89.75


//Student 5
    val studentControlNumber9530: Int = 9530
    val lastName5: String = "Monroe"
    val firstName5: String = "Marilyn"
    val middleName5: String = "Joe"
    val dateOfBirth5: String = "April 27, 1980"
    val address5: String = "Valenzuela City"
    val mobileNumber5: Long = 9394186347
    val classAndSection5: String = "Mobile App Development - MD2P"

    var score5Week1 = 73
    var score5Week2 = 74
    var score5Week3 = 75
    var score5Week4 = 76

    var score5: Int = 73 + 74 + 75 + 76 / 4
    val grade5: Double = 74.5

   // var studentControlNumberRange = 9526..9530

    if (studentControlNumber == 9526) {
        println("Control Number: $studentControlNumber9526")
        println("Full name: $lastName1, $firstName1 $middleName1")
        println("Date of birth: $dateOfBirth1")
        println("Address: $address1")
        println("Mobile number: $mobileNumber1")
        println("Class and section: $classAndSection1")
        println("grade: $grade1")

    }
    if (studentControlNumber == 9527) {
        println("Control Number: $studentControlNumber9527")
        println("Full name: $lastName2, $firstName2 $middleName2")
        println("Date of birth: $dateOfBirth2")
        println("Address: $address2")
        println("Mobile number: $mobileNumber2")
        println("Class and section: $classAndSection2")
        println("grade: $grade2")

    }
    if (studentControlNumber == 9528) {
        println("Control Number: $studentControlNumber9528")
        println("Full name: $lastName3, $firstName3 $middleName3")
        println("Date of birth: $dateOfBirth3")
        println("Address: $address3")
        println("Mobile number: $mobileNumber3")
        println("Class and section: $classAndSection3")
        println("grade: $grade3")

    }
    if (studentControlNumber == 9529) {
        println("Control Number: $studentControlNumber9529")
        println("Full name: $lastName4, $firstName4 $middleName4")
        println("Date of birth: $dateOfBirth4")
        println("Address: $address4")
        println("Mobile number: $mobileNumber4")
        println("Class and section: $classAndSection4")
        println("grade: $grade4")
    }
    if (studentControlNumber == 9530) {
        println("Control Number: $studentControlNumber9530")
        println("Full name: $lastName5, $firstName5 $middleName5")
        println("Date of birth: $dateOfBirth5")
        println("Address: $address5")
        println("Mobile number: $mobileNumber5")
        println("Class and section: $classAndSection5")
        println("grade: $grade5")
    }
}











