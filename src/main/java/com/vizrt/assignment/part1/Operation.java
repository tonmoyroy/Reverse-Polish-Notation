package com.vizrt.assignment.part1;

import java.util.Stack;

public interface Operation {
    String getOperator();
    double calculate(Stack<Double> numbers);
}
