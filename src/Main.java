// I have neither given nor received unauthorized aid on this piece of work.

import java.util.Scanner;

public class Main {

    // 1. add
    public static int add(int a, int b) {
        return a+b;
    }

    // 2. addFour
    public static int add(int i, int i1, int i2, int i3) {
        int j = i1 + i2 + i3;
        return add(i, j);
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple(String phrase) {
        return phrase + phrase + phrase;
    }

    // 6. half
    public static double half(int number) {
        double num = number;
        return num /= 2.0;
    }

    public static int roundPositiveValueToNearestInteger(double v) {
        return ;
    }

    public static int roundNegativeValueToNearestInteger(double v) {
        return 6;
    }
    // 7. roundPositiveValueToNearestInteger

    // 8. roundNegativeValueToNearestInteger
}