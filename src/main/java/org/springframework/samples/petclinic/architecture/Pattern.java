package org.springframework.samples.petclinic.architecture;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marker for a code entity that implements a specific architecture or design patten.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Pattern {
    String value();
}






