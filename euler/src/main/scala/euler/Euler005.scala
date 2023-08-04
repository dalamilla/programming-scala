/*
 * 2520 is the smallest number that can be divided by each of  the numbers from
 * 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 */

package euler

object Euler005 {

  /** Solution of fifth Euler problem.
    *
    * @param n
    *   Value that limit the sum of natural numbers.
    * @return
    *   The smallest positive number that is evenly divisible by all of the
    *   numbers from 1 to n.
    */
  def solution(n: Int): Int = {
    (1 to n).fold(1)((acc, x) => x * (acc / hcf(x, acc)))
  }

  // Helper function for fifth Euler problem.
  def hcf(a: Int, b: Int): Int = a match
    case 0 => b
    case n => hcf(b % a, a)
}
