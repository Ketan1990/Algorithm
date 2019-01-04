
object QuickFind {
  type Union = List[Int]

  def fill(N: Int): Union =  List.tabulate(N)(a => a)

  def union(a:Int,b:Int)(list: Union):(Unit,Union) = {
    val aId = list(a)
    val bId = list(b)
    val updated = list.map(a => if(a == aId) bId else a)
    ((),updated)
  }

  def connected(a:Int,b:Int)(unioList:Union):Boolean = unioList(a) == unioList(b)
}

object QuickUnionClient {
  def main(args: Array[String]): Unit = {
    val a = QuickFind.fill(10)
    val list = QuickFind.union(2, 1)(a)
    val c = QuickFind.connected(2, 1)(list._2)

    print(list)
  }
}