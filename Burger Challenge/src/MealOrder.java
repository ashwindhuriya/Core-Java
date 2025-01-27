public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder(String burgerType, String drinkType, String sideType) {

        if(burgerType.equals("delux")) {
            this.burger = new DeluxBurger(burgerType, 8.5);
            this.drink = new Item("drink", drinkType, 0.00);
            this.side = new Item("side", sideType, 0.00);
        } else {
            this.burger = new Burger(burgerType, 4.0);
            this.drink = new Item("drink", drinkType, 1.00);
            this.side = new Item("side", sideType, 1.50);
        }
    }

    public MealOrder() {
        this("regular", "coke", "fries");
    }

    public double getTotalPrice() {

        if(burger instanceof DeluxBurger) {
            return burger.getAdjustedPrice();
        }

        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public void printItemizedList() {
        burger.printItem();

        if(burger instanceof DeluxBurger) {
            Item.printItem(drink.getName(), 0.0);
            Item.printItem(side.getName(), 0.0);
        } else {
            drink.printItem();
            side.printItem();
        }

        System.out.println("-".repeat(30));
        Item.printItem("Total Price", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }
    public void addBurgerToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        if(burger instanceof DeluxBurger) {
            ((DeluxBurger) burger).addToppings(extra1, extra2, extra3, extra4, extra5);
        } else {
            burger.addToppings(extra1, extra2, extra3);
        }
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }
}
