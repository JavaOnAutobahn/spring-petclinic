package org.springframework.samples.petclinic.util;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marker for a code entity that has mixed Bounded Contexts.
 *
 * Signals code entities that need to be separated.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MixedBoundedContexts {
    String[] value();
}

