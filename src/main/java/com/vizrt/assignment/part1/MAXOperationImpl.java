package com.vizrt.assignment.part1;

import java.util.Stack;

public class MAXOperationImpl implements Operation {
    @Override
    public String getOperator() {
        return "MAX";
    }

    @Override
    public double calculate(Stack<Double> numbers) {
        return numbers.stream().max(Double::compareTo).get();
    }
}
