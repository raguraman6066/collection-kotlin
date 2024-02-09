package com.example.datastructure_kotlin

fun main(){
    var immMap= mapOf(1 to "jack",2 to "john")
    for(key in immMap){
        println(key.value)
    }
println("-----")
    var mutableMap= mutableMapOf<Int,String>(1 to "One", 2 to "Two")
    mutableMap.put(4,"Four")
    for(num in mutableMap.keys){
        println(mutableMap[num])
    }

    mutableMap.remove(2)
}