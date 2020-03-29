package com.rrdev.roombooking.BelajarKotlin


fun main() {

/*    */
    /**
     * val - variable tidak bisa dirubah (statis)
     * var - variable yang bisa dirubah (dinamis)*//*

    val lasName = "ridla";

    var nama :String = "Rasyid ridla"
    nama = "ridla";

    var alamat:String = "jakarta"
    alamat = "kebumen"

    print("nama saya adalah $lasName $nama dan alamat saya adalah $alamat")*/


/*    */
    /**
     * variable String - int*//*

    val nama: String = "Rasyid"
    val umur = 22;

    println("nama saya $nama dan umur saya $umur")
    print("namas saya "+nama+"umur saya"+"$umur")*/


/*    */
    /**
     * variable float dgn double*//*

    val uangSaku:Float
    uangSaku = 30.6f

    val  uangJajan :Double
    uangJajan = 30.0

    println("uangsaku = $uangSaku uang jajan  $uangJajan")*/


/*    */
    /**
     * Boolean*//*

    val kebenaran:Boolean
    kebenaran = true

    val kesalahan: Boolean
    kesalahan = false

    print("$kebenaran dan $kesalahan")*/


/*    */
    /**
     * tipe Char*//*

    val karakter:Char
    karakter = '8'

    val huruf:Char
    huruf = 'a'*/


/*    */
    /**
     * Converter tipe Data*//*

    //deklarasi variable
    var angkaPertama:Int = 10
    var masukkanAngka=13.0

    //convert toye data to int
    angkaPertama = masukkanAngka.toInt()

    //print hasil ahir dengan cnvert ke float
    print(angkaPertama.toFloat() + 10)*/

/*    */
    /**
     * Readline - input pada kotlin yg digunakan utk menyimpan value
     * menggunakn input keyboard*//*

    println("siapa nama kamu.. ?")

    //input user dgn input keyboard readline
    val user:String? = readLine()
    println("nsms kamu adalah $user")*/


/*    */
    /**
     * aritmatik kotlin*//*

    val angkaPertama = 10
    val angkaKedua = 10

    val hasilKali:Float = angkaPertama * angkaKedua.toFloat()
    val hasilBagi:Float = angkaPertama / angkaKedua.toFloat()

    println("perklaian $angkaPertama * $angkaKedua = $hasilKali ")
    print("pembagian $angkaPertama / $angkaKedua = $hasilBagi")*/


/*
    */
    /**increment - decrement*//*


    var angkaAwal = 10

    //decrement pd variable hasil
    val hasil: Int = angkaAwal--
    print("$hasil")
*/


    /**
     * Logika operator - logika yang mengembalikan nilai boolean
     * AND - OR - NOT*
     * && - || - !*/


    /**
     * reminder - sisa hasil bagi / modulus*/


    /*   */
    /**
     * percabangan - if elser*//*

    val nomorPertama = 8
    val nomorKedua = 10

    if (nomorKedua > nomorPertama) print("betull") else print("noo")*/


    /**
     * Kondisional opertor
     * memilikii nilai pengembalian Boolean
     *<
     * >
     * dst*/

/*    val nilaiPertama = 10
    val nilaiKedua = 20

    println(nilaiPertama<nilaiKedua)*/


/*    */
    /**
     * if else statment - perulaan dgn kata kunci for pd pemograman kotlin*//*

    for (x:Int in 0..50)
        if (x % 2 == 0){
            println("ini angka genap $x")
        }else if (x % 2 !=0){
            println("ini adalah ganjil $x")
        }*/


/*

    */
    /**
     * While loop (perulangan)
     * increment dan decrement*//*


    var perhitungan = 4

    while (perhitungan >= 5){
        println("hitung.....$perhitungan")
        perhitungan -- //perhitungan -1 pada value dalam variable perhitungan
    }
    println("nilai hitung out of range")
*/


/*
    */
    /**
     *aplikasi tebak tebakan umur - menggunakn when expesiuon ( switch case )*//*


    println("saya sekolah di indonesia kelas 5 tebal umur saya 10 tahun kedepan")
    val jawaban:Int = readLine()!!.toInt()// menggunakn input keyboard


    when(jawaban){
        18 -> print("anda salah menebak umur")
        19 -> print("waduh kurang amat dikit lagi")
        20 -> print("kurang sangat amat dikit kang")
    }
*/


}



