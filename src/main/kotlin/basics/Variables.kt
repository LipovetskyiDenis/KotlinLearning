package basics

fun main() {

    // in Java: *String myString = "Hello";* in first place var(iable) -> name of var -> Sequence
    // in Kotlin name -> (type of var *additional*)

    val parents: String = "MOM and DAD" // immutable value
    val mother = "Lois"
    val father = "Piter"
    // I cannot assign a new value here because val is constant (I'm not allowed to change my parents)

    var gender1: String = "Male" // mutable variable
    var gender2: String = "Female"
    gender1 = "Transsexual"
    gender2=  "Military Helicopter"

    // in Java, I have concatenations in Kotlin instead:
    println("I have $parents")
    println("My dad's name is $father and gender:  $gender1")
    println ("My mom`s name is $mother $gender2")
    println("I have ${1 + 1} parents ")

}