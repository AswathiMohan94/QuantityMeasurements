package com.bridgelabz.QuantityMeasurementTest;

import com.bridgelabz.QuantityMeasurement.Inch;
import com.bridgelabz.QuantityMeasurements.Length;
import org.junit.Assert;
import org.junit.Test;
//import sun.security.util.Length;

public class QuantityTest {
    @Test
    public void given0FeetAnd0FeetShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        boolean equals=feet1.equals(feet2);
        Assert.assertFalse(equals);

    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(inch1, inch2);

    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(inch1, inch2);

    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual(){
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(feet1,inch1);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        boolean compareCheck= feet1.compare(inch1);
        Assert.assertTrue(compareCheck);

    }

    @Test
    public void given0FeetAnd0Inch_WhenComparedShouldReturnNotEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        boolean compareCheck= feet1.compare(inch1);
        Assert.assertFalse(compareCheck);

    }

    @Test
    public void given1FeetAnd1Feet_WhenComparedShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        boolean compareCheck= feet1.compare(feet2);
        Assert.assertFalse(compareCheck);
    }
    //problem statements from pdf
    @Test
    public void givenNullValue_ShouldReturnFalse(){
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length feet2 = null;
        boolean equalsCheck = feet1.equals(feet2);
        Assert.assertFalse(equalsCheck);
    }
    @Test
    public void givenFeetValue_WhenEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Unit.FEET, 2.0);
        Length feet2 = new Length(Length.Unit.FEET, 2.0);
        Assert.assertEquals(feet1, feet2);
    }
    @Test
    public void givenType_WhenEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Unit.FEET, 2.0);
        Length feet2 = new Length(Length.Unit.FEET, 2.0);
        boolean typeCheck = feet1.equals(feet2);
        Assert.assertEquals(true, typeCheck);
    }
}
