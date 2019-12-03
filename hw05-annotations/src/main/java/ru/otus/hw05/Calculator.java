package ru.otus.hw05;

public class Calculator {
    
    private double sum = 0;
    
    public void add(double val){
        this.sum += val;
    }

    public void subtract(double val){
        this.sum -= val;
    }

    public double getSum (){
        return this.sum;
    }
    
}
