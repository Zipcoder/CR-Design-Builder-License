package io.zipcoder.zcw_licensebuilder.domain.anthropoid;

import io.zipcoder.zcw_licensebuilder.domain.anthropoid.license.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 8/23/17.
 */
public class PersonCreatorTest {

    private PersonCreator testCreator;
    private PersonBuilder testBuilder;
    private Person testPerson;
    private License testLicense;
    private LicenseCreator licenseCreator;
    private LicenseBuilder lb;

    @Before
    public void setup() {
        testCreator = new PersonCreator();
        testBuilder = new PersonBuilder();
        licenseCreator = new LicenseCreator();
        lb = new LicenseBuilder();
    }

    @Test
    public void testNotNull() {
        testPerson = testCreator.createMockPerson(testBuilder);
        Assert.assertNotNull(testPerson.getFirstName());
        Assert.assertNotNull(testPerson.getLastName());
        Assert.assertNotNull(testPerson.getMiddleName());
        Assert.assertNotNull(testPerson.getStreetAddress());
        Assert.assertNotNull(testPerson.getCity());
        Assert.assertNotNull(testPerson.getState());
        Assert.assertNotNull(testPerson.getBirthDate());
    }

    @Test
    public void testCreatePersonFromLicense() {
        testLicense = licenseCreator.createMockLicense(lb);
        testPerson = testCreator.createLicensedPerson(testLicense);
        Assert.assertEquals(testLicense.getFirstName(), testPerson.getFirstName());
        Assert.assertEquals(testLicense.getLastName(), testPerson.getLastName());
        Assert.assertEquals(testLicense.getCity(), testPerson.getCity());
        Assert.assertEquals(testLicense.isFemale(), testPerson.isFemale());
    }

}
