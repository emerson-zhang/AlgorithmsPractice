package com.emerson.algorithms.ch02;

/**
 * Created with IntelliJ IDEA.
 * User: emerson
 * Date: 1/7/14
 * Time: 3:33 PM
 */
public abstract class AbsSort {

    public static final int[] DATAS = new int[]{3,0,1,8,7,2,5,4,9,6};

    public abstract void sort(int[] data);

    protected void exchange(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    protected void print(int[] data) {
        for (int value : data) {
            System.out.print(value + " ,");
        }
        System.out.println();
    }

    protected boolean less(int a, int b) {
        return a<b;
    }
}
