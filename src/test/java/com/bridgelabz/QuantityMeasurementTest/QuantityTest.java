package com.bridgelabz.QuantityMeasurementTest;

import com.bridgelabz.QuantityMeasurements.ConversionOfUnits;
import com.bridgelabz.QuantityMeasurements.Quantity;
import com.bridgelabz.QuantityMeasurements.QuantityException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class QuantityTest {
    Quantity quantity;

    @Test
    public void given0FeetAnd0FeetShouldReturnEqual() {
        Quantity feet1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 0.0);
        Quantity feet2 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Quantity feet1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 0.0);
        Quantity feet2 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 1.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);

    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Quantity inch1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 0.0);
        Quantity inch2 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);

    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Quantity inch1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 0.0);
        Quantity inch2 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);

    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Quantity feet1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 1.0);
        Quantity inch1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 1.0);
        Assert.assertNotEquals(feet1, inch1);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() throws QuantityException {
        try {
            Quantity feet1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 0.0);
            ExpectedException exception = ExpectedException.none();
            exception.expect(QuantityException.class);
            Quantity inch1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 0.0);
            boolean compareCheck = feet1.Compare(inch1);
            Assert.assertTrue(compareCheck);
        }
        catch(QuantityException e) {

            Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT, e.type);
        }
    }
    @Test
    public void given0FeetAnd0Inch_WhenComparedShouldReturnNotEqualLength() throws QuantityException {
        try {
            Quantity feet1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 1.0);
            ExpectedException exception = ExpectedException.none();
            exception.expect(QuantityException.class);
            Quantity inch1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 1.0);
            boolean compareCheck = feet1.Compare(inch1);
            Assert.assertTrue(compareCheck);
        }
        catch(QuantityException e) {

            Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT, e.type);
        }
    }
    @Test
    public void given1FeetAnd1Feet_WhenComparedShouldReturnEqualLength() throws QuantityException {
        Quantity feet1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 1.0);
        Quantity feet2 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 1.0);
        boolean compareCheck = feet1.Compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    //problem statements from pdf
    @Test
    public void givenNullValue_ShouldReturnFalse() {
        Quantity feet1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 1.0);
        Quantity feet2 = null;
        boolean equalsCheck = feet1.equals(feet2);
        Assert.assertFalse(equalsCheck);
    }

    @Test
    public void givenFeetValue_WhenEqual_ShouldReturnTrue() {
        Quantity feet1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 2.0);
        Quantity feet2 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 2.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenType_WhenEqual_ShouldReturnTrue() {
        Quantity feet1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 2.0);
        Quantity feet2 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 2.0);
        boolean typeCheck = feet1.equals(feet2);
        Assert.assertEquals(true, typeCheck);
    }

    @Test
    public void givenObjectRef_OfFeet_WhenEqual_ShouldReturnTrue() {
        Quantity feet1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 2.0);
        Quantity feet2 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 2.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenNullValueForInch_ShouldReturnFalse() {
        Quantity inch1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 1.0);
        Quantity inch2 = null;
        boolean equalsCheck = inch1.equals(inch2);
        Assert.assertFalse(equalsCheck);
    }

    @Test // value check
    public void givenInchValue_WhenEqual_ShouldReturnTrue() {
        Quantity inch1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 1.0);
        Quantity inch2 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 1.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenType_ForInch_WhenEqual_ShouldReturnTrue() {
        Quantity inch1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 1.0);
        Quantity inch2 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 1.0);
        boolean typeCheck = inch1.equals(inch2);
        Assert.assertEquals(true, typeCheck);
    }

    @Test
    public void givenObjectRef_ForInch_WhenEqual_ShouldReturnTrue() {
        Quantity inch1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 1.0);
        Quantity inch2 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 1.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1Inch_NotEqual_ShouldReturnFalse() {
        Quantity inch = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 1.0);
        Quantity feet = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 1.0);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void given1InchAnd1Feet_NotEqual_ShouldReturnFalse() {
        Quantity feet = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 1.0);
        Quantity inch = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 1.0);
        Assert.assertNotEquals(inch, feet);
    }

    @Test
    public void given1FeetAnd12Inch_Equal_ShouldReturnTrue() {
        try {
            Quantity feet = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 1.0);
            ExpectedException exception = ExpectedException.none();
            exception.expect(QuantityException.class);
            Quantity inch = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 12.0);
            boolean compareCheck = feet.Compare(inch);
            Assert.assertTrue(compareCheck);
        }
        catch(QuantityException e) {

            Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT, e.type);
        }
    }

    @Test
    public void given12InchAnd1Feet_Equal_ShouldReturnTrue() {
        try {
            Quantity inch = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 12.0);
            ExpectedException exception = ExpectedException.none();
            exception.expect(QuantityException.class);
            Quantity feet = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 1.0);
            boolean compareCheck = inch.Compare(feet);
            Assert.assertTrue(compareCheck);
        }
        catch(QuantityException e) {

            Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT, e.type);
        }
    }

        //<<<<<<<<<<<-------------- UC2 length------------>>>>>>>>>>>
        @Test
        public void given3FeetAnd1Yard_Equal_ShouldReturnTrue() throws QuantityException {
            try {
                Quantity feet = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 3.0);
                ExpectedException exception = ExpectedException.none();
                exception.expect(QuantityException.class);
                Quantity yard = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.YARD, 1.0);
                boolean compareCheck = feet.Compare(yard);
                Assert.assertTrue(compareCheck);
            }
            catch(QuantityException e) {

                Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT, e.type);
            }
        }
        @Test
        public void given1FeetAnd1Yard_NotEqual_ShouldReturnFalse() throws QuantityException {
            try {
                Quantity feet = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 1.0);
                ExpectedException exception = ExpectedException.none();
                exception.expect(QuantityException.class);
                Quantity yard = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.YARD, 1.0);
                boolean compareCheck = feet.Compare(yard);
                Assert.assertTrue(compareCheck);    }
            catch(QuantityException e) {

                Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT, e.type);
            }
    }

        @Test
        public void given1InchAnd1Yard_NotEqual_ShouldReturnFalse() {
            try {
                Quantity inch = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 1.0);
                ExpectedException exception = ExpectedException.none();
                exception.expect(QuantityException.class);
                Quantity yard = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.YARD, 1.0);
                boolean compareCheck = inch.Compare(yard);
                Assert.assertTrue(compareCheck);
            }
            catch(QuantityException e) {

                Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT, e.type);
            }
        }


        @Test
        public void given1YardAnd36Inch_Equal_ShouldReturnTrue() {
            try {
                Quantity yard =new Quantity(ConversionOfUnits.ConversionOfUnitEnum.YARD, 1.0);
                ExpectedException exception = ExpectedException.none();
                exception.expect(QuantityException.class);
                Quantity inch = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 36.0);
                boolean compareCheck = yard.Compare(inch);
                Assert.assertTrue(compareCheck);
            } catch (QuantityException e) {

                Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT, e.type);
            }
        }

        @Test
        public void given36InchAndYard_Equal_ShouldReturnTrue() {
            try {
                Quantity yard = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.YARD, 1.0);
                ExpectedException exception = ExpectedException.none();
                exception.expect(QuantityException.class);
                Quantity inch = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 36.0);
                boolean compareCheck = yard.Compare(inch);
                Assert.assertTrue(compareCheck);
            }
            catch(QuantityException e) {

                Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT, e.type);
            }
        }

        @Test
        public void givenInchAnd3Feet_Equal_ShouldReturnTrue() {
            try {
                Quantity yard = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.YARD, 1.0);
                ExpectedException exception = ExpectedException.none();
                exception.expect(QuantityException.class);
                Quantity feet = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 3.0);
                boolean compareCheck = yard.Compare(feet);
                Assert.assertTrue(compareCheck);
            }
            catch(QuantityException e) {

                Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT, e.type);
            }
        }
        // <<<<<<<<<<<<<<<<<--------------CENTIMETER ----------->>>>>>>>>>>>>>>>>>

    @Test
    public void given2InchAnd5cm_Equal_ShouldReturnTrue() throws QuantityException {
        try {
            Quantity inch = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 2.0);
            ExpectedException exception = ExpectedException.none();
            exception.expect(QuantityException.class);
            Quantity centimeter = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.CENTIMETER, 5.0);
            boolean compareCheck = inch.Compare(centimeter);
            Assert.assertTrue(compareCheck);
        }
        catch(QuantityException e) {

            Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT, e.type);
        }
    }

    //<<<<<<<<<<<<<<<<<<<<-----------ADDITION------------------>>>>>>>>>>>>>>>>>>>>>
    @Test
    public void given2InchAnd2inch_WhenAdded_ShouldReturn4inch() throws QuantityException {
        try {
            Quantity inch1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 2.0);
            ExpectedException exception = ExpectedException.none();
            exception.expect(QuantityException.class);
            Quantity inch2 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 2.0);
            double sum = inch1.addition(inch2);
            Assert.assertEquals(4, sum, 0.0);
        } catch (QuantityException e) {

            Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT, e.type);
        }
    }

    @Test
    public void given2InchAnd1Feet_WhenAdded_ShouldReturn14inch() throws QuantityException {
        try{
            Quantity inch1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 2.0);
            ExpectedException exception = ExpectedException.none();
            exception.expect(QuantityException.class);
            Quantity feet = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 1.0);
            double sum = inch1.addition(feet);
            Assert.assertEquals(14, sum, 0.0);
        } catch (QuantityException e) {

            Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT, e.type);
        }
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() throws QuantityException {
        try{
            Quantity feet1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 1.0);
            ExpectedException exception = ExpectedException.none();
            exception.expect(QuantityException.class);
            Quantity feet2 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FEET, 1.0);
            double sum = feet1.addition(feet2);
            Assert.assertEquals(24, sum, 0.0);
    } catch (QuantityException e) {

        Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT, e.type);
    }
    }

    @Test
    public void given2inchAnd2cm_WhenAdded_ShouldReturn3Inch() throws QuantityException {
       try{
             Quantity inch1 = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.INCH, 2.0);
             ExpectedException exception = ExpectedException.none();
             exception.expect(QuantityException.class);
            Quantity cenitmeter = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.CENTIMETER, 2.5);
            double sum = cenitmeter.addition(inch1);
            Assert.assertEquals(3, sum, 0.0);
    } catch (QuantityException e) {

        Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT, e.type);
    }
    }

    //<<<<<<<<<<<<<<<<<<<<<---------------GALLON & LITRE------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    @Test

    public void given1GallonAnd3L_ifEqual_ShouldReturnTrue() throws QuantityException {
      try{
            Quantity gallon = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.GALLON, 1.0);
            ExpectedException exception = ExpectedException.none();
            exception.expect(QuantityException.class);
            Quantity litre = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.LITRE, 3.78);
            boolean compareCheck = gallon.Compare(litre);
            Assert.assertTrue(compareCheck);
    } catch (QuantityException e) {

        Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT, e.type);
    }
}

    @Test

    public void given1GLAnd1000ml_ifEqual_ShouldReturnTrue() throws QuantityException {
        try{
            Quantity litre = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.LITRE, 1.0);
            ExpectedException exception = ExpectedException.none();
            exception.expect(QuantityException.class);
            Quantity millilitre = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.MILLILITRE, 1000.0);
            boolean compareCheck = litre.Compare(millilitre);
            Assert.assertTrue(compareCheck);

        } catch (QuantityException e) {

        Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT, e.type);
    }
    }

    @Test

    public void given1GLAnd3L_ifAdded_ShouldReturn7() throws QuantityException {
        try {
            Quantity gallon = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.GALLON, 1.0);
            ExpectedException exception = ExpectedException.none();
            exception.expect(QuantityException.class);
            Quantity litre = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.LITRE, 3.78);
            double sum = litre.addition(gallon);
            Assert.assertEquals(7.56, sum, 0.0);
        } catch (QuantityException e) {

            Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT, e.type);
        }
    }

    @Test

    public void given1LAnd1000ml_ifAdded_ShouldReturn2() throws QuantityException {
        try{
             Quantity litre = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.LITRE, 1.0);
             ExpectedException exception = ExpectedException.none();
             exception.expect(QuantityException.class);
             Quantity millilitre = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.MILLILITRE, 1000.0);
             double sum = litre.addition(millilitre);
             Assert.assertEquals(2.0, sum, 0.0);
        } catch (QuantityException e) {

        Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT, e.type);
    }
    }
    //<<<<<<<<<<<<<<<<-----------------------GRAMS--------------------->>>>>>>>>>>>>>>>>

    public void given1KGAnd1000g_ifEqual_ShouldReturnTrue() throws QuantityException {
        try{
            Quantity kilogram = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.KILOGRAM, 1.0);
            ExpectedException exception = ExpectedException.none();
            exception.expect(QuantityException.class);
            Quantity gram = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.GRAM, 1000.0);
            boolean compareCheck =kilogram.Compare(gram);
            Assert.assertTrue(compareCheck);
        } catch (QuantityException e) {

            Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT, e.type);
        }
    }
    @Test

    public void given1tonneAnd1000g_ifAdded_ShouldReturn1001Kg() throws QuantityException {
        try{
            Quantity tonne = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.TONNE, 1.0);
            ExpectedException exception = ExpectedException.none();
            exception.expect(QuantityException.class);
            Quantity gram = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.GRAM, 1000.0);
            double sum =tonne.addition(gram);
            Assert.assertEquals(1001,sum,0.0);
    } catch (QuantityException e) {

        Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT, e.type);
    }
    }
 @Test

    public void given212FahrenheitAnd100DegreeCelcius_ifEqual_ShouldReturnTrue() throws QuantityException {
        try{
            Quantity fahrenheit = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.FARENHEIT, 1.0);
            ExpectedException exception = ExpectedException.none();
            exception.expect(QuantityException.class);
            Quantity celsius = new Quantity(ConversionOfUnits.ConversionOfUnitEnum.CELCIUS, 1000.0);
            boolean compareCheck =fahrenheit.Compare(celsius);
            Assert.assertTrue(compareCheck);
        } catch (QuantityException e) {

        Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT, e.type);
    }
    }



}
