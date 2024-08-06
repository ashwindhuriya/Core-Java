public class Item {
    private String type;
    private String name;
    private double price;
    private String size = "Medium";

    public Item(String type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        if(type.equals("side") || type.equals("drink"))
        {
            return size + " " + name;
        }
        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getAdjustedPrice() {
        switch(size) {
            case "Small":
                return getBasePrice() - 0.5;
            case "Large":
                return getBasePrice() + 1;
            default:
                return getBasePrice();
        }
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s: %6.2f \n", name, price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }
}
