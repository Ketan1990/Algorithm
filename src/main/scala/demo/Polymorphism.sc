object PolymorphismDemo {
  //  Parameter Polymrphims
  def head[A](xs: List[A]): A = xs(0)

  head(List(1, 2, 4))

  head(List("A", "B", "C"))

  // SubType Polymorphism
  trait Plus[A] {
    def plus(a2: A): A
  }
  def pluss[A <: Plus[A]](a1: A, a2: A): A = a1.plus(a2)

//  pluss(Numbers(1),Numbers(2))

  //Ad-hoc Polymorphism
  def plus2[A: Plus](a1: A, a2: A): A = implicitly[Plus[A]].plus(a1, a2)


}

