// I have neither given nor received unauthorized aid on this piece of work.

public class Main {

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. addFour
    public static int add(int i, int i1, int i2, int i3) {
        int j = add(i, i1);
        int k = add(j, i2);
        int l = add(k, i3);
        return l;
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

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double v) {
        int vRounded = (int) v;
        double fractionalPart = v - vRounded;
        int vOutput;

        if (fractionalPart >= -0.5) {
            vOutput = vRounded + 1;
        } else {
            vOutput = vRounded;
        }
        return vOutput;
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double v) {
        int vRounded = (int) v;
        double fractionalPart = v - vRounded;
        int vOutput;

        if (fractionalPart <= -0.5) {
            vOutput = vRounded - 1;
        } else {
            vOutput = vRounded;
        }
        return vOutput;
    }
}