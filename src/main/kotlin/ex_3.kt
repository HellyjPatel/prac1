open class Person(firstname:String,lastname:String){
    var age:Int=-1
    init{
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname: String,age:Int):this(firstname,lastname){
        this.age=age
        println("Age $age")
    }
}
class Student(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){
        this.batch=batch
        println("Batch $batch")
        println("--------------")
    }

}
fun main(){
    var s1=Student("HELLY","Patel",21,20012011095,"CE","D","AB12")
    var s2=Student("DHRUPAL","Patel",21,200120111085,"CE","D","AB12")
    var s3=Student("HARSH","Patel",20,20012011084,"CE","D","AB12")
    var s4=Student("OM","Patel",20,20012011077,"CE","D","AB12")
    var s5=Student("PRATHAM","Patel",21,20012011094,"CE","D","AB12")

}