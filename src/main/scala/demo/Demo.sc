import java.time.LocalDateTime

object  types {
 type ??? = Nothing

  val unitValues:Set[Unit] = Set(())

  val NothingValues:Set[Nothing] = Set()

  val UnitUnitValues:Set[Either[Either[Unit,Unit],Unit]] =
    Set(Right(Right(())),Right(Left(())),Right(()))

  def to1[A] (t:(A,Nothing)) = t._2
  def from1[A](n:Nothing):(A,Nothing) = n

  type Idetifier1 = Either[Int,String]
  sealed trait Identifier2
  case class Robot(identifier:Int) extends Identifier2
  case class Human(idetifier: String) extends Identifier2

  def to3[A](t:Either[A,Nothing]):A = t match {
    case Right(nothing) => nothing
    case Left(a) => a
  }

  def from3[A](a:A):Either[A,Nothing]= Left(a)



  type CreditCard = ???
  type CCNumber = String
  case class CreditCard1 (number:CCNumber,expiry:Expiry,code:SecurityCode)


  case class SecurityCode()

  case class Expiry private(date:LocalDateTime)
  object Expiry {

    def isvalid  (data: LocalDateTime) = ???

    def apply(date: LocalDateTime): Option[Expiry] = {
      if (isvalid(date))
        Some(new Expiry(date))
      else
        None
    }
  }


  case class GamePlay(gameMap:GameMap,players:Character)

  case class GameMap(cells:Set[Cell],access:Cell => Set[Cell])
  case class Character(name:String,state:Stats)
  case class Stats(health:Health)
  case class Cell()

  case class Health private (vlaue:Int)
  object Functios{
    val squre :Int => Int = (x:Int) => x * x


  }
  class Az[A] {
    def identity3[B](A:A):B = ???
    val idetifier2: A => A = (a:A) => a

  }
  new Az().idetifier2(1)

}

