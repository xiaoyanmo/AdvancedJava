package org.example;

public class Sum<T extends Number, K extends Number> {

    private T number1;
    private K number2;

    public T getNumber1() {
        return number1;
    }

    public void setNumber1(T number1) {
        this.number1 = number1;
    }

    public K getNumber2() {
        return number2;
    }

    public void setNumber2(K number2) {
        this.number2 = number2;
    }

    public Sum() {
    }

    public Sum(T number1, K number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public <V extends Number> V sum() {
        if (this.number1 == null || this.number2 == null) {
            return null;
        }
        if (this.number1 instanceof Double && this.number2 instanceof Double) {
            return (V) new Double(this.number1.doubleValue() + this.number2.doubleValue());
        } else if (this.number1 instanceof Integer && this.number2 instanceof Integer) {
            return (V) new Integer(this.number1.intValue() + this.number2.intValue());
        } else if (this.number1 instanceof Integer && this.number2 instanceof Double) {
            return (V) new Double(this.number1.intValue() + this.number2.doubleValue());
        } else if (this.number1 instanceof Double && this.number2 instanceof Integer) {
            return (V) new Double(this.number1.doubleValue() + this.number2.intValue());
        } else {
            throw new IllegalArgumentException("Type is not supported by this method");
        }
    }

}