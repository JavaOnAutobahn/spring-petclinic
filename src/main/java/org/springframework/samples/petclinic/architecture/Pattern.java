package org.springframework.samples.petclinic.architecture;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marker for a code entity that belongs to a Pattern.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Pattern {
    String value();
}






