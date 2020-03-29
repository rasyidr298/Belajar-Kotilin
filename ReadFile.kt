package com.rrdev.roombooking.BelajarKotlin

import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun main(){
    println("Enter a message")
    val message:String = readLine().toString() // input keyboard menggunkan readline

    //memeriksa apakah user memasukan pesan atau tidak
    if (message == ""){
        println("please enter a message")
    }else{
        writeTofile(message)
    }
    readFile()
}

fun readFile() {
    val reader = FileReader ("message.txt")
    var char:Int?

    try {
        do {
            char = reader.read()
            print(char.toChar())
        }while (char != -1)
    }catch (ex: Exception){
        print(ex.message)
    }
}

fun writeTofile(message: String) {
    try {
        val writer = FileWriter("message.txt",true)
        writer.write(message + "\n")
        writer.close()
    }catch (ex: Exception){
        println("Exception $ex")
    }
}
