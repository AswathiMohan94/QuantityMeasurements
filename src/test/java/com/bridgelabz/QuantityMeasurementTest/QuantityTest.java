package com.bridgelabz.QuantityMeasurementTest;

import com.bridgelabz.QuantityMeasurements.Feet;
import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    @Test
    public void given0FeetAnd0FeetShouldReturnEqual(){
        Feet feet1=new Feet(0.0);
        Feet feet2=new Feet(0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Feet feet1=new Feet(0.0);
        Feet feet2=new Feet(1.0);
        Assert.assertNotEquals(feet1,feet2);

    }
}
