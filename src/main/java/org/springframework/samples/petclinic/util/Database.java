package org.springframework.samples.petclinic.util;

/**
 * I load nothing, but this will take long!
 */
public class Database {

    public SomeWeirdRecursiveDataStructure loadThing(long id) {
        // I'm a database, I have to take my time!
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            // just a demo, nothing to see here
        }
        return new SomeWeirdRecursiveDataStructure();
    }

    public long loadTreeElement(long id) {
        return 1L;
    }
}
