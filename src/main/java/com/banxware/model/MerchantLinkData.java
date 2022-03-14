package com.banxware.model;

import java.util.List;
import java.util.Objects;

public final class MerchantLinkData {
    private final String merchantId;
    private final String mcc;
    private final String name;
    private final String email;
    private final Address address;
    private final List<Owner> owners;
    private final Integer timeOfRunBusinessInMonths;
    private final List<Revenue> lastSixMonthsRevenue;
    private final String legalForm;
    private final String phoneNumber;
    private final String responsiblePublicAuthority;
    private final String foundationDate;
    private final String registrationNumber;
    private final String register;
    private final String crefoId;
    private final String website;
    private final Integer numberOfEmployees;
    private final String taxNumber;
    private final Boolean subjectToVat;
    private final String vatId;

    MerchantLinkData(String merchantId, String mcc, String name, String email, Address address, List<Owner> owners, Integer timeOfRunBusinessInMonths, List<Revenue> lastSixMonthsRevenue, String legalForm, String phoneNumber, String responsiblePublicAuthority, String foundationDate, String registrationNumber, String register, String crefoId, String website, Integer numberOfEmployees, String taxNumber, Boolean subjectToVat, String vatId) {
        this.merchantId = merchantId;
        this.mcc = mcc;
        this.name = name;
        this.email = email;
        this.address = address;
        this.owners = owners;
        this.timeOfRunBusinessInMonths = timeOfRunBusinessInMonths;
        this.lastSixMonthsRevenue = lastSixMonthsRevenue;
        this.legalForm = legalForm;
        this.phoneNumber = phoneNumber;
        this.responsiblePublicAuthority = responsiblePublicAuthority;
        this.foundationDate = foundationDate;
        this.registrationNumber = registrationNumber;
        this.register = register;
        this.crefoId = crefoId;
        this.website = website;
        this.numberOfEmployees = numberOfEmployees;
        this.taxNumber = taxNumber;
        this.subjectToVat = subjectToVat;
        this.vatId = vatId;
    }

    public static MerchantLinkDataBuilder builder() {
        return new MerchantLinkDataBuilder();
    }

    public String getMerchantId() {
        return merchantId;
    }

    public String getMcc() {
        return mcc;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public List<Owner> getOwners() {
        return owners;
    }

    public Integer getTimeOfRunBusinessInMonths() {
        return timeOfRunBusinessInMonths;
    }

    public List<Revenue> getLastSixMonthsRevenue() {
        return lastSixMonthsRevenue;
    }

    public String getLegalForm() {
        return legalForm;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getResponsiblePublicAuthority() {
        return responsiblePublicAuthority;
    }

    public String getFoundationDate() {
        return foundationDate;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getRegister() {
        return register;
    }

    public String getCrefoId() {
        return crefoId;
    }

    public String getWebsite() {
        return website;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public Boolean getSubjectToVat() {
        return subjectToVat;
    }

    public String getVatId() {
        return vatId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MerchantLinkData that = (MerchantLinkData) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(mcc, that.mcc) && Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(address, that.address) && Objects.equals(owners, that.owners) && Objects.equals(timeOfRunBusinessInMonths, that.timeOfRunBusinessInMonths) && Objects.equals(lastSixMonthsRevenue, that.lastSixMonthsRevenue) && Objects.equals(legalForm, that.legalForm) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(responsiblePublicAuthority, that.responsiblePublicAuthority) && Objects.equals(foundationDate, that.foundationDate) && Objects.equals(registrationNumber, that.registrationNumber) && Objects.equals(register, that.register) && Objects.equals(crefoId, that.crefoId) && Objects.equals(website, that.website) && Objects.equals(numberOfEmployees, that.numberOfEmployees) && Objects.equals(taxNumber, that.taxNumber) && Objects.equals(subjectToVat, that.subjectToVat) && Objects.equals(vatId, that.vatId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(merchantId, mcc, name, email, address, owners, timeOfRunBusinessInMonths, lastSixMonthsRevenue, legalForm, phoneNumber, responsiblePublicAuthority, foundationDate, registrationNumber, register, crefoId, website, numberOfEmployees, taxNumber, subjectToVat, vatId);
    }

    public String toString() {
        return "MerchantLinkData{" +
                "merchantId='" + merchantId + '\'' +
                ", mcc='" + mcc + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", owners=" + owners +
                ", timeOfRunBusinessInMonths=" + timeOfRunBusinessInMonths +
                ", lastSixMonthsRevenue=" + lastSixMonthsRevenue +
                ", legalForm='" + legalForm + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", responsiblePublicAuthority='" + responsiblePublicAuthority + '\'' +
                ", foundationDate='" + foundationDate + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", register='" + register + '\'' +
                ", crefoId='" + crefoId + '\'' +
                ", website='" + website + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                ", taxNumber='" + taxNumber + '\'' +
                ", subjectToVat=" + subjectToVat +
                ", vatId='" + vatId + '\'' +
                '}';
    }

    public static class MerchantLinkDataBuilder {
        private String merchantId;
        private String name;
        private String mcc;
        private String email;
        private Address address;
        private List<Owner> owners;
        private Integer timeOfRunBusinessInMonths;
        private List<Revenue> lastSixMonthsRevenue;
        private String legalForm;
        private String phoneNumber;
        private String responsiblePublicAuthority;
        private String foundationDate;
        private String registrationNumber;
        private String register;
        private String crefoId;
        private String website;
        private Integer numberOfEmployees;
        private String taxNumber;
        private Boolean subjectToVat;
        private String vatId;

        MerchantLinkDataBuilder() {
        }

        public MerchantLinkDataBuilder merchantId(String merchantId) {
            this.merchantId = merchantId;
            return this;
        }

        public MerchantLinkDataBuilder name(String name) {
            this.name = name;
            return this;
        }

        public MerchantLinkDataBuilder email(String email) {
            this.email = email;
            return this;
        }

        public MerchantLinkDataBuilder address(Address address) {
            this.address = address;
            return this;
        }

        public MerchantLinkDataBuilder owners(List<Owner> owners) {
            this.owners = owners;
            return this;
        }

        public MerchantLinkDataBuilder timeOfRunBusinessInMonths(Integer timeOfRunBusinessInMonths) {
            this.timeOfRunBusinessInMonths = timeOfRunBusinessInMonths;
            return this;
        }

        public MerchantLinkDataBuilder lastSixMonthsRevenue(List<Revenue> lastSixMonthsRevenue) {
            this.lastSixMonthsRevenue = lastSixMonthsRevenue;
            return this;
        }

        public MerchantLinkDataBuilder legalForm(String legalForm) {
            this.legalForm = legalForm;
            return this;
        }

        public MerchantLinkDataBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public MerchantLinkDataBuilder responsiblePublicAuthority(String responsiblePublicAuthority) {
            this.responsiblePublicAuthority = responsiblePublicAuthority;
            return this;
        }

        public MerchantLinkDataBuilder foundationDate(String foundationDate) {
            this.foundationDate = foundationDate;
            return this;
        }

        public MerchantLinkDataBuilder registrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
            return this;
        }

        public MerchantLinkDataBuilder register(String register) {
            this.register = register;
            return this;
        }

        public MerchantLinkDataBuilder crefoId(String crefoId) {
            this.crefoId = crefoId;
            return this;
        }

        public MerchantLinkDataBuilder website(String website) {
            this.website = website;
            return this;
        }

        public MerchantLinkDataBuilder numberOfEmployees(Integer numberOfEmployees) {
            this.numberOfEmployees = numberOfEmployees;
            return this;
        }

        public MerchantLinkDataBuilder taxNumber(String taxNumber) {
            this.taxNumber = taxNumber;
            return this;
        }

        public MerchantLinkDataBuilder subjectToVat(Boolean subjectToVat) {
            this.subjectToVat = subjectToVat;
            return this;
        }

        public MerchantLinkDataBuilder vatId(String vatId) {
            this.vatId = vatId;
            return this;
        }

        public MerchantLinkDataBuilder mcc(String mcc) {
            this.mcc = mcc;
            return this;
        }

        public MerchantLinkData build() {
            return new MerchantLinkData(merchantId, mcc, name, email, address, owners, timeOfRunBusinessInMonths, lastSixMonthsRevenue, legalForm, phoneNumber, responsiblePublicAuthority, foundationDate, registrationNumber, register, crefoId, website, numberOfEmployees, taxNumber, subjectToVat, vatId);
        }

        public String toString() {
            return "MerchantLinkData.MerchantLinkDataBuilder(merchantId=" + this.merchantId + ", name=" + this.name + ", email=" + this.email + ", address=" + this.address + ", owners=" + this.owners + ", timeOfRunBusinessInMonths=" + this.timeOfRunBusinessInMonths + ", lastSixMonthsRevenue=" + this.lastSixMonthsRevenue + ", legalForm=" + this.legalForm + ", phoneNumber=" + this.phoneNumber + ", responsiblePublicAuthority=" + this.responsiblePublicAuthority + ", foundationDate=" + this.foundationDate + ", registrationNumber=" + this.registrationNumber + ", register=" + this.register + ", crefoId=" + this.crefoId + ", website=" + this.website + ", numberOfEmployees=" + this.numberOfEmployees + ", taxNumber=" + this.taxNumber + ", subjectToVat=" + this.subjectToVat + ", vatId=" + this.vatId + ")";
        }
    }
}
