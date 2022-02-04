package edu.knoldus

import org.scalatest.funsuite.AnyFunSuite

class FindLengthTest extends AnyFunSuite {
  val findlengthobject = new FindLength

  /** Test cases for List* */
  test("Calculating basic list length of type String") {
    assert(findlengthobject.length(List("scala", "sbt", "jvm")) == 3)
  }

  test("Calculating basic list length of type Integer") {
    assert(findlengthobject.length(List(1, 2, 3, 4)) == 4)
  }

  test("Calculating length of an empty list") {
    assert(findlengthobject.length(Nil) == 0)
  }

  /** Test cases for Set* */
  test("Calculating basic set length of type String") {
    assert(findlengthobject.length(Set("scala", "sbt", "jvm")) == 3)
  }

  test("Calculating basic set length of type Integer") {
    assert(findlengthobject.length(Set(1, 2, 3, 4)) == 4)
  }

  test("Calculating length of an empty set") {
    assert(findlengthobject.length(Set()) == 0)
  }

  /** Test cases for Seq* */
  test("Calculating basic seq length of type String") {
    assert(findlengthobject.length(Seq("scala", "sbt", "jvm")) == 3)
  }

  test("Calculating basic seq length of type Integer") {
    assert(findlengthobject.length(Seq(1, 2, 3, 4)) == 4)
  }

  test("Calculating length of an empty seq") {
    assert(findlengthobject.length(Seq()) == 0)
  }
}