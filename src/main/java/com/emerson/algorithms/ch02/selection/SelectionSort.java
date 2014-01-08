package com.emerson.algorithms.ch02.selection;

import com.emerson.algorithms.ch02.AbsSort;

/**
 * Created with IntelliJ IDEA.
 * User: emerson
 * Date: 1/7/14
 * Time: 1:59 PM
 */
public class SelectionSort extends AbsSort {

    public void sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (less(data[j],data[i])) {

                    exchange(data, i, j);
                    print(data);
                }
            }

        }

    }

    public static void main(String[] args) {

        new SelectionSort().sort(DATAS);


    }

}
