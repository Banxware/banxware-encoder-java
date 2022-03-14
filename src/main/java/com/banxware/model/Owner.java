package com.banxware.model;

import java.util.Objects;

public final class Owner {
    private final String title;
    private final String email;
    private final String firstName;
    private final String lastName;
    private final String dateOfBirth;
    private final String nationality;
    private final String taxNumber;
    private final Float sharesPercent; // TODO
    private final Boolean ultimateBeneficial;
    private final Boolean legalRepresentative;
    private final Boolean applicantOwner;
    private final Address address;

    Owner(String title, String email, String firstName, String lastName, String dateOfBirth, String nationality, String taxNumber, Float sharesPercent, Boolean ultimateBeneficial, Boolean legalRepresentative, Boolean applicantOwner, Address address) {
        this.title = title;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.taxNumber = taxNumber;
        this.sharesPercent = sharesPercent;
        this.ultimateBeneficial = ultimateBeneficial;
        this.legalRepresentative = legalRepresentative;
        this.applicantOwner = applicantOwner;
        this.address = address;
    }

    public static OwnerBuilder builder() {
        return new OwnerBuilder();
    }

    public String getTitle() {
        return this.title;
    }

    public String getEmail() {
        return this.email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getNationality() {
        return this.nationality;
    }

    public String getTaxNumber() {
        return this.taxNumber;
    }

    public Float getSharesPercent() {
        return this.sharesPercent;
    }

    public Boolean getUltimateBeneficial() {
        return this.ultimateBeneficial;
    }

    public Boolean getLegalRepresentative() {
        return this.legalRepresentative;
    }

    public Boolean getApplicantOwner() {
        return this.applicantOwner;
    }

    public Address getAddress() {
        return this.address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(title, owner.title) && Objects.equals(email, owner.email) && Objects.equals(firstName, owner.firstName) && Objects.equals(lastName, owner.lastName) && Objects.equals(dateOfBirth, owner.dateOfBirth) && Objects.equals(nationality, owner.nationality) && Objects.equals(taxNumber, owner.taxNumber) && Objects.equals(sharesPercent, owner.sharesPercent) && Objects.equals(ultimateBeneficial, owner.ultimateBeneficial) && Objects.equals(legalRepresentative, owner.legalRepresentative) && Objects.equals(applicantOwner, owner.applicantOwner) && Objects.equals(address, owner.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, email, firstName, lastName, dateOfBirth, nationality, taxNumber, sharesPercent, ultimateBeneficial, legalRepresentative, applicantOwner, address);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "title='" + title + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", nationality='" + nationality + '\'' +
                ", taxNumber='" + taxNumber + '\'' +
                ", sharesPercent=" + sharesPercent +
                ", ultimateBeneficial=" + ultimateBeneficial +
                ", legalRepresentative=" + legalRepresentative +
                ", applicantOwner=" + applicantOwner +
                ", address=" + address +
                '}';
    }

    public static class OwnerBuilder {
        private String title;
        private String email;
        private String firstName;
        private String lastName;
        private String dateOfBirth;
        private String nationality;
        private String taxNumber;
        private Float sharesPercent;
        private Boolean ultimateBeneficial;
        private Boolean legalRepresentative;
        private Boolean applicantOwner;
        private Address address;

        OwnerBuilder() {
        }

        public OwnerBuilder title(String title) {
            this.title = title;
            return this;
        }

        public OwnerBuilder email(String email) {
            this.email = email;
            return this;
        }

        public OwnerBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public OwnerBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public OwnerBuilder dateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public OwnerBuilder nationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public OwnerBuilder taxNumber(String taxNumber) {
            this.taxNumber = taxNumber;
            return this;
        }

        public OwnerBuilder sharesPercent(Float sharesPercent) {
            this.sharesPercent = sharesPercent;
            return this;
        }

        public OwnerBuilder ultimateBeneficial(Boolean ultimateBeneficial) {
            this.ultimateBeneficial = ultimateBeneficial;
            return this;
        }

        public OwnerBuilder legalRepresentative(Boolean legalRepresentative) {
            this.legalRepresentative = legalRepresentative;
            return this;
        }
        public OwnerBuilder applicantOwner(Boolean applicantOwner) {
            this.applicantOwner = applicantOwner;
            return this;
        }

        public OwnerBuilder address(Address address) {
            this.address = address;
            return this;
        }

        public Owner build() {
            return new Owner(title, email, firstName, lastName, dateOfBirth, nationality, taxNumber, sharesPercent, ultimateBeneficial, legalRepresentative, applicantOwner, address);
        }

        public String toString() {
            return "Owner.OwnerBuilder(title=" + this.title + ", email=" + this.email + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", dateOfBirth=" + this.dateOfBirth + ", nationality=" + this.nationality + ", taxNumber=" + this.taxNumber + ", sharesPercent=" + this.sharesPercent + ", ultimateBeneficial=" + this.ultimateBeneficial + ", legalRepresentative=" + this.legalRepresentative + ", address=" + this.address + ")";
        }
    }
}
