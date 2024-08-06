package dev.lpa.model;

public class LPAStudent extends Student {
    private double percentComplete;

    public LPAStudent() {
        percentComplete = random.nextDouble() * 100 + 1;
    }

    @Override
    public String toString() {
        return String.format("%s %8.1f%%", super.toString(), percentComplete);
    }

    public double getPercentComplete() {
        return percentComplete;
    }
}
