package org.example;

import com.sun.tools.javac.main.Option;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = FIZZ + BUZZ;
    private int Fizz_Rule = 3;
    private int Buzz_Rule = 5;

    private final int value;

    public FizzBuzz(int[] rules, int value) throws Option.InvalidValueException {

        if (value <= 0) {
            throw new Option.InvalidValueException("Number must be higher than 0");
        } else {
            this.value = value + 1;
            this.Fizz_Rule = rules[0];
            this.Buzz_Rule = rules[1];
        }

    }

    public final StringBuilder generate() {

        final StringBuilder result = new StringBuilder(0);
        int i = 1;
        while (i < this.value) {
            result.append(fizzBuzzCheck(i));
            if ((this.value - 1) != i) {
                result.append(' ');
            }
            i++;
        }
        return result;

    }
    private static String fizzBuzzCheck(final int input) {

        if ((input % this.Fizz_Rule + this.Buzz_Rule) == 0) return FIZZ_BUZZ;
        if ((input % this.Buzz_Rule) == 0) return BUZZ;
        if ((input % this.Fizz_Rule) == 0) return FIZZ;
        else return Integer.toString(input);

    }
}
