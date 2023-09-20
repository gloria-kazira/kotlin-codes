fun main(args:Array<String>) {
    var income_ksh:Int= 100000

    when(income_ksh) {
       in 1..5999 -> println("Monthly contribution = 150.00 ")
       in 6000..7999 -> println("Monthly contribution = 300.00")
       in 8000..11999 -> println("Monthly contribution = 400.00")
       in 12000..14999 -> println("Monthly contribution =500.00")
       in 15000..19999 -> println("Monthly contribution = 600.00")
       in 20000..24999 -> println("Monthly contribution = 750.00")
       in 25000..29999 -> println("Monthly contribution =850.00")
       in 30000..49999 -> println("Monthly contribution = 1000.00")
       in 50000..99999 -> println("Monthly contribution = 1500.00")
      
       else ->
       if(income_ksh>=100000){
        println("Monthly contribution = 2000")

       } else{
        println("Invalid entry")
       }
 } 

}
   
       
    
