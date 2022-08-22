fun main(){
    println("Enter Value A: ")
    val x: Int = readLine()!!.toInt()
    println("Enter Value B: ")
    val y: Int = readLine()!!.toInt()
    println("Enter Value C: ")
    val z: Int= readLine()!!.toInt()
    val sum: Int =x+y+z
    val SUB: Int =x-y-z
    val MUL: Int =x*y*z
    val DIV: Int =x/y/z
    println(" Addition: $x + $y +$z = $sum")
    println(" Subtraction: $x - $y - $z = $SUB")
    println(" Multiplication: $x * $y * $z = $MUL")
    println(" Division: $x / $y / $z = $DIV")

}