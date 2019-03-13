package com.step.assignments.oop_part_1.hashset;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class SetOperation {

    private HashSet set1;
    private HashSet set2;

    public SetOperation(HashSet set1, HashSet set2) {
        this.set1 = set1;
        this.set2 = set2;
    }

    public Set getUnion() {
        HashSet set = new HashSet(set1);
        set.addAll(set2);
        return set;
    }

    public Set getIntersection() {
        HashSet set = new HashSet(set1);
        set.retainAll(set2);
        return set;
    }

    public Set getDifference() {
        HashSet set = new HashSet(this.set1);
        set.retainAll(set2);
        return set;
    }

}
