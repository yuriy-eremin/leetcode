package com.leetcode

import org.scalatest.{FlatSpec, Matchers}

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "defangIPaddr" in {
    Solution.defangIPaddr("1.1.1.1") shouldEqual "1[.]1[.]1[.]1"
    Solution.defangIPaddr("255.100.50.0") shouldEqual "255[.]100[.]50[.]0"
  }
}
