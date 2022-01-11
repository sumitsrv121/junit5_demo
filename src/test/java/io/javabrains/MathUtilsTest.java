package io.javabrains;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
    @Test
    void testSumOfTwoPositiveNumbers() {
        MathUtils mathUtils = new MathUtils();
        //input
        int x = 10;
        int y = 20;
        //actual output
        Assertions.assertEquals(30, mathUtils.add(x, y), "The add method should add 2 numbers");

    }

    @Test
    void testComputeCircleArea() {
        MathUtils mathUtils = new MathUtils();
        // input
        double radius = 10.0;
        // expected output
        double exceptedArea = mathUtils.computeCircleArea(radius);
        Assertions.assertEquals(exceptedArea, 314.0);

    }
}