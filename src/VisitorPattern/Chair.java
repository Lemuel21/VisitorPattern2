package VisitorPattern;
public class Chair implements FurnitureVisitable {
    private String name;
    private double weight; // Weight of the chair

    public Chair(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(FurnitureVisitor visitor, double distance) {
        visitor.visit(weight);
        System.out.println("The " + name + ": Will be shipped and will travel " + String.format("%.1f", distance) +
                " kilometers. Its shipping fee will cost " + String.format("%.1f", ((ShippingCost) visitor).getTotalCost()) + " PHP.");
    }
}
