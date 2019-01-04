object HigherOrderFnction{
  def fanOut[A,B,C] (f:A=>B,g:A=>C):A => (B,C) =
    a => (f(a),g(a))


  def cross[A,B,C,D] (f:A=>B,g:C=>D) =
    (a:A,c:C) => (f(a),g(c))

  def either[A,B,C](f:A=>B,g:C=>B) =
    (e:Either[A,C]) => e match {
      case Left(a) => f(a)
      case Right(c) =>f(c)
    }

  def choice[A,B,C,D](f:A=>B,g:C=>D) =
    (either:Either[A,C]) => either match {
      case Left(a) => Left(f(a))
      case Right(c) => Right(g(c))
    }

  def xy(x:Int):Int = x + x

  def xy1[A](x:A):A = x


    def alt[E1,E2,A,B](l:Parser[E1,A],r:E2 => Parser[E2,B]):
    Parser[(E1,E2),Either[A,B]] =
      Parser[(E1,E2),Either[A,B]]((input:String) =>
        l.run(input) match {
          case Left(e1) => r(e1).run(input) match {
            case Left(e2) => Left(e1,e2)
            case Right((input,b)) => Right((input,Right(b)))
          }
          case Right((input,a)) => Right((input,Left(a)))
        }
      )




    case class Parser[+E,+A](run:String => Either[E,(String,A)])
    object Parser {
      final def fail[E](e:E):Parser[E,Nothing] = Parser(_=>Left(e))

      final def point[A] (a:A):Parser[Nothing,A] =
        Parser(input => Right((input,a)))

      final def char:Parser[Unit,Char] =Parser(
        input => if(input.length == 0 ) Left(())
        else Right((input.drop(1),input.charAt(0)))
      )
    }


}