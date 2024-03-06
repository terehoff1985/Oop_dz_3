package DZ_3;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {
        
        Potok potok = new Potok();
        potok.addГруппа(new TichGroup());
        potok.addГруппа(new TichGroup());
        potok.addГруппа(new TichGroup());
    
        Collection<DZ_3.Potok> потоки;
        List<Potok> sortedPotokи = потоки.stream()
                .sorted(new StreamComparator())
                .collect(Collectors.toList());
    
        // Выводим отсортированный список Potokов
        for (final Potok потоки : sortedPotokи) {
            System.out.println(потоки);
        }
    }
    }

}
