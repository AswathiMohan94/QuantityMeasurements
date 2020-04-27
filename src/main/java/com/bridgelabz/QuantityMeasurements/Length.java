package com.bridgelabz.QuantityMeasurements;

import java.util.Objects;

public class Length {
    private final Unit unit;

    public enum Unit {FEET,INCH;}
    private final double value;

    public Length(Unit unit,double value) {
        this.unit=unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }


}
