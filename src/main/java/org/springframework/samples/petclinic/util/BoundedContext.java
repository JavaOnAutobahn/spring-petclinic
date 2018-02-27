package org.springframework.samples.petclinic.util;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marker for a code entity that belongs to a Bounded Context.
 *
 * Use this to signal that there is already a clear context.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface BoundedContext {
    String value();
}






