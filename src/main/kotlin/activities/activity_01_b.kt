package activities

fun main() {
    //You are tasked to automate a school’s library.
    //Identify the items that can be borrowed in a Library.
    //After listing the different items, identify the characteristics of the items.
    //Use the proper data types.


    var idNumber: Int? = null
    var name: String? = null
    val bookTitle: String? = null
    var response: String? = null
    var availableBooks: String = "Business English, Computer Programming, Basic Algebra, Calculus 1"
    val book1 = "Business English"
    val returnDate1 = "October 14, 2022"
    val book2 = "Computer Programming"
    val returnDate2 = "October 16, 2022"
    val book3 = "Basic Algebra"
    val returnDate3 = "October 18, 2022"
    val book4 = "Calculus 1"
    val returnDate4 = "October 20, 2022"

    println("Do you want to borrow a book?")
    response = readLine().toString()

    println("Enter ID Number:")
    idNumber = readLine()?.toInt()

    println("Enter complete name:")
    name = readLine()?.toString()

    println("Do you want to display available books?")
    availableBooks = readLine().toString()

    if (response.lowercase() == "y") {
        println("$book1, $book2, $book3, $book4")

        println("Enter title of book to borrow:")
        availableBooks = readLine().toString()

        if (book1 == "Business English") {
            println("Return by: $returnDate1")

            if (book2 == "Computer Programming") {
                println("Return by: $returnDate2")

                if (book3 == "Basic Algebra") {
                    println("Return by: $returnDate3")

                    if (book4 == "Calculus 1") {
                        println("Return by: $returnDate4")
                    }
                }
            }
        }
    }
}

//            book1 = readLine().toString()
//            println("Return date will be on $returnDate1")
//
//            book2 = readLine().toString()
//            println("Return date will be on $returnDate2")
//
//            book3 = readLine().toString()
//            println("Return date will be on $returnDate3")
//
//            book4 = readLine().toString()
//            println("Return date will be on $returnDate4")

//                    } else if (response.lowercase() == "n")
//                        println("Return book title: $bookTitle ")
//
//
//                    if (bookTitle == "Business English") {
//                        println("Enter date returned:")
//                        println("Enter date returned: $book1")
//
//                    } else if (bookTitle == "Computer Programming") {
//                        println("Enter date returned: $book2")
//
//                    } else if (bookTitle == "Basic Algebra") {
//                        println("Enter date returned: $book3")
//
//                    } else if (bookTitle == "Calculus 1") {
//                        println("Enter date returned: $book4")
//                    }
//                }
//            }








//            println("Enter your name: $name")
//            println("Available Books: $availableBooks")



//    bookTitle = readLine().toString()
//    needAnyHelp = readLine().toString()

//
//    if (needAnyHelp.lowercase() == "Y") {
//        println("Enter book title: = $bookTitle")
//
//        if (bookTitle == "available") {
//            println("$bookTitle")
//
//            if (needAnyHelp.lowercase() == "n") {
//                println("Don't forget I'm here...")
//            }
//        }
//    }


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


