
//following is Implementation of A double-ended queue

object Queue_Scala {
  private type Queue[Item] = List[Item]

  def removeFirst[Item](queue: Queue[Item]):Option[(Item, List[Item])] = queue match {
    case Nil => None
    case x::xs => Some((x,xs))
  }

  def removeLast[Item](queue: Queue[Item]):Option[(Item, List[Item])] = queue match {
    case Nil => None
    case x::xs => Some((queue.last,queue.init))
  }

  def addLast[Item](item:Item,queue: Queue[Item]):(Unit,Queue[Item]) = ((),queue :+ item)

  def addFirst[Item](item:Item,queue: Queue[Item]):(Unit,Queue[Item])= ((),item +: queue)

}

object QueueClient extends App {
  val (i,q) = Queue_Scala.addLast(1,List())
  val (i1,q1) = Queue_Scala.addLast(2,q)
  val (i2,q2)  =  Queue_Scala.addLast(3,q1)

  val  a = Queue_Scala.removeLast(q2)
  val b = Queue_Scala.removeFirst(a.get._2)
  val c = Queue_Scala.removeFirst(b.get._2)
  val d = Queue_Scala.removeFirst(c.get._2)
  println(d)
}
