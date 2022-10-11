package activities

fun main() {
    //You are tasked to automate a school’s library.
    //Identify the items that can be borrowed in a Library.
    //After listing the different items, identify the characteristics of the items.
    //Use the proper data types.

//    println("Do you want to borrow or return a book?")
//    val response: String = readln().toString()
//    println("Enter ID Number:")
//    val idNumber: Int = readln().toInt()

    var name: String? = null
    var bookTitle: String? = null
    var needAnyHelp: String? = null


    println("Enter your name:")
    name = readLine().toString()
    println("Hi $name")
    println("Do you want to borrow a book? (Y/N)")
    bookTitle = readLine().toString()
    needAnyHelp = readLine().toString()


    if (needAnyHelp.lowercase() == "Y") {
        println("Enter book title:")

        if (bookTitle == "available") {
            println("$bookTitle")

            if (needAnyHelp.lowercase() == "n") {
                println("Don't forget I'm here...")
            }
        }
    }
}

//            }else {
//                println("Oh okay...")
//            }
//        } else {
//            println("Title of book:")
//
////        }else{
////            println("thank you very much")
//
//        }
//    }




//} val idNumber9527: Int = 9527
//    val borrowerName1: String = "Dela Cruz, Michael"
//    val bookTitle1: String = "Harry Potter"
//    val dateBorrowed1: String = "October 1, 2022"
//    val dateReturned1: String = "October 9, 2022"
//}
//
//    val idNumber9528: Int = 9528
//    val borrowerName2: String = "Villanueva, Andrew"
//    val bookTitle2: String = "21st Century Mathematics"
//    val dateBorrowed2: String = "October 2, 2022"
//    val dateReturned2: String = "October 9, 2022"
//}
//
//
//    val idNumber9529: Int = 9529
//    val borrowerName3: String = "Santos, Mikael"
//    val bookTitle3: String = "Calculus 1"
//    val dateBorrowed3: String = "October 3, 2022"
//    val dateReturned3: String = "October 9, 2022"
//
//    val idNumber9530: Int = 9530
//    val borrowerName4: String = "Uy, Kevin"
//    val bookTitle4: String = "Calculus 2"
//    val dateBorrowed4: String = "October 4, 2022"
//    val dateReturned4: String = "October 9, 2022"
//
//    val idNumber9531: Int = 9531
//    val borrowerName5: String = "Uy, Kenjie"
//    val bookTitle5: String = "Integral Calculus"
//    val dateBorrowed5: String = "October 5, 2022"
//    val dateReturned5: String = "October 9, 2022"
//
//    val idNumber9532: Int = 9532
//    val borrowerName6: String = "Park, Hoon"
//    val bookTitle6: String = "English 101"
//    val dateBorrowed6: String = "October 6, 2022"
//    val dateReturned6: String = "October 9, 2022"
//
//    val idNumber9533: Int = 9533
//    val borrowerName7: String = "Chu, Peter"
//    val bookTitle7: String = "Engineering 2"
//    val dateBorrowed7: String = "October 7, 2022"
//    val dateReturned7: String = "October 9, 2022"
//
//    val idNumber9534: Int = 9534
//    val borrowerName8: String = "Chua, Michael"
//    val bookTitle8: String = "Earth Science"
//    val dateBorrowed8: String = "October 8, 2022"
//    val dateReturned8: String = "October 9, 2022"
//
//    val idNumber9535: Int = 9535
//    val borrowerName9: String = "Go, Francis"
//    val bookTitle9: String = "Basic Algebra"
//    val dateBorrowed9: String = "October 9, 2022"
//    val dateReturned9: String = "October 10, 2022"
//
//    val idNumber9536: Int = 9536
//    val borrowerName10: String = "Tan, Alfonso"
//    val bookTitle10: String = "Business English"
//    val dateBorrowed10: String = "October 9, 2022"
//    val dateReturned10: String = "October 10, 2022"
//
//
////    var bookTitle: String = "Harry Potter"
//
//    //User options
//
//    if (response == "borrow") {
//        println("Enter book title:")
//
//    }if (response == "return") {
//        println("Enter ID Number:")
//
//    }if (idNumber9527 == 9527) {
//        println("Borrower's Name: $borrowerName1")
//        println("Book Title: $bookTitle1")
//        println("Date borrowed: $dateBorrowed1")
//        println("Date returned: $dateReturned1")
//
//    }if (idNumber9528 == 9528) {
//        println("Borrower's Name: $borrowerName2")
//        println("Book Title: $bookTitle2")
//        println("Date borrowed: $dateBorrowed2")
//        println("Date returned: $dateReturned2")
//    }else{
//        println("Borrrow a book")
//    }
//


