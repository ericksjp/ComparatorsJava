package entities.BoxComparators;

abstract class ComparatorStructure{
    protected int order = 0;

    public ComparatorStructure() {
    }

    public ComparatorStructure(int order) {
        this.order = order;
    }
}
