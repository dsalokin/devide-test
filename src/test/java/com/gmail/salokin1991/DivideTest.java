package com.gmail.salokin1991;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class DivideTest {

    @Test
    void testDivide() {
        Divide divide = new Divide();
        Assertions.assertEquals(divide.divideAB(80, 4), 20);
    }
    @Test
    void testArithmeticExc() {
        Divide divide = new Divide();
//        Assertions.assertEquals(divide.divideAB(80, 0), 20);
        assertThatThrownBy(() -> {
         divide.divideAB(80, 0);
        })
                .isInstanceOf(ArithmeticException.class)
                .hasMessageContaining("/ by zero");
    }

}
