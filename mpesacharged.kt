fun main(args:Array<String>) {
    var KSH=15000
    if(KSH>200 && KSH<2500){
        println("M-PESA charges  34")
    }else if (KSH>2501 && KSH<5000){
        println("M-PESA charges  67")
    }else if( KSH>5001 && KSH<10000){
        println("M-PESA charges  112")
    }else if (KSH>10001 && KSH<20000){
        println("M-PESA charges 197")
    } else{
        println("invalid amount")
    }
    
    }





