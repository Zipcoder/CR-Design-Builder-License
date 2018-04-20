package io.zipcoder.zcw_licensebuilder.domain.anthropoid.license;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Person {

    @Id
    @GeneratedValue
    @Column(name = "PERSON_ID")
    private Long id;

    @Column(name = "PERSON_FIRSTNAME")
    private String firstName;

    @Column(name = "PERSON_LASTNAME")
    private String lastName;

    @Column(name = "PERSON_MIDDLENAME")
    private String middleName;

    @Column(name = "PERSON_STREETADDRESS")
    private String streetAddress;

    @Column(name = "PERSON_CITY")
    private String city;

    @Column(name = "PERSON_STATE")
    private String state;

    @Column(name = "PERSON_ISFEMALE")
    private boolean isFemale;

    @Column(name = "PERSON_BIRTHDATE")
    private Date birthDate;

    public Person(String firstName, String lastName, String middleName, String streetAddress,
                  String city, String state, boolean isFemale, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.isFemale = isFemale;
        this.birthDate = birthDate;
    }

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
