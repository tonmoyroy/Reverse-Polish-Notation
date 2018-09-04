package com.vizrt.assignment;

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class RPNCalculatorTest1 {

    RPNCalculator rpnCalculator;

    @Before
    public void initiate() {
        rpnCalculator = new RPNCalculator(new RegistryImpl());
    }

    @Test
    public void testCalculate() {
        double result = rpnCalculator.calculate("3 1 2 + * .");
        assertThat(result, is(equalTo(9.0)));
    }
}
