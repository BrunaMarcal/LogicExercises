package com.example.programminglogic.exercises.duplicate_list


fun main() {
    var input = readln()
    val list = mutableListOf<String>()
    var validation = false

    while(!validation){
        list.add(input)
        input = readln()
        if(list.contains(input)) {
            print("Palavra duplicada $input \n")
            validation = true
        }
    }
    println(list)
}









