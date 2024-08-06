public class Car {
    private String make = "Lamborghini";
    private String model = "Veneno";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make) {
        if(make == null) {
            make = "Unknown";
        }

//        String lowerCaseMake = make.toLowerCase();
//        switch(lowerCaseMake) {
//            case "lamborghini", "ferrari", "ducati" -> this.make = make;
//            default -> {
//                this.make = "Unsupported";
//            }
//        }

        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println("Make: " + make + " Model: " + model + " Color: " + color + " Doors: " + doors + " Convertible: " + convertible);
    }
}
