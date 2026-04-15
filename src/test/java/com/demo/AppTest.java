package com.demo;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class AppTest {
    @Test
    public void testBillCalculation() {
        double result = App.calculateBill(150);
        assertEquals(275.0, result, 0.01);
    }
}