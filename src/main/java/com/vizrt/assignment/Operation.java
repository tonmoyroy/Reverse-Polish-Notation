package com.vizrt.assignment;

import java.util.Stack;

public interface Operation {
    String getOperator();
    double calculate(Stack<Double> numbers);
}
