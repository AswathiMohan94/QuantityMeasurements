package com.bridgelabz.QuantityMeasurements;

public enum Unit {
    FEET(1 * 12.0), INCH(1.0), YARD(3 * 12.0), CENTIMETER(1 / 2.5),
    GALLON(3.78), LITRE(1.0), MILLILITRE(1 * 1000); //taking based on inch 1 inch=1 inch, 1 feet=1*12 inch
    private double enumValue;

    Unit(double enumValue) {
        this.enumValue = enumValue;
    }

    public double getEnumValue() {
        return enumValue;

    }
}
