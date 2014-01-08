package com.emerson.algorithms.ch02.selection

import com.emerson.algorithms.ch02.AbsSort

/**
 * 插入排序
 *
 * 1.从第一个元素开始，该元素可以认为已经被排序
 *
 * 2.取出下一个元素，在已经排序的元素序列中从后向前扫描
 *
 * 3.如果该元素（已排序）大于新元素，将该元素移到下一位置
 *
 * 4.重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
 *
 * 5.将新元素插入到该位置后
 *
 * 6.重复步骤2~5
 *
 *
 * Created with IntelliJ IDEA.
 * User: emerson
 * Date: 1/8/14
 * Time: 9:40 AM
 */
object InsertionSortScala {
  def iSort(xs:List[Int]):List[Int]={
    if (xs.isEmpty) Nil
    else insert(xs.head,iSort(xs.tail))
  }

  def insert( x:Int,xs:List[Int]):List[Int]={
    if (xs.isEmpty || x <= xs.head) x:: xs
    else xs.head::insert(x,xs.tail)
  }

  def main(args: Array[String]) {
    println(iSort(AbsSort.DATAS.toList).mkString(" ,"))
  }
}
