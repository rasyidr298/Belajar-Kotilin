package com.rrdev.roombooking.BelajarKotlin

open class Animal(){
    //deklarasi variable
    var nama:String? =null
    var color:String? = null
    var jumlahKaki:Int? = null

    //membuat constructor
    constructor(nama:String,color:String,jumlahKaki:Int):this(){
        this.nama = nama
        this.color = color
        this.jumlahKaki = jumlahKaki

        //hanya print object
        println("Object"+ this.jumlahKaki)
        println("Object"+ this.color)
        println("Object"+ this.nama)
    }
}

/**
 * melakukan inheritence / pewarisan sifat animal kepada kucing*/

class Kucing:Animal(){

}

fun main(){
    var animal = Animal("animal","ijoo",20)
    println("${animal.jumlahKaki}")
    val kucing = Kucing()
    println("${kucing.jumlahKaki}")
}
