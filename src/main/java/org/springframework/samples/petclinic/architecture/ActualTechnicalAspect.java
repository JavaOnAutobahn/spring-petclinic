package org.springframework.samples.petclinic.architecture;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marker for a code entity that belongs to a Technical Aspect.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ActualTechnicalAspect {
    String value();
}






