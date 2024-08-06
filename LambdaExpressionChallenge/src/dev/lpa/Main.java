package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {
        String sentence = "The Test Sentence";

        Consumer<String> printWordsForEach = (str) -> {
            String[] parts = str.split(" ");
            List<String> list = Arrays.asList(parts);
            list.forEach((s) -> System.out.println(s));
        };

        Consumer<String> printWordsCoincise = (str) -> {
            Arrays.asList(str.split(" ")).forEach((s) -> System.out.println(s));
        };

        Function<String, String> everySecondCharacter = (str) -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i < str.length(); i++) {
                if(i % 2 == 1) {
                    returnVal.append(str.charAt(i));
                }
            }

            return returnVal.toString();
        };

        Function<Integer, String> everySecondCharacterModified = (num) -> {

            String str = Integer.toString(num);
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i < str.length(); i++) {
                if(i % 2 == 1) {
                    returnVal.append(str.charAt(i));
                }
            }

            return returnVal.toString();
        };

        Supplier<String> iLoveString = () -> {
            return "I love Java";
        };

//        printTheParts(printWordsForEach, sentence);
//        System.out.println("--------");
//        printTheParts(printWordsCoincise, sentence);
//        System.out.println("--------");
//        String result = everySecondCharacter.apply(sentence);
//        System.out.println(result);
//        System.out.println("--------");
//        String newResult = everySecondCharacterModified.apply(1234567890);
//        System.out.println(newResult);
//        System.out.println("--------");
//        String supplierResult = iLoveString.get();
//        System.out.println(supplierResult);

        String[] names = {"Anna", "Bob", "Carole", "David", "Ed", "Fred", "Gary"};
        Arrays.setAll(names, i -> names[i].toUpperCase());
        System.out.println(Arrays.toString(names));

        List<String> backedByArray = Arrays.asList(names);

        backedByArray.replaceAll(s -> s += " " + getRandomChar('A', 'D') + ".");
        System.out.println("------------");
        System.out.println(Arrays.toString(names));

        backedByArray.replaceAll(s -> s += " " + getReversedName(s.split(" ")[0]));
        System.out.println("------------");
        Arrays.asList(names).forEach(s -> System.out.println(s));

        List<String> newList = new ArrayList<>(List.of(names));
        newList.removeIf(s -> s.substring(0, s.indexOf(" ")).equals(s.substring(s.lastIndexOf(" ") + 1)));
        System.out.println("-----------------");
        newList.forEach(s -> System.out.println(s));
    }

    public static char getRandomChar(char startChar, char endingChar) {
        return (char) random.nextInt((int) startChar, (int) endingChar + 1);
    }

    public static String getReversedName(String firstName) {
        return new StringBuilder(firstName).reverse().toString();
    }

    public static void printTheParts(Consumer<String> consumer, String sentence) {
        consumer.accept(sentence);
    }
}
