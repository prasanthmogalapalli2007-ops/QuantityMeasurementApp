package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;
import com.apps.quantitymeasurement.QuantityMeasurementApp.Inches;

public class QuantityMeasurementAppTest {

    // 🔹 FEET TESTS

    @Test
    public void testFeet_SameValue() {
        assertTrue(new Feet(1.0).equals(new Feet(1.0)));
    }

    @Test
    public void testFeet_DifferentValue() {
        assertFalse(new Feet(1.0).equals(new Feet(2.0)));
    }

    @Test
    public void testFeet_NullComparison() {
        assertFalse(new Feet(1.0).equals(null));
    }

    @Test
    public void testFeet_SameReference() {
        Feet f = new Feet(1.0);
        assertTrue(f.equals(f));
    }

    // 🔹 INCHES TESTS

    @Test
    public void testInches_SameValue() {
        assertTrue(new Inches(1.0).equals(new Inches(1.0)));
    }

    @Test
    public void testInches_DifferentValue() {
        assertFalse(new Inches(1.0).equals(new Inches(2.0)));
    }

    @Test
    public void testInches_NullComparison() {
        assertFalse(new Inches(1.0).equals(null));
    }

    @Test
    public void testInches_SameReference() {
        Inches i = new Inches(1.0);
        assertTrue(i.equals(i));
    }

    // 🔹 TYPE SAFETY TEST

    @Test
    public void testFeetAndInches_NotEqual() {
        Feet f = new Feet(1.0);
        Inches i = new Inches(1.0);

        assertFalse(f.equals(i));
    }
}