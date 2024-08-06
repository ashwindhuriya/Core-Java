package dev.lpa;

public class Main {
    public static void main(String[] args) {
        var nationalUSParks = new Park[] {
            new Park("Yellowstone", "44.4882, -110.5916"),
            new Park("Grand Canyon", "36.1085, -112.0965"),
            new Park("Yosemite", "37.8855, -119.5360")
        };

        var nationalRivers = new River[] {
                new River("Mississippi", "47.2160, -95.2348", "29.1566, -89.2495", "47.2160, -95.2348"),
                new River("Mississippi", "47.2160, -95.2348", "29.1566, -89.2495", "47.2160, -95.2348"),
                new River("Mississippi", "47.2160, -95.2348", "29.1566, -89.2495", "47.2160, -95.2348"),
        };

        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        System.out.println("-".repeat(20));

        Layer<River> riverLayer = new Layer<>(nationalRivers);
        riverLayer.addElements(new River("Collordo", "47.2160, -95.2348", "29.1566, -89.2495", "47.2160, -95.2348"), new River("Delaware", "47.2160, -95.2348", "29.1566, -89.2495", "47.2160, -95.2348"));
        riverLayer.renderLayer();
    }
}
