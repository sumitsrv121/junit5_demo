package io.javabrains;

public class MathUtils {
    private static final double PI = 3.14;

    public int add(int a, int b) {
        return a + b;
    }

    public double computeCircleArea(double radius) {
        return PI * radius * radius;
    }
}
