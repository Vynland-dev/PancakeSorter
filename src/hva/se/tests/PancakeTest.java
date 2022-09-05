package hva.se.tests;


import hva.se.Pancake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;

import java.util.Stack;



public class PancakeTest {

    Stack<Pancake> plate = new Stack<>();

    @BeforeEach
    void setUp() {
        plate.push(new Pancake(1));
        plate.push(new Pancake(2));
        plate.push(new Pancake(3));
    }

    @Test
    void testNegativeValue(){
        try {
            plate.push(new Pancake(-2));
            Assert.fail("IllegalArgumentException not thrown");
        } catch (IllegalArgumentException ignored){
        }
    }

}
