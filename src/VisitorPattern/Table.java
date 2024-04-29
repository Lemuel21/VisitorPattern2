package VisitorPattern;
public class Table implements FurnitureVisitable {
    private String name;
    private double length;
    private double width;

    public Table(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void accept(FurnitureVisitor visitor, double distance) {
        visitor.visit(length * width);
        System.out.printf("The %s: Will be shipped and will travel %.1f kilometers. Its shipping fee will cost %.1f PHP.\n",
                name, distance, ((ShippingCost) visitor).getTotalCost());
    }
}