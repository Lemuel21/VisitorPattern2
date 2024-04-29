package VisitorPattern;

public class Sofa implements FurnitureVisitable {
    private String name;
    private double size; // Size of the sofa

    public Sofa(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public void accept(FurnitureVisitor visitor, double distance) {
        visitor.visit(size);
        System.out.printf("The %s: Will be shipped and will travel %.1f kilometers. Its shipping fee will cost %.1f PHP.\n",
                name, distance, ((ShippingCost) visitor).getTotalCost());
    }
}