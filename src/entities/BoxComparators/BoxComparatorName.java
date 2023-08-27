package entities.BoxComparators;
import java.util.Comparator;

import entities.Box;

public class BoxComparatorName extends ComparatorStructure implements Comparator<Box> {
    public BoxComparatorName(){};
    public BoxComparatorName (int order) {super(order);}
    @Override
    public int compare(Box arg0, Box arg1) {
        if (order < 0) {
            return -arg0.getName().compareTo(arg1.getName());
        } else {
            return arg0.getName().compareTo(arg1.getName());
        }
    }
}
