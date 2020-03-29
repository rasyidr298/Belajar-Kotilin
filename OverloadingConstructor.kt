package com.rrdev.roombooking.BelajarKotlin

/**
 * Pembuatan class dan object dgn overloading konsttuctor pd class kendaraan*/

class Kendaraan(){
    //set properties
    var nama :String? = null
    var roda :String? = null
    var sayap :Int? = null
    var warna :String? = null

   /*membuat constructor ke 1 dgn 4 parameter*/
    constructor(nama :String,roda :String, sayap :Int, warna :String):this(){
       this.nama
       this.roda
       this.sayap
       this.warna

       println("object : "+ this.nama)
       println("object : "+ this.roda)
       println("object : "+ this.sayap)
       println("object : "+ this.warna)
   }

    /*membuat constuctor ke 2 dgn 3 parameter*/
    constructor(nama: String,roda: String,warna: String):this(){
        this.nama = nama
        this.roda = roda
        this.warna = warna

        println("object : "+ this.nama)
        println("object : "+ this.roda)
        println("object : "+ this.warna)
    }

    /*membuat constructor ke 3 dgn 3 parameter */
    constructor(nama: String,sayap: Int,warna: String):this(){
        this.nama = nama
        this.sayap = sayap
        this.warna = warna

        println("object : "+this.nama)
        println("object : "+this.sayap)
        println("object : "+this.warna)
    }

    /*membuat constructor ke 4 dgn 2 parameter*/
    constructor(nama: String,warna: String):this(){
        this.nama = nama
        this.warna = warna

        println("object : "+this.nama)
        println("object : "+this.warna)
    }
}

fun main(){
    var becak = Kendaraan("Becak","kuning")
    var motor = Kendaraan("matic",5,"merah")
}