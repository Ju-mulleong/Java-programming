package source0712;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit>{
    @Override
    //public int compare(Fruit o2, Fruit o1) { //내림차순
    public int compare(Fruit o1, Fruit o2) { //오름차순
        if (o1.price < o2.price) return -1;
        else if (o1.price == o2.price) return 0;
        else return 1;
    }
}
