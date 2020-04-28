package com.bridgelabz.QuantityMeasurements;

import java.util.Objects;

public class Length {

    double FEET_TO_INCH;
    //  private static final double FEET_TO_INCH = 12.0;
    public Unit unit;

    public Length() {

    }

    public enum Unit {
        FEET(1 * 12.0), INCH(1.0); //taking based on inch 1 inch=1 inch, 1 feet=1*12 inch
        public double type;

        Unit(double type) {
            this.type = type;
        }

        public double getType() {

            return type;
        }
    }

    public double value;

    public static double unitConverter(Unit unit, double value) {
        return value * unit.getType();
    }

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length that) {
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
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}

