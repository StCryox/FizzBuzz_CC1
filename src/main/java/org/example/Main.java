package org.example;

import com.sun.tools.javac.main.Option;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Rules fizz");
            final int fizz = scanner.nextInt();
            System.out.print("Rules buzz");
            final int buzz = scanner.nextInt();
            System.out.print("Number ");
            final int value = scanner.nextInt();

            int[] rules = {fizz, buzz};
            final FizzBuzz fizzBuzz = new FizzBuzz(rules, value);
            final StringBuilder result = fizzBuzz.generate();
            System.out.println(result);
            scanner.close();
        }
            catch (final Option.InvalidValueException e) {
            e.getMessage();
        }

    }

}
