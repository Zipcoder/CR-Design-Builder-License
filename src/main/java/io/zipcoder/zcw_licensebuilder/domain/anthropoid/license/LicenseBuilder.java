package io.zipcoder.zcw_licensebuilder.domain.anthropoid.license;

import java.util.Date;

public class LicenseBuilder {

    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String streetAddress;
    private String city;
    private String state;
    private boolean isFemale;
    private Date birthDate;
    private Date expirationDate;
    private Date issueDate;
    private Character licenseClass;

    public LicenseBuilder() {

    }

    public LicenseBuilder(Person p) {
        this.id = p.getId();
        this.firstName = p.getFirstName();
        this.lastName = p.getLastName();
        this.middleName = p.getMiddleName();
        this.streetAddress = p.getStreetAddress();
        this.city = p.getCity();
        this.state = p.getState();
        this.isFemale = p.isFemale();
        this.birthDate = p.getBirthDate();
    }

    public License build() {
        return new License(this.firstName, this.lastName, this.middleName, this.streetAddress, this.city, this.state,
                this.isFemale, this.birthDate, this.expirationDate, this.issueDate, this.licenseClass);
    }

    public LicenseBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public LicenseBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public LicenseBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public LicenseBuilder setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public LicenseBuilder setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
        return this;
    }

    public LicenseBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public LicenseBuilder setState(String state) {
        this.state = state;
        return this;
    }

    public LicenseBuilder setFemale(boolean female) {
        isFemale = female;
        return this;
    }

    public LicenseBuilder setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public LicenseBuilder setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    public LicenseBuilder setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    public LicenseBuilder setLicenseClass(Character licenseClass) {
        this.licenseClass = licenseClass;
        return this;
    }
}
