package com.vizrt.assignment;

import java.util.Stack;

public class MINOperationImpl implements Operation {
    @Override
    public String getOperator() {
        return "MIN";
    }

    @Override
    public double calculate(Stack<Double> numbers) {
        return numbers.stream().min(Double::compareTo).get();
    }
}
