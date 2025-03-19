package euler

class Euler003Suite extends munit.FunSuite {

  val parameters: List[(Long, Long)] =
    List(
      (2, 2),
      (3, 3),
      (5, 5),
      (7, 7),
      (8, 2),
      (13195, 29),
      (600851475143L, 6857)
    )

  parameters.foreach { i =>
    test(s"The largest prime factor of ${i._1}: ${i._2}") {
      assertEquals(Euler003.solution(i._1), i._2)
    }
  }
}
