package collections

sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {
  def sum(ints: List[Int]): Int = ???

  def product(ints: List[Int]): Int = ???

  def tail[A](ints: List[A]): List[A] = ???

  def drop[A](l: List[A], n: Int): List[A] = ???

  /**
    * currying can help with type matching
    */
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = ???

  def append[A](l1: List[A], l2: List[A]): List[A] = ???

  /**
    * Remove only last item in list
    *
    * This is not very efficient, but you could use vectors
    */
  def init[A](l: List[A]): List[A] = ???

  def foldRight[A, B](as: List[A], z: B)(f: (A,B) => B): B = ???

  def foldLeft[A, B](as: List[A], z: B)(f: (B, A) => B): B = ???

  def map[A, B](as: List[A])(f: A => B): List[B] = ???

  def setHead[A](head: A, inst: List[A]): List[A] = ???

  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))
}
