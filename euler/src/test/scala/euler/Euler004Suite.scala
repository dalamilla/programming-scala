package euler

class Euler004Suite extends munit.FunSuite {

  val parameters = List((2, 9009), (3, 906609))

  parameters.foreach { i =>
    test(
      s"The largest palindrome made from the product of two ${i._1}-digit numbers: ${i._2}"
    ) {
      assertEquals(Euler004.solution(i._1), i._2)
    }
  }
}
