package dev.lpa;

enum FlightStages implements Trackable {
    GROUNDED,
    LAUNCH,
    CRUISE,
    DATA_COLLECTION;


    @Override
    public void track() {
        if(this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStage() {
        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];
    }
}

class DragonFly implements FlightEnabled {
    private String name;
    private String type;

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class Satellite implements OrbitEarth {

    FlightStages stage = FlightStages.GROUNDED;

    @Override
    public void achieveOrbit() {
        transition("Orbit Achieved!");
    }

    @Override
    public void takeOff() {
        transition("Taking Off");
    }

    @Override
    public void land() {
        transition("Landing");
    }

    @Override
    public void fly() {
        achieveOrbit();
        transition("Data Collection while Orbiting");
    }

    public void transition(String description) {
        System.out.println(description);
        stage = transition(stage);
        stage.track();
    }
}

interface OrbitEarth extends FlightEnabled {
    void achieveOrbit();

    private static void log(String description) {
        var today = new java.util.Date();
        System.out.println(today + ": " + description);
    }

    private void logState(FlightStages stage, String description) {
        description = stage + ": " + description;
        log(description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logState(stage, "Beginning Transition to " + nextStage);
        return nextStage;
    }
}

interface FlightEnabled {

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    public abstract void takeOff();
    abstract void land();
    void fly();

    default FlightStages transition(FlightStages stage) {
//        System.out.println("transition not implemented on " + getClass().getName());
//        return null;

        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }
}

interface Trackable {
    void track();
}

public abstract class Animal {
    public abstract void move();
}
