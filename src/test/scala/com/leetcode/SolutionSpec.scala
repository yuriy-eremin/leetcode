package com.leetcode

import org.scalatest.{Matchers, WordSpec}

class SolutionSpec extends WordSpec with Matchers {
  "Solution" should {
    "defangIPaddr" in {
      Solution.defangIPaddr("1.1.1.1") shouldEqual "1[.]1[.]1[.]1"
      Solution.defangIPaddr("255.100.50.0") shouldEqual "255[.]100[.]50[.]0"
    }

    "numJewelsInStones" in {
      Solution.numJewelsInStones(J = "aA", S = "aAAbbbb") shouldEqual 3
      Solution.numJewelsInStones(J = "z", S = "ZZ") shouldEqual 0
    }
  }
}
