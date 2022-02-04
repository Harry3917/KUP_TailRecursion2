package edu.knoldus

import scala.annotation.tailrec

class FindLength {
  @tailrec
  final def length[A](combination: Iterable[A], accumulator: Int = 0): Int = {
    if (combination.isEmpty) accumulator
    else length(combination.tail, accumulator + 1)
  }
}