package com.vizrt.assignment;

import java.util.Arrays;
import java.util.Stack;

public class RPNCalculator {

    private Registry registry;

    public RPNCalculator(Registry registry) {

        this.registry = registry;
    }

    public Double calculate(String input) {
        Stack<Double> stack = new Stack<>();

        String[] items = input.split(" ");
        for (String item : items) {
            if (item.equals(".")) {
                break;
            }
            Operation operation = registry.getOperation(item);
            if (operation == null) {
                double number = Double.parseDouble(item);
                stack.push(number);
            } else {
                double result = operation.calculate(stack);
                stack.push(result);
            }
        }
        return stack.pop();
    }
}
