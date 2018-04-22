package org.springframework.samples.petclinic.architecture;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marker for a code entity that belongs to a business' subdomain.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ActualSubdomain {
    String value();
}






