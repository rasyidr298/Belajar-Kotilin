package com.rrdev.roombooking.BelajarKotlin

fun main(){
    println(Perkalian(3,4)) //memanggil perkalian dan mencetaknya
    val pembagian:Int = Perkalian(45,2)/ angkaBagi(4)//memberikan nilai variable
    println(pembagian)
    HelloWorld()//memanggil fungsi helloWorls
    Nama() //memanggil fungsi nama
}

//membuat fungsi perkalian dgn return tpye perkalian
fun Perkalian (angkaPertama:Int,angkaKedua:Int):Int{
    val hasil:Int = angkaPertama * angkaKedua
    return hasil
}

//membuat fungsi pembagian dgn return type integr
fun angkaBagi(angka_bagi:Int):Int{
    return angka_bagi
}

//membuat fungsi hello world tanpa parameter dan tapa pengembalian
fun HelloWorld(){
    print("bismmmillah")
}

//fungisi tenpa parameter dgn pengembalian
fun Nama():String{
    val nama:String? = readLine()
    return nama.toString()
}
