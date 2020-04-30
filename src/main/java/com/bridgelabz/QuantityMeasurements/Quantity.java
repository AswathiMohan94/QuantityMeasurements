package com.bridgelabz.QuantityMeasurements;

public class Quantity {
    public ConversionOfUnits.ConversionOfUnitEnum unit;
    public double value;

    public Quantity(ConversionOfUnits.ConversionOfUnitEnum unit, double value) {
        this.unit = unit;
        this.value = value;
    }
    public double addition(Quantity that) throws QuantityException {
        if (this.unit.equals(that.unit)) {
            double convert1 = this.unit.convertToUnits( this.value);
            double convert2 = this.unit.convertToUnits(this.value);
            return convert1 + convert2;
        }else

            throw new QuantityException("wrong unit", QuantityException.ExceptionType.INVALID_UNIT);
    }
    public boolean Compare(Quantity that) throws QuantityException {
        if(this.unit.equals(that.unit)) {
            double value1 = this.unit.convertToUnits(this.value);
            double value2 = this.unit.convertToUnits(this.value);
            return (Double.compare(value1, value2) == 0);
       }
        else
            throw new QuantityException("wrong unit",QuantityException.ExceptionType.INVALID_UNIT);

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Double.compare(quantity.value, value) == 0 && unit == quantity.unit;
    }
}

