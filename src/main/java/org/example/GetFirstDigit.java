package org.example;

import java.util.stream.Stream;

public class GetFirstDigit {

    public static int getFirstDigitOne(int number){
        return (number - getSecondDigit(number)) / 10;
    }

    public static int getFirstDigitTwo(int number){
        String a = Integer.toString(number);
        return Character.getNumericValue(a.charAt(0));
    }
    public static int getFirstDigitThree(int number) {
        return Stream.of(String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt)
                .findFirst()
                .orElse(-1);
    }
    public static int getFirstDigitFour(int number){
        String a = Integer.toString(number);
        return (int)a.charAt(0) - '0';
    }

    public static int getSecondDigit(int number){
        return number % 10;
    }
}
