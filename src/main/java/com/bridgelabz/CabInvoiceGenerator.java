package com.bridgelabz;

public class CabInvoiceGenerator {
    static final  double COST_PER_KM=10;
    static final  double COST_PER_MINUTE=1;
    static final  double MINIMUM_COST=5;


    public double calculateTotalFair(double distans, double time) {
        double distance = 0;
        double cost =distance*COST_PER_KM+time*COST_PER_MINUTE;
        return cost;
    }
}



