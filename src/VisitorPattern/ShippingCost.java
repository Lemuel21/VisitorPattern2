package VisitorPattern;
public class ShippingCost implements FurnitureVisitor {
    private double totalCost;

    public ShippingCost() {
        totalCost = 0;
    }

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public void visit(double parameter) {
        // Shipping cost based on furniture type and parameter
        totalCost = parameter * 10; // $10 per unit
    }
}