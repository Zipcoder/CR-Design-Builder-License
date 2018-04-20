package io.zipcoder.zcw_licensebuilder.domain.anthropoid.license;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 8/23/17.
 */
public class LicenseBuilderTest {

    private LicenseBuilder testBuilder;
    private Person testPerson;
    private License testLicense;


    @Test
    public void testNullaryConstructor() {
        testBuilder = new LicenseBuilder();
        License testLicense = testBuilder.build();
        Assert.assertNull(testLicense.getLastName());
        Assert.assertNull(testLicense.getIssueDate());
        Assert.assertNull(testLicense.getCity());
    }

    @Test
    public void testCreatePersonLicense() {
        testPerson = new Person();
        testPerson.setFirstName("Lawrence");
        testPerson.setState("NJ");
        testPerson.setFemale(false);
        testBuilder = new LicenseBuilder(testPerson);
        testLicense = testBuilder.build();
        Assert.assertEquals(testPerson.getFirstName(), testLicense.getFirstName());
        Assert.assertEquals(testPerson.getState(), testLicense.getState());
        Assert.assertEquals(testPerson.isFemale(), testLicense.isFemale());
        Assert.assertNull(testLicense.getIssueDate());
    }



}
