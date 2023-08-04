package euler

class Euler002Suite extends munit.FunSuite {

  val parameters = List(
    (8, 10),
    (10, 10),
    (34, 44),
    (60, 44),
    (1000, 798),
    (100000, 60696),
    (4000000, 4613732)
  )

  parameters.foreach { i =>
    test(s"The sum of even Fibonacci numbers below ${i._1}: ${i._2}") {
      assertEquals(Euler002.solution(i._1), i._2)
    }
  }
}
