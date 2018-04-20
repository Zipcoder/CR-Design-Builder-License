package io.zipcoder.zcw_licensebuilder.domain.anthropoid.license;

import io.zipcoder.zcw_licensebuilder.utils.MockDataGenerator;

public class LicenseCreator {



    public License createMockLicense(LicenseBuilder lb) {
        lb.setFirstName(MockDataGenerator.createString('a', 'z', 25));
        lb.setLastName(MockDataGenerator.createString('a', 'z', 25));
        lb.setMiddleName(MockDataGenerator.createString('a', 'z', 25));
        lb.setStreetAddress(MockDataGenerator.createString('a', 'z', 50));
        lb.setState(MockDataGenerator.createString('a', 'z', 2));
        lb.setCity(MockDataGenerator.createString('a', 'z', 15));
        lb.setFemale(MockDataGenerator.createBoolean(50));
        lb.setBirthDate(MockDataGenerator.createMonthDayYear(1989, 1999));
        lb.setExpirationDate(MockDataGenerator.createMonthDayYear(2019, 2022));
        lb.setIssueDate(MockDataGenerator.createMonthDayYear(2014, 2017));
        lb.setLicenseClass(MockDataGenerator.createCharacter('a', 'f'));
        return lb.build();
    }

    public License createPersonLicense(Person p) {
        LicenseBuilder lb = new LicenseBuilder(p);
        return lb.build();
    }

    public License createPartiallyMockedLicense(Person p) {
        LicenseBuilder lb = new LicenseBuilder(p);
        return lb.setExpirationDate(MockDataGenerator.createMonthDayYear(2018, 2023))
                .setIssueDate(MockDataGenerator.createMonthDayYear(2014, 2018))
                .setLicenseClass(MockDataGenerator.createCharacter('a', 'f')).build();
    }

}
