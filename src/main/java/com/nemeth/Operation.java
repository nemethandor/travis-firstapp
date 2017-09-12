package com.nemeth;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by java on 2017.09.12..
 */
public class Operation {

    public Integer sumNumbers(int a, int b, int c){

        return a+b+c;
    }

    public List<Integer> getFibonacci(int a){
        int previous0=1;
        int previous1=1;

        List<Integer> fibonacciList = new ArrayList<Integer>();

        fibonacciList.add(previous0);
        fibonacciList.add(previous1);

        for (int i=2; i<a; i++){
            fibonacciList.add(previous0+previous1);
            int x=previous
        }

        return fibonacciList;
    }
}
