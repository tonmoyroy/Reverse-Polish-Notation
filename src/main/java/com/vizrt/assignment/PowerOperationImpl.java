package com.vizrt.assignment;

import java.util.Stack;

public class PowerOperationImpl implements Operation {
    @Override
    public String getOperator() {
        return "^";
    }

    @Override
    public double calculate(Stack<Double> numbers) {
        double x = numbers.pop();
        double y = numbers.pop();
        return Math.pow(y,x);
    }
}
