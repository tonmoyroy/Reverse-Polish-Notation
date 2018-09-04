package com.vizrt.assignment;

public class App {

    public static void main(String args[]) {
        printResult( "3 1 2 + * .");
        printResult( "3 4 5 SUM 3 + .");
        printResult( "2 2 + 5 7 8 AVG 2 / .");
        printResult( "1 2 + 8 6 MIN 10 * .");
        printResult( "1 2 + 8 6 MAX 10 * .");
        printResult( "2 3 ^ 5 + .");
    }

    private static void printResult(String input) {
        RPNCalculator calculator = new RPNCalculator(new RegistryImpl());
        Double result = calculator.calculate(input);
        System.out.println(result);
    }
}
