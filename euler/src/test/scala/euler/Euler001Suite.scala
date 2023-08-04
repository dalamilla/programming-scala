package euler

class Euler001Suite extends munit.FunSuite {

  val parameters =
    List((1000, 233168), (49, 543), (8456, 16687353), (19564, 89301183))

  parameters.foreach { i =>
    test(s"The sum of multiples of 3 or 5 below ${i._1}: ${i._2}") {
      assertEquals(Euler001.solution(i._1), i._2)
    }
  }
}
