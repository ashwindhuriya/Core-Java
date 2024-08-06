public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("Large");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 1.50);
//        avocado.printItem();

//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("bacon", "cheese", "mayo");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("bacon", "cheese", "mayo");
//        regularMeal.setDrinkSize("Large");
//        regularMeal.printItemizedList();

//        MealOrder secondMeal = new MealOrder("turkey", "mountain-dew", "chili");
//        secondMeal.addBurgerToppings("lettuces", "cheese", "mayo");
//        secondMeal.setDrinkSize("Small");
//        secondMeal.printItemizedList();

        MealOrder deluxMeal = new MealOrder("delux", "7-up", "chili");
        deluxMeal.addBurgerToppings("avocado", "bacon", "cheese", "lettuces", "mayo");
        deluxMeal.setDrinkSize("Large");
        deluxMeal.printItemizedList();
    }
}
