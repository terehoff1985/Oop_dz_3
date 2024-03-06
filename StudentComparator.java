package DZ_3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getОценка(), o2.getОценка());
    }

    @Override
    public String toString() {
        return "StudentComparator []";
    }

}