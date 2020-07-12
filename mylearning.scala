package org.inceptez.scalaprograms
import scala.collection.mutable.ArrayBuffer

object mylearning {
  
  def main(args:Array[String]){
    //var are mutable and val is immutable
    //static definition and dynamic inference
    //simple data types particularly under anyval
    //conditional structure using nested if else if and else then nested if.
    //control structures /looping construct
try
{
      
println("without exception")
println(metexception(10,2))
println(metexception(10,0))
}
catch
{
case a:java.lang.ArithmeticException =>
println("with exception")
println(metexception(10,1))
}
finally
{println("got output")}
def metexception(numerator:Int,denominator:Int):Int={
var result=numerator/denominator
return result
}
val name:String = "Tata consultancy"

val immutablename = name + "services"

println(immutablename)

var fullname:AnyRef = "Hajeera"

fullname = "working as employee"

println(fullname)

var x=20

var y=30

if(x>y)
{
  println("X is greater")
}
  else
    if(y>x)
    {
      println("Y is greater")
    }
    else
    {
      println("X EQUALS Y")
}

for (x<-1 to 10)
{
val squared =x*x

  println(squared)

  }
while (x<=30)
{
  println(x)
  x+=1
}

var l=20

do
{
  println("x is lesser than y"+l)
  l=l+1
}
  while (l<=30)
    
var i=4
  while(i<=5)
     {
    var cube =i*i*i
    println("cube"+cube)
    i+=1
   }
  while(i<8)
    {
    var cube =i*i*i
    println("cube"+cube)
    i+=4
    }
for(i <- 5 to 20)
{
  if(i%2==0)
  {
    println("even"+i)
  }
  else
  {
    println("odd"+i)
  }}
for (i<-0 until 21 by 3)
{
  println("increment of 3 value"+i)
  
}

for(g <-1 to 4)
{
  if(g==4)
  {
    var s=4*4*4
    println("cube"+s)
  }}
  
def calculator(a:Int,b:Int,result:String):Any=
   {
   var result="div"
   var c=a.toFloat/b.toDouble
   return(c.toDouble,result)}
def calculator2(a:Int,b:Int,result1:String):Any=
    {
    var result1="add"
    var c1=a+b
    return(c1,result1)}
 def add8(a:Int,b:Int):Int=
     {
     var c=a*b
     var y=c
     return(y) // return statement will be given first priority even though last statement is expression
     c+y
     }
 def add9(a:Int,b:Int):Int=
     {
     var c=a*b
     var y=c
     c+y //if no return statement last expression will be executed
     }
 def add10(a:Int,b:Int):Int=
    {
    var c=a*b
    var y=c
    return(y)// first specified return statement is executed first
    return(c+a)}
 println(calculator(1,2,"div"))
 println(calculator2(1,2,"add"))
 println(add8(1,2))
 println(add9(1,2))
 println(add10(1,2))
 def num(a:Int=7,b:Int=13):Any=
     {
     for(i <- a to b)
      {
     if(i%4==0)
     {
     println("even"+i)
     }
     else{
     println("odd"+i)}}}


  def calculator1(a:Int,b:Int,result1:String):Any=
     {
     var result1="add"
     var c1=a+b
     var z=a.toDouble/b.toFloat
     println("div"+z)
     return(c1,result1)}
   println(calculator1(1,1,"add"))
  println(calculator1(2,1,"div"))
def pattern(a:Any,b:Any,Datatype:String):Any= Datatype match
{
  case "Float" =>{
    println("float")
    return (a,b)
    }

case "String" =>
  println(a.toString())

case "Boolean" => 
var a:Boolean=true
var b:Boolean=false
var c:Boolean=true
  if(a==c){println("Boolean value"+a)
}else{println("Boolean value"+b)}
  
case "Char" => 
  return (a,b)
}
   println(pattern("hajeera",1,"String"))
def calcuator(a:Int,b:Int,op:String):Any = 
       op match
        {
    
          case "add" | "addition" =>
            {
              println("Add Numbers")
              a + b
            }
          case "sub" | "subtract" =>
          {
            println("Sub Numbers")
            a - b
          }
          case "mul" | "multiply" =>
          {
            println("Multiply Numbers")
            a * b
          }
          case "div" | "division" =>
          {
            println("Division number")
            a.toDouble/b.toFloat
          }
        }
   println(calcuator(2,2,"mul"))

var a1=Array(1,2,3,4,5)
a1(3)=40
a1(0)+a1(1)
println("mutable" +a1(3))
//var a3=scala.collection.immutable.Array(10,20,30)
//a3(1)=5
println("Array is not immutable")
println("insert and delete is not possible in array")
//a1+=55
//a3-=60
var a2=List(10,20,30)
//a2(2)=30
println("List is immutable"+a2(2))
//a1+=100
//a1-=200
var a4=List(5,6,7)
println("insert and delete is not possible in List")
//var s1=ArrayBuffer(10,20,30,40)
//s1(2)=50
//println("ArrayBUffer is mutable"+s1(2))
var s2=scala.collection.mutable.ArrayBuffer(5,6,7,8)
//var s2=scala.collection.immutable.ArrayBUffer(5,6,7,8)
s2(1)=9
println("ArrayBuffer is not immutable")
s2+=60
s2-=7
println("Insert and delete is possible in ArrayBuffer")
s2.sorted.take(2).foreach(println)
s2.contains(60)
s2.length
s2.reverse.take(3).foreach(println)
s2.size
var lst=a2 ::: a4
var lst1=a2 ++ a4
println(lst.length)
lst.isEmpty
var h=Range(1,5,1)
var tuple=(1,"hajeera","bca",10000)
var num1=tuple._1
var name1 =tuple._2
var graduate=tuple._3
var salary=tuple._4
var tuple11= tuple._2+tuple._4
println("tuple"+tuple11)
var tuple3=(1,("hajeera",29,30,31),"bca","salary",80)
var tuple1= tuple3._2._4
var r=Array(2,3,1,5,4)
r.max
r.min
var value=Array(Array[Int](r.max),Array[Int](r.min))
var value1=Array[Int](r.min)
//println(value)
//println(value1)
value.take(2)
value1.take(1)

var a= Array[Int](1,2,3,4)
def array(a:Array[Int]):Any =
{
  if(a.isEmpty)
    println("empty")
    else{
      var m=a.max
      println("not empty-highest value"+m)
    }
}
//array(Array(1,2,3,4)) to check output in REPL,array(Array()) to check empty output
  var rang=(List[Int](1,2,3,4,5))
  var ss=Range(1,5).sum
  println("range"+ss)
  var F=List.range(1,5).sum
  var ag=(1 to 10).toArray
  var ff=List[String]("Spark","Scala","Python","Java","Hadoop")
  println(ff.length)
  
  var ab =scala.collection.mutable.Map("China"->"Beijing","India"->"New Delhi","USA"->"Washington","UK"->"London")
ab+="Japan"->"Tokyo"
  ab-="China"
  ab("India")="Tamilnadu"
  ab("India")
  var ac=ab.keys
  ab.values.take(2)
  var aa=ac.toArray
  aa.foreach(println)
  var cc=ac.toSet
  cc.foreach(println)
  case class employee(a:Int,name:String,graduate:String,salary:Int)
  var emp1=employee(1,"hajeera","bca",10000)
  emp1.name
  emp1.salary
  
}
}
