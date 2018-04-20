package io.zipcoder.zcw_licensebuilder.domain.anthropoid.license;

import java.util.Date;

public class PersonBuilder {

    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String streetAddress;
    private String city;
    private String state;
    private boolean isFemale;
    private Date birthDate;

    public PersonBuilder() {

    }

    public Person build() {
        return new Person(this.firstName, this.lastName, this.middleName, this.streetAddress,
                this.city, this.state, this.isFemale, this.birthDate);
    }

    public PersonBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public PersonBuilder setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public PersonBuilder setState(String state) {
        this.state = state;
        return this;
    }

    public PersonBuilder setFemale(boolean female) {
        isFemale = female;
        return this;
    }

    public PersonBuilder setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }
}
