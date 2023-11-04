package buoi3.assignment;

import java.util.Comparator;

public class sortByMinutes implements Comparator<Subject> {
    public int compare(Subject s1, Subject s2) {
        if (s1.getEndMinutes() < s2.getEndMinutes())
            return -1;
        else
            return 1;
    }
}
