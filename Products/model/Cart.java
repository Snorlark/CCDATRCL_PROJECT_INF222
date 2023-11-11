package Products.model;

import java.util.ArrayList;
import java.util.HashSet;

import Products.filodroid;
import javafx.scene.layout.Pane;

public class Cart {
    
    private ArrayList<Pane> items = new ArrayList<>();
    private ArrayList<filodroid> roidItem = new ArrayList<>();;

    public Cart() {
        this.items = new ArrayList<>();
        this.roidItem = new ArrayList<>();
    }

    public void addPaneItem(Pane pane, filodroid product) {
        if (!items.contains(pane)) {
            items.add(pane);
        }
        roidItem.add(product);
    }

    public void addQty(filodroid product) {
        double currentQuantity = product.getProductQuantity();
        if (currentQuantity > 1) {
            product.addProductQuantity(1);
        }
    }

    public void decrQuantity(filodroid product) {
        double currentQuantity = product.getProductQuantity();
        if (currentQuantity > 1) {
            product.addProductQuantity(-1);
        }
    }

    public double getQty(filodroid item) {
        for (filodroid product : roidItem) {
            if (product.equals(item)) {
                return product.getProductQuantity();
            }
        }
        return 0;
    }

    public void showItems() {
        System.out.println("Pane Items: " + items);
        System.out.println("Product Items: " + roidItem);
    }

    public ArrayList<Pane> getItemList() {
        return items;
    }

}