package com.rrdev.roombooking.BelajarKotlin

interface InputHandler{
    fun clicked()
    fun doubleClick()
    fun singleClick()

}

class Phone: InputHandler{
    override fun clicked() {
        println("Phone Click")
    }

    override fun doubleClick() {

    }

    override fun singleClick() {

    }
}

class Button :InputHandler{
    override fun clicked() {
        println("Button CLick")
    }

    override fun doubleClick() {
        println("double click")
    }

    override fun singleClick() {
        println("single click")
    }

}

fun main(args: Array<String>){
    var myButton = Button()
    myButton.clicked()
    myButton.doubleClick()

    var phone = Phone()
    phone.clicked()
}