package DZ_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Potok implements Iterable<TichGroup> {

    private List<TichGroup> группы;

    public Potok() {
        this.группы = new ArrayList<>();
    }

    public void addГруппа(TichGroup группа) {
        this.группы.add(группа);
    }

    @Override
    public Iterator<TichGroup> iterator() {
        return группы.iterator();
    }

    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

}