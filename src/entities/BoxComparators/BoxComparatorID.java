package entities.BoxComparators;
import java.util.Comparator;

import entities.Box;

public class BoxComparatorID extends ComparatorStructure implements Comparator<Box> {
    public BoxComparatorID(){super();};
    public BoxComparatorID (int order) {super(order);}
    @Override
    public int compare(Box arg0, Box arg1) {
        if (order < 0) {
            return -arg0.getId().compareTo(arg1.getId());
        } else {
            return arg0.getId().compareTo(arg1.getId());
        }
    }
}
