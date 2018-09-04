package com.vizrt.assignment;

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
