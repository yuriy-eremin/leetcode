package com.leetcode

import scala.annotation.tailrec

object Solution {
  /**
   * 1108. Defanging an IP Address
   *
   * Given a valid (IPv4) IP address, return a defanged version of that IP address.
   * A defanged IP address replaces every period "." with "[.]".
   *
   * Example 1:
   * Input: address = "1.1.1.1"
   * Output: "1[.]1[.]1[.]1"
   *
   * Example 2:
   * Input: address = "255.100.50.0"
   * Output: "255[.]100[.]50[.]0"
   *
   * Constraints:
   * The given address is a valid IPv4 address.
   **/
  def defangIPaddr(address: String): String = {
    address.replace(".", "[.]")
  }

  /**
   * 771. Jewels and Stones
   *
   * The letters in J are guaranteed distinct, and all characters in J and S are letters.
   * Letters are case sensitive, so "a" is considered a different type of stone from "A".
   *
   * Example 1:
   * Input: J = "aA", S = "aAAbbbb"
   * Output: 3
   *
   * Example 2:
   * Input: J = "z", S = "ZZ"
   * Output: 0
   * Note:
   *
   * S and J will consist of letters and have length at most 50.
   * The characters in J are distinct.
   *
   * @param J string representing the types of stones that are jewels.
   * @param S string representing the stones you have
   * @return how many of the stones you have are also jewels
   */
  def numJewelsInStones(J: String, S: String): Int = {
    @tailrec
    def numJewelsInStonesAcc(jewels: Set[Char], stones: List[Char], acc: Int): Int = {
      if (stones.nonEmpty) {
        if (jewels.contains(stones.head)) {
          numJewelsInStonesAcc(jewels, stones.tail, acc + 1)
        } else {
          numJewelsInStonesAcc(jewels, stones.tail, acc)
        }
      } else {
        acc
      }
    }

    numJewelsInStonesAcc(J.toSet, S.toList, 0)
  }
}
