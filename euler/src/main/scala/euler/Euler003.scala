/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

package euler

object Euler003 {

  /** Solution of third Euler problem.
    * @param n
    *   Value that find max prime factor.
    * @return
    *   The largest prime factor.
    */
  def solution(n: Long): Long = {
    primeFactors(n, 2).max
  }

  // Helper function for third Euler problem.
  def primeFactors(x: Long, a: Long): List[Long] = (a * a <= x, x % a) match
    case (true, 0)  => a :: primeFactors(x / a, a)
    case (true, _)  => primeFactors(x, a + 1)
    case (false, _) => List(x)

}
