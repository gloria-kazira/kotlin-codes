fun main(args:Array<String>) {
    var a =2

    when{
        a<10 -> println("$a is less than 10")
        a==10 -> println("$a is equal to 10")
        a>10 -> println("$a is greater than 10")
        else ->{
            println("invalid")
        }
    
    }

}