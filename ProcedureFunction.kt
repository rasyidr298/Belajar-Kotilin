package com.rrdev.roombooking.BelajarKotlin

fun main(){
    /**
     * FUNGSI PROCEDURE
     * menghitung Luas Segitiga */

    tambah(3,6)
    LuasSegitiga(5,3)
}

fun tambah(nomol:Int, nomor2:Int){
    val sum:Int = nomol+nomor2
    println(sum)
}

fun LuasSegitiga(tinggi:Int, alas:Int){
    val hitungluas:Int = alas*tinggi/2
    println("luas segitiga adalah alas $alas * $tinggi / 2 = $hitungluas")
}