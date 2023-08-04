package euler

class Euler005Suite extends munit.FunSuite {

  val parameters =
    List((5, 60), (7, 420), (10, 2520), (13, 360360), (20, 232792560))

  parameters.foreach { i =>
    test(
      s"The smallest positive number that is evenly divisible by all of the numbers from 1 to ${i._1}: ${i._2}"
    ) {
      assertEquals(Euler005.solution(i._1), i._2)
    }
  }
}
