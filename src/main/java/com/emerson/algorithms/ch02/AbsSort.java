package com.emerson.algorithms.ch02;

/**
 * Created with IntelliJ IDEA.
 * User: emerson
 * Date: 1/7/14
 * Time: 3:33 PM
 */
public abstract class AbsSort {

    public abstract void sort(Comparable[] data);

    protected void exchange(Comparable[] data, int i, int j) {
        Comparable temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    protected void print(Comparable[] data) {
        for (Comparable comparable : data) {
            System.out.print(comparable + " ,");
        }
        System.out.println();
    }

    protected boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }
}
