package dev.lpa;

import java.util.ArrayList;

class OrderItem {
    int qty;
    ProductForSale product;

    public OrderItem(int qty, ProductForSale product) {
        this.qty = qty;
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public ProductForSale getProduct() {
        return product;
    }

    public void setProduct(ProductForSale product) {
        this.product = product;
    }
}

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {
        storeProducts.add(new ArtObject("Oil Painting", "Impressionistic work by ABF painted in 2010", 1350));
        storeProducts.add(new ArtObject("Sculpture", "Bronze work by JFK, produced in 1950", 2000));
        storeProducts.add(new Furniture("Desk", "Mahagony Desk", 500));
        storeProducts.add(new Furniture("Lamp", "Tiffany Lamp with Hummingbirds", 200));

        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3, 5);
        addItemToOrder(order2, 0, 1);
        addItemToOrder(order2, 2, 1);
        printOrder(order2);
    }

    public static void listProducts() {
        for(var item: storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIdx, int qty) {
        order.add(new OrderItem(qty, storeProducts.get(orderIdx)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for(var item: order) {
            item.getProduct().printPricedItem(item.getQty());
            salesTotal += item.getProduct().getSalesPrice(item.getQty());
        }

        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }

}
