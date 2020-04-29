package com.bridgelabz.QuantityMeasurementTest;

import com.bridgelabz.QuantityMeasurements.Quantity;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//import sun.security.util.Length;

public class QuantityTest {
    Quantity quantity;
    double inch,inch1,inch2, feet, cm, yard;

    @Before
    public void setUp() throws Exception {
        quantity = new Quantity();
    }

    @Test
    public void given0FeetAnd0FeetShouldReturnEqual() {
        Quantity feet1 = new Quantity(Quantity.Unit.FEET, 0.0);
        Quantity feet2 = new Quantity(Quantity.Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Quantity feet1 = new Quantity(Quantity.Unit.FEET, 0.0);
        Quantity feet2 = new Quantity(Quantity.Unit.FEET, 1.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);

    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Quantity inch1 = new Quantity(Quantity.Unit.INCH, 0.0);
        Quantity inch2 = new Quantity(Quantity.Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);

    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Quantity inch1 = new Quantity(Quantity.Unit.INCH, 0.0);
        Quantity inch2 = new Quantity(Quantity.Unit.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);

    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Quantity feet1 = new Quantity(Quantity.Unit.FEET, 1.0);
        Quantity inch1 = new Quantity(Quantity.Unit.INCH, 1.0);
        Assert.assertNotEquals(feet1, inch1);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        Quantity feet1 = new Quantity(Quantity.Unit.FEET, 0.0);
        Quantity inch1 = new Quantity(Quantity.Unit.INCH, 0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);

    }

    @Test
    public void given0FeetAnd0Inch_WhenComparedShouldReturnNotEqualLength() {
        Quantity feet1 = new Quantity(Quantity.Unit.FEET, 1.0);
        Quantity inch1 = new Quantity(Quantity.Unit.INCH, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertFalse(compareCheck);

    }

    @Test
    public void given1FeetAnd1Feet_WhenComparedShouldReturnEqualLength() {
        Quantity feet1 = new Quantity(Quantity.Unit.FEET, 1.0);
        Quantity feet2 = new Quantity(Quantity.Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertFalse(compareCheck);
    }

    //problem statements from pdf
    @Test
    public void givenNullValue_ShouldReturnFalse() {
        Quantity feet1 = new Quantity(Quantity.Unit.FEET, 1.0);
        Quantity feet2 = null;
        boolean equalsCheck = feet1.equals(feet2);
        Assert.assertFalse(equalsCheck);
    }

    @Test
    public void givenFeetValue_WhenEqual_ShouldReturnTrue() {
        Quantity feet1 = new Quantity(Quantity.Unit.FEET, 2.0);
        Quantity feet2 = new Quantity(Quantity.Unit.FEET, 2.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenType_WhenEqual_ShouldReturnTrue() {
        Quantity feet1 = new Quantity(Quantity.Unit.FEET, 2.0);
        Quantity feet2 = new Quantity(Quantity.Unit.FEET, 2.0);
        boolean typeCheck = feet1.equals(feet2);
        Assert.assertEquals(true, typeCheck);
    }

    @Test
    public void givenObjectRef_OfFeet_WhenEqual_ShouldReturnTrue() {
        Quantity feet1 = new Quantity(Quantity.Unit.FEET, 2.0);
        Quantity feet2 = new Quantity(Quantity.Unit.FEET, 2.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenNullValueForInch_ShouldReturnFalse() {
        Quantity inch1 = new Quantity(Quantity.Unit.INCH, 1.0);
        Quantity inch2 = null;
        boolean equalsCheck = inch1.equals(inch2);
        Assert.assertFalse(equalsCheck);
    }

    @Test // value check
    public void givenInchValue_WhenEqual_ShouldReturnTrue() {
        Quantity inch1 = new Quantity(Quantity.Unit.INCH, 1.0);
        Quantity inch2 = new Quantity(Quantity.Unit.INCH, 1.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenType_ForInch_WhenEqual_ShouldReturnTrue() {
        Quantity inch1 = new Quantity(Quantity.Unit.INCH, 1.0);
        Quantity inch2 = new Quantity(Quantity.Unit.INCH, 1.0);
        boolean typeCheck = inch1.equals(inch2);
        Assert.assertEquals(true, typeCheck);
    }

    @Test
    public void givenObjectRef_ForInch_WhenEqual_ShouldReturnTrue() {
        Quantity inch1 = new Quantity(Quantity.Unit.INCH, 1.0);
        Quantity inch2 = new Quantity(Quantity.Unit.INCH, 1.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1Inch_NotEqual_ShouldReturnFalse() {
        inch = quantity.unitConverter(Quantity.Unit.INCH, 1.0);
        feet = quantity.unitConverter(Quantity.Unit.FEET, 1.0);
        Assert.assertNotEquals(feet, inch, 0.0);
    }

    @Test
    public void given1InchAnd1Feet_NotEqual_ShouldReturnFalse() {
        feet = quantity.unitConverter(Quantity.Unit.FEET, 1.0);
        inch = quantity.unitConverter(Quantity.Unit.INCH, 1.0);
        Assert.assertNotEquals(inch, feet, 0.0);
    }

    @Test
    public void given1FeetAnd12Inch_Equal_ShouldReturnTrue() {
        feet = quantity.unitConverter(Quantity.Unit.FEET, 1.0);
        inch = quantity.unitConverter(Quantity.Unit.INCH, 12.0);
        Assert.assertEquals(feet, inch, 0.0);
    }

    @Test
    public void given12InchAnd1Feet_Equal_ShouldReturnTrue() {
        inch = quantity.unitConverter(Quantity.Unit.INCH, 12.0);
        feet = quantity.unitConverter(Quantity.Unit.FEET, 1.0);
        Assert.assertEquals(inch, feet, 0.0);
    }

    //<<<<<<<<<<<-------------- UC2 length------------>>>>>>>>>>>
    @Test
    public void given3FeetAnd1Yard_Equal_ShouldReturnTrue() {
        feet = quantity.unitConverter(Quantity.Unit.FEET, 3.0);
        yard = quantity.unitConverter(Quantity.Unit.YARD, 1.0);
        Assert.assertEquals(feet, yard, 0.0);
    }

    @Test
    public void given1FeetAnd1Yard_NotEqual_ShouldReturnFalse() {
        feet = quantity.unitConverter(Quantity.Unit.FEET, 1.0);
        yard = quantity.unitConverter(Quantity.Unit.YARD, 1.0);
        Assert.assertNotEquals(feet, yard, 0.0);
    }

    @Test
    public void given1InchAnd1Yard_NotEqual_ShouldReturnFalse() {
        inch = quantity.unitConverter(Quantity.Unit.INCH, 1.0);
        yard = quantity.unitConverter(Quantity.Unit.YARD, 1.0);
        Assert.assertNotEquals(inch, yard, 0.0);
    }

    @Test
    public void given1YardAnd36Inch_Equal_ShouldReturnTrue() {
        yard = quantity.unitConverter(Quantity.Unit.YARD, 1.0);
        inch = quantity.unitConverter(Quantity.Unit.INCH, 36.0);
        Assert.assertEquals(yard, inch, 0.0);
    }

    @Test
    public void given36InchAndYard_Equal_ShouldReturnTrue() {
        yard = quantity.unitConverter(Quantity.Unit.YARD, 1.0);
        inch = quantity.unitConverter(Quantity.Unit.INCH, 36.0);
        Assert.assertEquals(inch, yard, 0.0);
    }

    @Test
    public void givenInchAnd3Feet_Equal_ShouldReturnTrue() {
        yard = quantity.unitConverter(Quantity.Unit.YARD, 1.0);
        feet = quantity.unitConverter(Quantity.Unit.FEET, 3.0);
        Assert.assertEquals(yard, feet, 0.0);

    }
   // <<<<<<<<<<<<<<<<<--------------CENTIMETER ----------->>>>>>>>>>>>>>>>>>

    @Test
    public void given2InchAnd5cm_Equal_ShouldReturnTrue() {
        inch = quantity.unitConverter(Quantity.Unit.INCH, 2.0);
        cm = quantity.unitConverter(Quantity.Unit.CENTIMETER, 5.0);
        Assert.assertEquals(inch, cm, 0.0);

    }
//<<<<<<<<<<<<<<<<<<<<-----------ADDITION------------------>>>>>>>>>>>>>>>>>>>>>
    @Test
    public void given2InchAnd2Inch_ShouldReturn4Inch() {
        inch1 = quantity.unitConverter(Quantity.Unit.INCH, 2.0);
        inch2 = quantity.unitConverter(Quantity.Unit.INCH, 2.0);
        inch=inch1+inch2;
        Assert.assertEquals(4,inch, 0.0);
    }
    @Test
    public void given1feetAnd2Inch_ShouldReturn14Inch() {
        feet = quantity.unitConverter(Quantity.Unit.FEET, 1.0);
        inch1 = quantity.unitConverter(Quantity.Unit.INCH, 2.0);
        inch = inch1 + feet;
        Assert.assertEquals(14, inch, 0.0);
    }
    }