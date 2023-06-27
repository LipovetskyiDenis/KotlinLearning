package basics

fun main() {

    val items = listOf("apple","banana","orange")// List.of() Java9
    mutableListOf("apple","banana","orange") // ArrayList

    //for each
    for (item in items){
        println(item)
    }

    println("")

    //while
    var index = 0
    while(index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }

    for(i in 1..10){ //increasing queue
        println(i)
    }

    for(i in 1 until 10) { //1.2.3.4.. except 10
        println(i)
    }

    for(i in 10 downTo 1 ){
        println(i)
    }

    for(i in 0..100 step 10)
        println(i)
    
}