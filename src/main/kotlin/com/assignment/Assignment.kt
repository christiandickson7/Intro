package com.assignment

fun main() {

    val numbers = mutableListOf<Int>()

    // Get 5 numbers from the user
    println("Enter 5 numbers:")

    for (i in 1..5) {
        print("Enter number $i: ")
        val input = readLine()!!.toInt()
        numbers.add(input)
    }

    // Calculate the sum
    val sum = numbers.sum()

    // Calculate the average
    val average = numbers.average()

    // Display the results
    println("\nNumbers in the list: $numbers")
    println("Sum of the numbers: $sum")
    println("Average of the numbers: $average")
}