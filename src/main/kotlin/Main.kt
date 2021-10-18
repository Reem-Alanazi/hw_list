import java.io.File

fun main() {

// Part |

    // Create a list of 3 elements
    var listOfCities = mutableListOf("Riyadh", "Tokyo", "Amsterdam")
    println(listOfCities)

    // Add more 2 elements
    listOfCities.addAll(0, listOf("Makkah", "Malaysia"))
    println(listOfCities)

    // Update
    listOfCities[4] = "Roma"
    println(listOfCities)

    // List Cities with the numbers
    listOfCities.forEachIndexed { index, city ->
        println(" $index - $city")
    }

// Part ||

    // Create a list of integer with 5 elements
    var listOfNumber = mutableListOf(1, 2, 3, 4, 5)

    // Update the 3th element to 12
    listOfNumber[2] = 12
    println(listOfNumber)

    // Check if the '12' existing delete the element
    var isFounf = if(listOfNumber.contains(12)) {
        listOfNumber.remove(12)
    } else { false }
    println(listOfNumber)

    // Options

    // Create text file and read it
    // we need import java.io.File type to work with a particular file by providing a file path
    var names = File("data/names.txt")
        .readText()
        .split(" \n")
    println(names)

    // Create a list of 10 number then return the maximum number
    var maxNumber = listOf(100,255,124,30)
    println(maxNumber.maxOrNull()?:0)

}

