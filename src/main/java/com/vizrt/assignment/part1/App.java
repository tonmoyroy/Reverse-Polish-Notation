package com.vizrt.assignment.part1;


public class App {

    public static void main(String args[]) throws Exception {
        printResult( "3 1 2 + * .");
        printResult( "3 4 5 SUM 3 + .");
        printResult( "2 2 + 5 7 8 AVG 2 / .");
        printResult( "1 2 + 8 6 MIN 10 * .");
        printResult( "1 2 + 8 6 MAX 10 * .");
        printResult( "2 3 ^ 5 + .");
        printResult( "2 0 / .");
    }

    private static void printResult(String input) throws Exception {
        RPNCalculator calculator = new RPNCalculator(new RegistryImpl());
        try {
            Double result = calculator.calculate(input);
            System.out.println(result);
        }
        catch (IllegalArgumentException e){
            System.out.println("Illegal Argument Message: "+ e.getMessage());
        }catch (Exception e){
            System.out.println("Error Message: "+ e.getMessage());
        }

    }
}
