package hva.se.tests;


import hva.se.Pancake;
import hva.se.Plate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class PancakeTest {

    Plate<Pancake> plate = new Plate<>(new Pancake(1));

    @BeforeEach
    void setUp() {
        plate.add(new Pancake(2));
        plate.add(new Pancake(3));
        plate.add(new Pancake(4));
        plate.add(new Pancake(5));
    }

    @Test
    void testNegativeValue() {
        try {
            plate.add(new Pancake(-2));
            Assert.fail("IllegalArgumentException not thrown");
        } catch (IllegalArgumentException ignored) {
        }
    }

    @Test
    void testNoRecurringElement() {
        try {
            plate.add(new Pancake(4));
            plate.add(new Pancake(4));
            Assert.fail("IllegalArgumentException not thrown");
        } catch (IllegalArgumentException ignored) {
        }
    }

    @Test
    void testMaxLimitElements() {
        try {
            for (int i = 6; i <= 30; i++) {
                plate.add(new Pancake(i + 1));

            }
            Assert.fail("ArrayIndexOutOfBoundsException not thrown");
        } catch (ArrayIndexOutOfBoundsException ignored) {

        }
    }

    @Test
    public void testIsPlateSorted() {
    }


}
