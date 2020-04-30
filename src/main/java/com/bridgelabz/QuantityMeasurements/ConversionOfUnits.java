package com.bridgelabz.QuantityMeasurements;

public class ConversionOfUnits {
    public enum ConversionOfUnitEnum {
        FEET {
            public double convertToUnits(double value) {
                return value = 12;
            }
        },
        YARD {
            public double convertToUnits(double value) {
                return value * 36;
            }
        },
        INCH {
            public double convertToUnits(double value) {
                return value;

            }
        },
        CENTIMETER {
            public double convertToUnits(double value) {
                return value / 2.5;
            }
        },
        LITRE {
            public double convertToUnits(double value) {
                return value;
            }
        },
        GALLON {
            public double convertToUnits(double value) {
                return value * 3.785;

            }
        },
        MILLILITRE {
            public double convertToUnits(double value) {
                return value / 1000;
            }
        },
        KILOGRAM {
            public double convertToUnits(double value) {
                return value * 1.0;
            }
        },
        TONNE {
            public double convertToUnits(double value) {
                return value * 1000;
            }
        },
        GRAM {
            public double convertToUnits(double value) {
                return value / 1000;
            }
        },
        FARENHEIT {
            public double convertToUnits(double value) {
                return value * 212.0;
            }
        },
        CELCIUS {
            public double convertToUnits(double value) {
                return value / 1000;
            }
        };


        public abstract double convertToUnits(double value);

        }
}
