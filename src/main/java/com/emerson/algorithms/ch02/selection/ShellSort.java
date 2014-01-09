package com.emerson.algorithms.ch02.selection;

import com.emerson.algorithms.ch02.AbsSort;

/**
 * 算法解释
 * <p/>
 * http://zh.wikipedia.org/wiki/%E5%B8%8C%E5%B0%94%E6%8E%92%E5%BA%8F
 * <p/>
 * Created with IntelliJ IDEA.
 * User: emerson
 * Date: 1/9/14
 * Time: 10:12 AM
 */
public class ShellSort extends AbsSort {
    @Override
    public void sort(int[] data) {
        int n = data.length;
        for (int i = n / 2; i >= 1; i--) {//控制步长

            //插入排序
            for (int j = i; j < data.length; j++) {
                for (int k = j; k >= i && less(data[k], data[k - i]); k -= i) {

                    exchange(data, k, k - i);
                    print(data);
                }
            }
        }
    }

    public static void main(String[] args) {
        new ShellSort().sort(DATAS);
    }


}
