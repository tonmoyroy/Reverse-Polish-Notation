package com.vizrt.assignment.part1;

import java.util.Stack;

public class DivisionOperationImpl implements Operation {
    @Override
    public String getOperator() {
        return "/";
    }

    @Override
    public double calculate(Stack<Double> numbers) {
        double x = numbers.pop();
        if(x==0){
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        }
        double y = numbers.pop();

        return y/x;
    }
}
