package com.rrdev.roombooking.BelajarKotlin

fun main(args:Array<String>){
    menu()
}

fun menu() {
    println("Enter")
    println("- Write")
    println("- Read")
    println("- Exit")

    var choice :Int = readLine()!!.toInt()
    var message :String?

    when(choice){
        1 -> {
            println("Enter message :")
            message = readLine().toString()
            writeTofile(message)
        }

        2 -> {
            println("Reading...")
            readFile()
        }

        3 -> print("Exiting")
    }
}
