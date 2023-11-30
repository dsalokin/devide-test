package com.gmail.salokin1991;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivideTest {

    @Test
    void testDivide() {
        Divide divide = new Divide();
        Assertions.assertEquals(divide.divideAB(), 20);
    }

}
