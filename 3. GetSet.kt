package com.rrdev.roombooking.BelajarKotlin

/**
 * membuat class rumah dgn beberapa parameter]*/

class Rumah(val nama :String, val harga :Int ){
    //inisialisasi vlass rumah
    init {
        this.nama
        this.harga
    }

    /**
     * getset adalah opsional pada kotlin tidak seperti java
     * membuat get ser adalah bad programing
     * kotlin menginginkan kta semua selalu menggunakan propeties utk mengakses
     * dan set class*/
}

fun main(){
    /**
     * membuat objek rumah*/
    val rumah1 = Rumah ("joglo",30000)
    println("rumah ${rumah1.nama} dengan harga ${rumah1.harga}")
    val rumah2 = Rumah ("adat",50000)
    println("rumah ${rumah2.nama} dengan harga ${rumah2.harga}")
}