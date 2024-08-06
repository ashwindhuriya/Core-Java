package dev.lpa;

import dev.lpa.model.LPAStudent;
import dev.lpa.model.LPAStudentComparator;
import dev.lpa.util.QueryList;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        QueryList<LPAStudent> queryList = new QueryList<>();

        for(int i = 0; i < 10; i++) {
            queryList.add(new LPAStudent());
        }

        System.out.println("Ordered");
        queryList.sort(Comparator.naturalOrder());
        printList(queryList);

        var matches = queryList.getMatches("percentComplete", "50").getMatches("course", "java");
        matches.sort(new LPAStudentComparator());
        printList(matches);
    }

    public static void printList(List<?> students) {
        for(var student: students) {
            System.out.println(student);
        }
        System.out.println();
    }
}
