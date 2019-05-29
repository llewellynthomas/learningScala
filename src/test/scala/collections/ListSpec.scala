package collections

import org.specs2.mutable.Specification

/**
  * Using ideas from Functional Programming in Scala
  */
class ListSpec extends Specification {

  val numbersList: List[Int] = List(1, 2, 3, 4)
  val emptyList: List[Nothing] = Nil

//  "The sum method on a list" should {
//    "sum all items" in {
//      List.sum(numbersList) must_=== 10
//    }
//    "return zero if empty" in {
//      List.sum(emptyList) must_=== 0
//    }
//  }
//  "The product function on a list" should {
//    "create product of items in list" in {
//      List.product(numbersList) must_=== 24
//    }
//    "return zero if empty" in {
//      List.product(emptyList) must_=== 1
//    }
//  }
//  "The tail function on a list" should {
//    "return only tail" in {
//      List.tail(numbersList) must_=== List(2, 3, 4)
//    }
//
//    "return nil if list empty" in {
//      List.tail(emptyList) must_=== Nil
//      List.tail(emptyList) must_=== List()
//    }
//  }
//
//  "The drop function on a list" should {
//    "drop first 3 items from list " in {
//      List.drop(numbersList, 3) must_=== List(4)
//    }
//
//    "drop no numbers from list" in {
//      List.drop(numbersList, 0) must_=== numbersList
//    }
//
//    "drop all numbers from list" in {
//      List.drop(numbersList, 22) must_=== List()
//    }
//  }
//
//  "The head function on a list" should {
//    "replace old head item with new one" in {
//      List.setHead(22, numbersList) must_=== List(22, 2, 3, 4)
//    }
//    "add new head items on empty list" in {
//      List.setHead(33, emptyList) must_=== List(33)
//    }
//  }
//
//  "DropWhile function on list" should {
//    "return new list with dropWhile" in {
//      List.dropWhile(numbersList, (x: Int) => x < 3) must_== List(3, 4)
//    }
//  }
//
//  "Append function on list" should {
//    "append list2 on list 1" in {
//      List.append(numbersList, List(6, 7, 8)) must_=== List(1, 2, 3, 4, 6, 7, 8)
//    }
//  }
//
//  "Init function on list" should {
//    "drop only the last item from the list" in {
//      List.init(numbersList) must_== List(1, 2, 3)
//    }
//  }
//
//  "Fold right function on list" should {
//    "divide number from right to left" in {
//      List.foldRight(numbersList, 1.0)(_ / _) must_=== 0.375
//    }
//  }
//
//  "Foldleft function on list" should {
//    "divide number from left to right" in {
//      List.foldLeft(numbersList, 1.0)(_ / _) must_=== 0.041666666666666664
//    }
//  }
//git s
//  "Map function on list" should {
//    "implement a map function that takes a function to modify items" in {
//      List.map(numbersList)(_ + 1) must_=== List(2, 3, 4, 5)
//    }
//  }
}
