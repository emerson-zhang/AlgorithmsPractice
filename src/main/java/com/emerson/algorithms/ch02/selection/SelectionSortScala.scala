package com.emerson.algorithms.ch02.selection


/**
 * Implement Selection Sort with Scala
 *
 * User: emerson
 * Date: 1/7/14
 * Time: 3:28 PM
 *
 */
object SelectionSortScala {


  /**
   * my first answer, using double loop ,
   * <b>but it is not implemented in a functional way </b>
   *
   * @param data
   */

  def sort(data: Array[Int]) {
    for (
      i <- 0 until data.length - 1;
      j <- i until data.length
    ) {
      if (data(j) < data(i)) {
        val temp = data(i)
        data(i) = data(j)
        data(j) = temp

        //
        println(data.mkString(" ,"))
      }
    }
  }


  def main(args: Array[String]) {

  }


}
