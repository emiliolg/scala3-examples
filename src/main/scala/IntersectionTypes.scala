import java.lang.Math.{pow, sqrt}

/**
  * Intersection Types: https://dotty.epfl.ch/docs/reference/new-types/intersection-types.html
  */
object IntersectionTypes {

  sealed trait X {
    def x: Double
  }

  sealed trait Y {
    def y: Double
  }

  final case class Point(x: Double, y: Double) extends X with Y 

  def test: Unit = {

    def euclideanDistance(p1: X & Y, p2: X & Y) = sqrt(pow(p2.y - p1.y, 2) + pow(p2.x - p1.x, 2))

    val p1: Y & X = Point(3, 4)
    val p2: X & Y = Point(6, 8)
    println(euclideanDistance(p1, p2))
    
//    val x: X = p1
//    println(x.y)
    
  }
}
