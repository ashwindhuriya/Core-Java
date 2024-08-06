package dev.lpa;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class MainChallenge {
    public static void main(String[] args) {
        Course pymc = new Course("PYMC", "Python MasterClass", 50);
        Course jmc = new Course("JMC", "Java MasterClass", 100);
        Course jgames = new Course("JGAME", "Creating games in Java");

//        List<Student> students = Stream.iterate(1, s -> s <= 1000, s -> s + 1)
//                .map(s -> Student.getRandomStudent(jmc, pymc))
//                .toList();

        List<Student> students = IntStream
                .rangeClosed(1, 5000)
                .mapToObj(s -> Student.getRandomStudent(jmc, pymc))
                .toList();

        double totalPercent = students.stream()
                .mapToDouble(s -> s.getPercentComplete("JMC"))
                .reduce(0, Double::sum);

        double avgPercent = totalPercent / students.size();
        System.out.printf("Average Percentage Complete = %.2f%% %n", avgPercent);

        int topPercent = (int) (1.25 * avgPercent);
        System.out.printf("Best Percentage Complete = %d%% %n", topPercent);

        Comparator<Student> comparator = Comparator.comparing(Student::getYearEnrolled);

        List<Student> hardWorkers = students.stream()
                .filter(s -> s.getMonthsSinceActive("JMC") == 0)
                .filter(s -> s.getPercentComplete("JMC") >= topPercent)
                .sorted(comparator)
                .limit(10)
                .toList();
        System.out.println("hardWorkers = " + hardWorkers.size());

        hardWorkers.forEach(s -> {
            s.addCourse(jgames);
            System.out.print(s.getStudentId() + " ");
        });

        System.out.println();

        Comparator<Student> uniqueSorted = comparator.thenComparing(Student::getStudentId);

        students.stream()
                .filter(s -> s.getMonthsSinceActive("JMC") == 0)
                .filter(s -> s.getPercentComplete("JMC") >= topPercent)
                .sorted(comparator)
                .limit(10)
//                .toList()
//                .collect(Collectors.toList())
//                .collect(() -> new TreeSet<>(uniqueSorted), TreeSet::add, TreeSet::addAll)
                .forEach(s -> {
            s.addCourse(jgames);
            System.out.print(s.getStudentId() + " ");
        });
    }
}
