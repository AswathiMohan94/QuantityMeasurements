package com.bridgelabz.QuantityMeasurementTest;

import com.bridgelabz.QuantityMeasurements.Quantity;
import com.bridgelabz.QuantityMeasurements.Unit;
import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    Quantity quantity;

    @Test
    public void given0FeetAnd0FeetShouldReturnEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        Quantity feet2 = new Quantity(Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        Quantity feet2 = new Quantity(Unit.FEET, 1.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);

    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        Quantity inch2 = new Quantity(Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);

    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        Quantity inch2 = new Quantity(Unit.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);

    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity inch1 = new Quantity(Unit.INCH, 1.0);
        Assert.assertNotEquals(feet1, inch1);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        boolean compareCheck = feet1.Compare(inch1);
        Assert.assertTrue(compareCheck);

    }

    @Test
    public void given0FeetAnd0Inch_WhenComparedShouldReturnNotEqualLength() {
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity inch1 = new Quantity(Unit.INCH, 1.0);
        boolean compareCheck = feet1.Compare(inch1);
        Assert.assertTrue(compareCheck);

    }

    @Test
    public void given1FeetAnd1Feet_WhenComparedShouldReturnEqualLength() {
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity feet2 = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = feet1.Compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    //problem statements from pdf
    @Test
    public void givenNullValue_ShouldReturnFalse() {
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity feet2 = null;
        boolean equalsCheck = feet1.equals(feet2);
        Assert.assertFalse(equalsCheck);
    }

    @Test
    public void givenFeetValue_WhenEqual_ShouldReturnTrue() {
        Quantity feet1 = new Quantity(Unit.FEET, 2.0);
        Quantity feet2 = new Quantity(Unit.FEET, 2.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenType_WhenEqual_ShouldReturnTrue() {
        Quantity feet1 = new Quantity(Unit.FEET, 2.0);
        Quantity feet2 = new Quantity(Unit.FEET, 2.0);
        boolean typeCheck = feet1.equals(feet2);
        Assert.assertEquals(true, typeCheck);
    }

    @Test
    public void givenObjectRef_OfFeet_WhenEqual_ShouldReturnTrue() {
        Quantity feet1 = new Quantity(Unit.FEET, 2.0);
        Quantity feet2 = new Quantity(Unit.FEET, 2.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenNullValueForInch_ShouldReturnFalse() {
        Quantity inch1 = new Quantity(Unit.INCH, 1.0);
        Quantity inch2 = null;
        boolean equalsCheck = inch1.equals(inch2);
        Assert.assertFalse(equalsCheck);
    }

    @Test // value check
    public void givenInchValue_WhenEqual_ShouldReturnTrue() {
        Quantity inch1 = new Quantity(Unit.INCH, 1.0);
        Quantity inch2 = new Quantity(Unit.INCH, 1.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenType_ForInch_WhenEqual_ShouldReturnTrue() {
        Quantity inch1 = new Quantity(Unit.INCH, 1.0);
        Quantity inch2 = new Quantity(Unit.INCH, 1.0);
        boolean typeCheck = inch1.equals(inch2);
        Assert.assertEquals(true, typeCheck);
    }

    @Test
    public void givenObjectRef_ForInch_WhenEqual_ShouldReturnTrue() {
        Quantity inch1 = new Quantity(Unit.INCH, 1.0);
        Quantity inch2 = new Quantity(Unit.INCH, 1.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1Inch_NotEqual_ShouldReturnFalse() {
        double inch = quantity.unitConverter(Unit.INCH, 1.0);
        double feet = quantity.unitConverter(Unit.FEET, 1.0);
        Assert.assertNotEquals(feet, inch, 0.0);
    }

    @Test
    public void given1InchAnd1Feet_NotEqual_ShouldReturnFalse() {
        double feet = quantity.unitConverter(Unit.FEET, 1.0);
        double inch = quantity.unitConverter(Unit.INCH, 1.0);
        Assert.assertNotEquals(inch, feet, 0.0);
    }

    @Test
    public void given1FeetAnd12Inch_Equal_ShouldReturnTrue() {
        double feet = quantity.unitConverter(Unit.FEET, 1.0);
        double inch = quantity.unitConverter(Unit.INCH, 12.0);
        Assert.assertEquals(feet, inch, 0.0);
    }

    @Test
    public void given12InchAnd1Feet_Equal_ShouldReturnTrue() {
        double inch = quantity.unitConverter(Unit.INCH, 12.0);
        double feet = quantity.unitConverter(Unit.FEET, 1.0);
        Assert.assertEquals(inch, feet, 0.0);
    }

    //<<<<<<<<<<<-------------- UC2 length------------>>>>>>>>>>>
    @Test
    public void given3FeetAnd1Yard_Equal_ShouldReturnTrue() {
        Quantity feet = new Quantity(Unit.FEET, 3.0);
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = feet.Compare(yard);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1FeetAnd1Yard_NotEqual_ShouldReturnFalse() {
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = feet.Compare(yard);
        Assert.assertTrue(compareCheck);    }

    @Test
    public void given1InchAnd1Yard_NotEqual_ShouldReturnFalse() {
        double inch = quantity.unitConverter(Unit.INCH, 1.0);
        double yard = quantity.unitConverter(Unit.YARD, 1.0);
        Assert.assertNotEquals(inch, yard, 0.0);
    }

    @Test
    public void given1YardAnd36Inch_Equal_ShouldReturnTrue() {
        double yard = quantity.unitConverter(Unit.YARD, 1.0);
        double inch = quantity.unitConverter(Unit.INCH, 36.0);
        Assert.assertEquals(yard, inch, 0.0);
    }

    @Test
    public void given36InchAndYard_Equal_ShouldReturnTrue() {
        double yard = quantity.unitConverter(Unit.YARD, 1.0);
        double inch = quantity.unitConverter(Unit.INCH, 36.0);
        Assert.assertEquals(inch, yard, 0.0);
    }

    @Test
    public void givenInchAnd3Feet_Equal_ShouldReturnTrue() {
        double yard = quantity.unitConverter(Unit.YARD, 1.0);
        double feet = quantity.unitConverter(Unit.FEET, 3.0);
        Assert.assertEquals(yard, feet, 0.0);

    }
    // <<<<<<<<<<<<<<<<<--------------CENTIMETER ----------->>>>>>>>>>>>>>>>>>

    @Test
    public void given2InchAnd5cm_Equal_ShouldReturnTrue() {
        Quantity inch = new Quantity(Unit.INCH, 2.0);
        Quantity centimeter =  new Quantity(Unit.CENTIMETER, 5.0);
        boolean compareCheck = inch.Compare(centimeter);
        Assert.assertTrue(compareCheck);
    }
    //<<<<<<<<<<<<<<<<<<<<-----------ADDITION------------------>>>>>>>>>>>>>>>>>>>>>
    @Test
    public void given2InchAnd2inch_WhenAdded_ShouldReturn4inch() {
        Quantity inch1 = new Quantity(Unit.INCH, 2.0);
        Quantity inch2 = new Quantity(Unit.INCH, 2.0);
        double sum=inch1.addition(inch2);
        Assert.assertEquals(4, sum, 0.0);
    }

    @Test
    public void given2InchAnd1Feet_WhenAdded_ShouldReturn14inch() {
        Quantity inch1= new Quantity(Unit.INCH, 2.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        double sum=inch1.addition(feet);
        Assert.assertEquals(14, sum, 0.0);
    }
    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity feet2 = new Quantity(Unit.FEET, 1.0);
        double sum = feet1.addition(feet2);
        Assert.assertEquals(24, sum, 0.0);
    }
    @Test
    public void given2inchAnd2cm_WhenAdded_ShouldReturn3Inch() {
        Quantity inch1 = new Quantity(Unit.INCH, 2.0);
        Quantity cenitmeter = new Quantity(Unit.CENTIMETER, 2.5);
        double sum = cenitmeter.addition(inch1);
        Assert.assertEquals(3, sum, 0.0);
    }
    //<<<<<<<<<<<<<<<<<<<<<---------------GALLON & LITRE------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    @Test

    public void given1GallonAnd3L_ifEqual_ShouldReturnTrue() {
        Quantity gallon = new Quantity(Unit.GALLON, 1.0);
        Quantity litre = new Quantity(Unit.LITRE, 3.78);
        boolean compareCheck=gallon.Compare(litre);
        Assert.assertTrue(compareCheck);
    }
    @Test

    public void given1GLAnd1000ml_ifEqual_ShouldReturnTrue() {
        Quantity litre = new Quantity(Unit.LITRE, 1.0);
        Quantity millilitre = new Quantity(Unit.MILLILITRE, 1000.0);
        boolean compareCheck=litre.Compare(millilitre);
        Assert.assertTrue(compareCheck);
    }

}
