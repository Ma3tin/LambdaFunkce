package com.company;

public class Main{

    public static void main(String[] args) {
        IOperations operations = (a, b) -> a + b;
        System.out.println(modify(2, 5, operations));
        IOperations operations2 = (a, b) -> a * b;
        System.out.println(modify(1, 5, operations2));

    }
    private static int modify(int a, int b, IOperations iOperations) {
        int total = a;
        for (int i = a+1; i <= b; i++) {
            total = iOperations.computeSeries(total, i);
        }
        return total;
    }

}
