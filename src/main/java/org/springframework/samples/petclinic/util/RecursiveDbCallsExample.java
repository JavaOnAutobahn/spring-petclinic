package org.springframework.samples.petclinic.util;

import java.util.ArrayList;
import java.util.List;

public class RecursiveDbCallsExample {

    // just simulate bad dependency injection practices here with a static field...
    private static Database database;

    private List<String> loadParent(long id, List<SomeWeirdRecursiveDataStructure> results){

        SomeWeirdRecursiveDataStructure leaf = null;
        leaf = database.loadThing(id);
        results.add(leaf);
        long parentId = leaf.getParentId();
        return loadParent(parentId, results);

    }

    public void getThatWholeTree(long leaf){

        List<SomeWeirdRecursiveDataStructure> results = new ArrayList<>();
        this.loadParent(leaf,results);

    }
}
