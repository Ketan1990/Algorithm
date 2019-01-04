
object Stack_Scala {
  type Stack[A] = List[A]

  def pop[A](stack: Stack[A]):(A,Stack[A]) = stack match {
    case x::xs =>    (x,xs)
    case Nil =>  (None.get,Nil)
  }

  def push[A](a:A,stack: Stack[A]):(Unit,Stack[A]) = ((),a::stack)

}
object StackDemo extends App{
  val a = Stack_Scala.push(1,List())
  val b = Stack_Scala.push(2,a._2)
  val c = Stack_Scala.push(3,b._2)
  val d = Stack_Scala.pop(c._2)

  print(d)

}