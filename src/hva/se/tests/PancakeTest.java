package hva.se.tests;


import hva.se.Pancake;
import hva.se.Plate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;



public class PancakeTest {

    Plate<Pancake> plate = new Plate<>(new Pancake(1));

    @BeforeEach
    void setUp() {
        plate.push(new Pancake(2));
        plate.push(new Pancake(3));
        plate.push(new Pancake(4));
        plate.push(new Pancake(5));
    }

    @Test
    void testNegativeValue(){
        try {
            plate.push(new Pancake(-2));
            Assert.fail("IllegalArgumentException not thrown");
        } catch (IllegalArgumentException ignored){
        }
    }

    @Test
    void testNoRecurringElement() {
        try {
            plate.push(new Pancake(4));
            plate.push(new Pancake(4));
            Assert.fail("IllegalArgumentException not thrown");
        } catch (IllegalArgumentException ignored) {
        }
    }

    @Test
    void testMaxLimitElements() {
        try {
            for (int i = 6; i <= 30; i++) {
                plate.push(new Pancake(i+1));

            }
            Assert.fail("ArrayIndexOutOfBoundsException not thrown");
        } catch (ArrayIndexOutOfBoundsException ignored) {

        }
    }


}
