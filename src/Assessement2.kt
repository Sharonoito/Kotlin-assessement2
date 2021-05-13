fun main() {
    println(strings("Sharon"))
    var deposit=1000.00
    deposit

}
data class Car(var make:String,var model:String,var color:String)

fun carGroups(arrayList: ArrayList<String>){
    var carList= mutableListOf<String>()
    for(cars in carList)
    when(cars)   {
        "red"->println(mutableListOf(""))
        "blue"->println(mutableListOf(""))
      else{
          println()
      }
    }

}
fun strings(name:String):Int{
    var lengthOfString= name.length
    return lengthOfString
}
class currentAccount(var accountNumber:Int,var accountName:String,var balance:Int){
    fun deposit(amount:Double){

        var add=balance+amount
        println(add)
        fun withdraw(amount:Double){
         var subtract=balance-amount
         println(subtract)

        }

    }
}
