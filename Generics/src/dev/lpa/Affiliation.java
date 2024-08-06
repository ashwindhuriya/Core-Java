package dev.lpa;

public class Affiliation {
    private String name;
    private String type;
    private String countryCode;

    public Affiliation(String name, String type, String countryCode) {
        this.name = name;
        this.type = type;
        this.countryCode = countryCode;
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

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return name + " (" + type + " in " + countryCode + ")";
    }
}
