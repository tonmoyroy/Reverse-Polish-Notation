package com.vizrt.assignment.part1;

import java.util.Stack;

public class SUMOperationImpl implements Operation {
    @Override
    public String getOperator() {
        return "SUM";
    }

    @Override
    public double calculate(Stack<Double> numbers) {
        double sum = 0;
        while (!numbers.empty()){
            sum = sum + numbers.pop();
        }
        return sum;
    }
}
