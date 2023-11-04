package buoi3.assignment.bai1;

import java.util.Comparator;

public class sortByRevenue implements Comparator<Vegetable> {

    public int compare(Vegetable v1, Vegetable v2) {
        if (v1.getTotalRevenue() > v2.getTotalRevenue())
            return 1;
        else
            return -1;

    }
}
