package com.vizrt.assignment.part1;

import java.util.Stack;

public class AVGOperationImpl implements Operation {
    @Override
    public String getOperator() {
        return "AVG";
    }

    @Override
    public double calculate(Stack<Double> numbers) {
        double sum = 0;
        int count = 0;
        while (!numbers.empty()){
            sum = sum + numbers.pop();
            count++;
        }
        return sum/count;
    }
}
