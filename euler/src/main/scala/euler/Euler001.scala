/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

package euler

object Euler001 {

  /** Solution of first Euler problem.
    *
    * @param n
    *   Value that limit the sum of natural numbers.
    * @return
    *   The sum of natural numbers that are multiples of 3 or 5 below n.
    */
  def solution(n: Int): Int = {
    (1 until n).filter(x => (x % 3 == 0 || x % 5 == 0)).sum
  }
}
