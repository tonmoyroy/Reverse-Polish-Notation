package com.vizrt.assignment.part1;

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class PlusOperationTest {

    Operation operation;

    @Before
    public void initiate() {
        operation = new PlusOperationImpl();
    }

    @Test
    public void testCalculate() {
        Stack<Double> stack = new Stack<Double>();
        stack.push(1.0);
        stack.push(2.0);
        double result = operation.calculate(stack);
        assertThat(result, is(equalTo(3.0)));
    }
}
