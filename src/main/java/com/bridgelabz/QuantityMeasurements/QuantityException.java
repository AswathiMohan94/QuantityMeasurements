package com.bridgelabz.QuantityMeasurements;

public class QuantityException extends Exception {
    public final ExceptionType type;

    public QuantityException(String message, ExceptionType type)
    {
        super(message);
        this.type=type;
    }
    public enum ExceptionType{
        INVALID_UNIT;
    }
}
