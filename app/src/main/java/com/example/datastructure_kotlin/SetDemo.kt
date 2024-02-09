package com.example.datastructure_kotlin

fun main(){
//var immutableSet= setOf<Int>(1,2,3,4,2)
var immutableSet= setOf(1,2,"hi",4,2)
    for (item in immutableSet)
    println(item)

var mutableSet= mutableSetOf<Int>(5,6,6,7,8,9)
mutableSet.add(10)
    mutableSet.remove(6)
println(mutableSet)//after print it gives new line
print("end")
}
