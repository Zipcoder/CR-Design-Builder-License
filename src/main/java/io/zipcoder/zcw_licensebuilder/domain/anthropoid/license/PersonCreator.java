package io.zipcoder.zcw_licensebuilder.domain.anthropoid.license;

import io.zipcoder.zcw_licensebuilder.utils.MockDataGenerator;

public class PersonCreator {

    public Person createMockPerson(PersonBuilder pb) {
        pb.setFirstName(MockDataGenerator.createString('a', 'z', 25));
        pb.setLastName(MockDataGenerator.createString('a', 'z', 30));
        pb.setMiddleName(MockDataGenerator.createString('a', 'z', 25));
        pb.setStreetAddress(MockDataGenerator.createString('a', 'z', 50));
        pb.setCity(MockDataGenerator.createString('a', 'z', 15));
        pb.setState(MockDataGenerator.createString('a', 'z', 2));
        pb.setFemale(MockDataGenerator.createBoolean(50));
        pb.setBirthDate(MockDataGenerator.createMonthDayYear(1980, 1990));
        return pb.build();
    }

    public Person createLicensedPerson(License l) {
        PersonBuilder pb = new PersonBuilder();
        pb.setFirstName(l.getFirstName());
        pb.setLastName(l.getLastName());
        pb.setMiddleName(l.getMiddleName());
        pb.setStreetAddress(l.getStreetAddress());
        pb.setCity(l.getCity());
        pb.setState(l.getState());
        pb.setFemale(l.isFemale());
        pb.setBirthDate(l.getBirthDate());
        return pb.build();
    }
}
