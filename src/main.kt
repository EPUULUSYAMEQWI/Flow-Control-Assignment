fun main() {
 getOdd()
 println(names(arrayOf("Amekwi","John","Mearcy","Jane")))

 robotServe(5)
 robotServe(12)
 robotServe(15)

 printNumbers()
}

fun getOdd(){
 for (name in 1..100) {
  if (name % 2!=0){
   println(name)
  }
 }
}
fun names(names:Array<String>):Int{
 var number=0
 names.forEach { n->
  if (n.length >5){
   number++
  }
 }
 return number
}
fun robotServe(age:Int){
 if (age<6){
  println("milk")
 }
 else if(age>6 && age<15){
  println("fanta orange")
 }
 else{
  println("cocacola")
 }
}
fun printNumbers() {
 for (a in 1..100) {
  if (a % 3 == 0 && a % 5 == 0) {
   println("FIZZbBUZZ")
  } else if (a % 3 == 0) {
   println("FIZZ")
  } else if (a % 5 == 0) {
   println("Buzz")

  } else {
   println(a)
  }
 }
}




     

