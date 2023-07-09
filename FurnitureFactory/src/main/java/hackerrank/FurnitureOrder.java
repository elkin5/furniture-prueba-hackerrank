package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    private HashMap<Furniture, Integer> furnitureQuantity;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
        this.furnitureQuantity = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        this.furnitureQuantity.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return this.furnitureQuantity;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        final Float[] totalCost = {0f};
        this.furnitureQuantity.forEach((furniture, quantity)  ->
                totalCost[0] = totalCost[0] + furniture.cost() * quantity);
        return totalCost[0];
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        if (this.furnitureQuantity.containsKey(type)) {
            return this.furnitureQuantity.get(type);
        }
        return 0;
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        if (this.furnitureQuantity.get(type) != null)  {
            return type.cost() * this.furnitureQuantity.get(type);
        }
        return 0;
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        int total = 0;
        for (Map.Entry<Furniture, Integer> entry : this.furnitureQuantity.entrySet()) {
            total += entry.getValue();
        }
        return total;
    }
}