import java.util.Scanner;

public class Main {

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000)
        {
            return 1;
        } else if(playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if(playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    public static double convertToCentimeters(int height) {
        return height * 2.54d;
    }

    public static double convertToCentimeters(int heightFeet, int heightInch) {
        int feetToInch = heightFeet * 12;
        int totalHeight = feetToInch + heightInch;

        return convertToCentimeters(totalHeight);
    }

    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        int secs = seconds % 60;
        return getDurationString(minutes, secs);
    }

    public static String getDurationString(int minutes, int seconds) {
        int hours = minutes / 60;
        int mints = minutes % 60 + seconds / 60;
        int secs = seconds % 60;

        return hours + "h " + mints + " m " + secs + " s";
    }

    public static void switchStatement() {
        char ch = 'A';

        switch (ch) {
            case 'A':
                System.out.println("Able");
                break;
        }
    }

    public static void getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Enter your name: ");
        System.out.println("Hi, " + name);

        String dateOfBirth = System.console().readLine("Enter year of birth: ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        System.out.println("You are " + age + "year's old");
    }

    public static void getInputFromScanner(int currentYear) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hi, " + name);

        System.out.println("Enter year of birth: ");
        String dateOfBirth = sc.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth);

        System.out.println("You are " + age + "year's old");
    }


    public static void main(String[] args) {
//        int[] scores = {1500, 1000, 500, 100, 25};
//
//        for(int i = 0; i < scores.length; i++) {
//            int playerPosition = calculateHighScorePosition(scores[i]);
//            displayHighScorePosition("player" + (i + 1), playerPosition);
//        }

//        System.out.println(convertToCentimeters(12));
//        System.out.println(convertToCentimeters(12, 24));

//        System.out.println(getDurationString(3700));
//        System.out.println(getDurationString(60,130));
        try {
            getInputFromConsole(2024);
        } catch (NullPointerException e) {
            getInputFromScanner(2024);
        }
    }
}
