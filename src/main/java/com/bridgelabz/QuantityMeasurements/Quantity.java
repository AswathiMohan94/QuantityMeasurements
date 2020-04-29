package com.bridgelabz.QuantityMeasurements;
import com.bridgelabz.QuantityMeasurements.Unit;

public class Quantity {
    private static final double FEET_TO_INCH =12.0 ;
    public Unit unit;
    public double value;

    public Quantity(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }
    public double Addition(Quantity value){
        double value1=this.unit.getEnumValue()*this.value;
        double value2=this.unit.getEnumValue()*this.value;
        return value1+value2;

    }



    public static double unitConverter(Unit unit, double value) {
        return value * unit.getEnumValue();
    }


    public boolean compare(Quantity that) {
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * FEET_TO_INCH, that.value) == 0;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Double.compare(quantity.value, value) == 0 && unit == quantity.unit;
    }
}

