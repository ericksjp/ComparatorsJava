package entities.BoxComparators;
import java.util.Comparator;

import entities.Box;

public class BoxComparatorIdade extends ComparatorStructure implements Comparator<Box> {
    public BoxComparatorIdade(){super();};
    public BoxComparatorIdade (int order) {super(order);}
    @Override
    public int compare(Box arg0, Box arg1) {
        if (order < 0) {
            return -arg0.getIdade().compareTo(arg1.getIdade());
        } else {
            return arg0.getIdade().compareTo(arg1.getIdade());
        }
    }
}
