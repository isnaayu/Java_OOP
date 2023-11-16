package model;

public class CalculatorImp implements Calculator{
    @Override
    public Double add(Double num1, Double num2) {
        return num1 + num2;
    }

    @Override
    public Double subtract(Double num1, Double num2) {
        return num1 - num2;
    }

    @Override
    public Double multiply(Double num1, Double num2) {
        return num1*num2;
    }

    @Override
    public Double divide(Double num1, Double num2) {
        if(num2 != 0){
            return num1/num2;
        }else {
            System.out.println("Angka yang dimasukkan tidak sesuai");
            return Double.NaN;
        }

    }
}
