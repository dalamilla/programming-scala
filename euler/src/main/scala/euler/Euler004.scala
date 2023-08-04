/*
 * A palindromic number reads the same both ways. The largest palindrome made from
 * the product of two 2-startDigit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-startDigit numbers.
 */

package euler

import scala.math.pow

object Euler004 {

  /** Solution of fourth Euler problem.
    * @param n
    *   Number of n-startDigit.
    * @return
    *   The largest palindrome made from the product of two n-startDigit
    *   numbers.
    */
  def solution(n: Int): Int = {
    val list = (pow(10, n - 1).intValue until pow(10, n).intValue)

    (for
      a <- list
      b <- list if isPalindrome(a * b)
    yield a * b).max
  }

  // Helper function for fourth Euler problem.
  def isPalindrome(i: Int): Boolean = s"${i}".reverse == s"${i}"
}
