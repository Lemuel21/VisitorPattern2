package VisitorPattern;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        // Creating a map to store the mapping between furniture types and their visitor methods
        Map<Class<?>, FurnitureVisitor> visitorMap = new HashMap<>();
        visitorMap.put(Chair.class, new ShippingCost());
        visitorMap.put(Table.class, new ShippingCost());
        visitorMap.put(Sofa.class, new ShippingCost());

        // Creating some furniture items
        FurnitureVisitable[] furnitureList = {
                new Chair("Dining Chair", 7),
                new Chair("Kitchen Chair", 10),
                new Table("Dining Table", 5, 3),
                new Table("Bedroom Table", 2, 0.5),
                new Sofa("Living Room Sofa", 120),
                new Sofa("King's Sofa", 37)
        };

        double[] distances = {5, 7, 6, 25, 4, 5};


        for (int i = 0; i < furnitureList.length; i++) {
            FurnitureVisitable furniture = furnitureList[i];
            double distance = distances[i];
            FurnitureVisitor visitor = visitorMap.get(furniture.getClass());
            if (visitor != null) {
                furniture.accept(visitor, distance);
            }
        }
    }
}

