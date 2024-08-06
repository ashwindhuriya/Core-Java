package dev.lpa;

class FootballPlayer implements Player {
    private String name;
    private String position;

    public FootballPlayer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
