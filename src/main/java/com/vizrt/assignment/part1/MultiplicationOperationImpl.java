package com.vizrt.assignment.part1;

import java.util.Stack;

public class MultiplicationOperationImpl implements Operation {
    @Override
    public String getOperator() {
        return "*";
    }

    @Override
    public double calculate(Stack<Double> numbers) {
        double x = numbers.pop();
        double y = numbers.pop();
        return x*y;
    }
}
