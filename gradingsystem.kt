fun main(args:Array<String>) {
    var marks:Int=90

    when(marks) {
        in 1..30 -> println("you have $marks- Below average")
        in 31..50 -> println("you have $marks - average")
        in 51..75 -> println("you have $marks - above average")
        in 76..99 -> println("you have $marks- excellent")

        else -> println("you have $marks - Invalid Marks try again")
    }
}

 