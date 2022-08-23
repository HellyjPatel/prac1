fun main() {
    print("Please enter size of array:")
    val array_size: Int = readLine()!!.toInt()
    val myarray = Array<Int>(array_size) { 0 }
    for (i in 0..array_size - 1) {
        print("arr[$i]=")
        myarray.set(i, readLine()!!.toInt())
    }
    var max = myarray[0]

    for (i in 0..array_size - 1) {
        if (myarray[i] >= max) {
            max = myarray[i]
        }

    }
    println("Max number in array: $max")

}
