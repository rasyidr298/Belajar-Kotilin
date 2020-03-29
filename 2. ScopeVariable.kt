package com.rrdev.roombooking.BelajarKotlin


/**
 * variable scope - akses scope ( global dan local )*/

//Variale global
var nama :String? = null

fun main() {
    myName()
}
fun myName(){
    nama = "Rasyid"  //memberi nilai pada Variable.getNama
    print("Variable.getNama :$nama")  //cetak variable Variable.getNama
}
