package com.vizrt.assignment.part2;


import java.util.Queue;

public class App {


    public static void main(String[] args) {
        printResult("4");
        printResult("1 + 99");
        printResult("7 + ( 5 ) * ( 6 - 3 )");
        printResult("( 3 + 4 ) ^ 3 + 4 ^ 2");
    }


    private static void printResult(String input) {
        String[] infix = input.split("\\s+");
        convertInfixToRPN converter = new convertInfixToRPN();
        Queue<String> result = converter.convertInfixToRPN(infix);
        for (String item :result) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

}
