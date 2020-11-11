/**
  * Trait Parameters: https://dotty.epfl.ch/docs/reference/other-new-features/trait-parameters.html
  */
object TraitParams {

  trait Base(val msg: String)
  class A extends Base("Hello")
  class B extends Base("Dotty!")

  // Union types only exist in Dotty, so there's no chance that this will accidentally be compiled with Scala 2
  private def printMessages(msgs: (A | B)*) = println(msgs.map(_.msg).mkString(" "))

  def test: Unit = {
    printMessages(A(), B(), A())
  }
}
