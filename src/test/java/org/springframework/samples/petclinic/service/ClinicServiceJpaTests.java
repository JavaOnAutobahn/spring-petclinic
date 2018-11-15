package org.springframework.samples.petclinic.service;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p> Integration test using the jpa profile.
 *
 * @author Rod Johnson
 * @author Sam Brannen
 * @author Michael Isvy
 * @see AbstractClinicServiceTests AbstractClinicServiceTests for more details. </p>
 */

// tag::test_annotations[]
@ContextConfiguration(locations = {"classpath:spring/business-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("jpa") // <1>
public class ClinicServiceJpaTests extends AbstractClinicServiceTests {
// end::test_annotations[]
}
