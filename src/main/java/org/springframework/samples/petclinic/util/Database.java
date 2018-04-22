package org.springframework.samples.petclinic.util;

import org.springframework.samples.petclinic.architecture.ActualTechnicalAspect;

/**
 * I load nothing, but this will take long!
 */
@ActualTechnicalAspect("PersistenceMechanism")
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
