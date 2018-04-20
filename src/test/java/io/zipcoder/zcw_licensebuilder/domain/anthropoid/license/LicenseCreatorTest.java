package io.zipcoder.zcw_licensebuilder.domain.anthropoid.license;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 8/23/17.
 */
public class LicenseCreatorTest {

    private LicenseCreator testCreator;
    private LicenseBuilder testBuilder;
    private Person testPerson;
    private License testLicense;

    @Before
    public void setup() {
        testBuilder = new LicenseBuilder();
        testCreator = new LicenseCreator();
    }

    @Test
    public void testNotNull() {
        testLicense = testCreator.createMockLicense(testBuilder);
        Assert.assertNotNull(testLicense.getFirstName());
        Assert.assertNotNull(testLicense.getLastName());
        Assert.assertNotNull(testLicense.getMiddleName());
        Assert.assertNotNull(testLicense.getStreetAddress());
        Assert.assertNotNull(testLicense.getState());
        Assert.assertNotNull(testLicense.getCity());
        Assert.assertNotNull(testLicense.getBirthDate());
        Assert.assertNotNull(testLicense.getExpirationDate());
        Assert.assertNotNull(testLicense.getIssueDate());
        Assert.assertNotNull(testLicense.getLicenseClass());
    }

    @Test
    public void testCreatePersonLicense() {
        testPerson = new Person();
        testPerson.setFirstName("Lawrence");
        testPerson.setState("NJ");
        testPerson.setFemale(false);
        testLicense = testCreator.createPersonLicense(testPerson);
        Assert.assertEquals(testPerson.getFirstName(), testLicense.getFirstName());
        Assert.assertEquals(testPerson.getState(), testLicense.getState());
        Assert.assertEquals(testPerson.isFemale(), testLicense.isFemale());
        Assert.assertNull(testLicense.getIssueDate());
    }


}
