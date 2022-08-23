class Car(com:String, year:Long, price:Int, owner:String, miles:Int,cprice:Int){
    var mf:String = com
    var yr =year
    var p:Int = price
    var ow = owner
    var m:Int = miles
    var cp:Int=cprice

    fun getCarPrice(){
        println("$" + (p-m).toString())
    }
    fun getCarInformation(){
        println("Car Information :$mf,$yr")
        println("Car Owner :$ow")
        println("Miles drive :$m")
        println("Original Car Price : $p")
        println("Current Car Price : $cp")
    }
}
fun main() {
    println("--------------")
    println("Creating class car object c1 in next line.")
    println("Object is created and Init is called")
    println("--------------")
    var c1=Car("i10",2018,700000,"Helly",1500,650000)
    c1.getCarInformation()


    println("--------------")
    println("Creating class car object c2 in next line.")
    println("Object is created and Init is called")
    println("--------------")
    var c2=Car("i20",2021,800000,"Harsh",2000,752000)
    c2.getCarInformation()
}