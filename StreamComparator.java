package DZ_3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Potok> {

    @Override
    public int compare(Potok o1, Potok o2) {
        return Integer.compare(o1.size(), o2.size());
    }

}
