package com.vizrt.assignment.part1;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Stack;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class RPNCalculatorTest2 {

    RPNCalculator rpnCalculator;

    @Before
    public void initiate() {

        Registry registry = Mockito.mock(Registry.class);
        Operation operation = Mockito.mock(Operation.class);
        Mockito.when(operation.calculate(Mockito.any(Stack.class))).thenReturn(5.0);
        Mockito.when(registry.getOperation("+")).thenReturn(operation);

        rpnCalculator = new RPNCalculator(registry);
    }

    @Test
    public void testCalculate() throws Exception {
        double result = rpnCalculator.calculate("3 2 + .");
        assertThat(result, is(equalTo(5.0)));
    }
}
