package com.example.datastructure_kotlin

fun main(){
    val list1= listOf<Int>(1,2,3)//immutable list
    for(list in list1){
        println(list)
    }
    var list2= mutableListOf<Int>(4,5,6)
    list2.add(7)
    println(list2)
}