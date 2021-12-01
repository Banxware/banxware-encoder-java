package com.banxware.model;

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
    private final Address address;

    Owner(String title, String email, String firstName, String lastName, String dateOfBirth, String nationality, String taxNumber, Float sharesPercent, Boolean ultimateBeneficial, Boolean legalRepresentative, Address address) {
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

    public Address getAddress() {
        return this.address;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Owner)) return false;
        final Owner other = (Owner) o;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
        final Object this$firstName = this.getFirstName();
        final Object other$firstName = other.getFirstName();
        if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName)) return false;
        final Object this$lastName = this.getLastName();
        final Object other$lastName = other.getLastName();
        if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
        final Object this$dateOfBirth = this.getDateOfBirth();
        final Object other$dateOfBirth = other.getDateOfBirth();
        if (this$dateOfBirth == null ? other$dateOfBirth != null : !this$dateOfBirth.equals(other$dateOfBirth))
            return false;
        final Object this$nationality = this.getNationality();
        final Object other$nationality = other.getNationality();
        if (this$nationality == null ? other$nationality != null : !this$nationality.equals(other$nationality))
            return false;
        final Object this$taxNumber = this.getTaxNumber();
        final Object other$taxNumber = other.getTaxNumber();
        if (this$taxNumber == null ? other$taxNumber != null : !this$taxNumber.equals(other$taxNumber)) return false;
        final Object this$sharesPercent = this.getSharesPercent();
        final Object other$sharesPercent = other.getSharesPercent();
        if (this$sharesPercent == null ? other$sharesPercent != null : !this$sharesPercent.equals(other$sharesPercent))
            return false;
        final Object this$ultimateBeneficial = this.getUltimateBeneficial();
        final Object other$ultimateBeneficial = other.getUltimateBeneficial();
        if (this$ultimateBeneficial == null ? other$ultimateBeneficial != null : !this$ultimateBeneficial.equals(other$ultimateBeneficial))
            return false;
        final Object this$legalRepresentative = this.getLegalRepresentative();
        final Object other$legalRepresentative = other.getLegalRepresentative();
        if (this$legalRepresentative == null ? other$legalRepresentative != null : !this$legalRepresentative.equals(other$legalRepresentative))
            return false;
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        final Object $firstName = this.getFirstName();
        result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
        final Object $lastName = this.getLastName();
        result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
        final Object $dateOfBirth = this.getDateOfBirth();
        result = result * PRIME + ($dateOfBirth == null ? 43 : $dateOfBirth.hashCode());
        final Object $nationality = this.getNationality();
        result = result * PRIME + ($nationality == null ? 43 : $nationality.hashCode());
        final Object $taxNumber = this.getTaxNumber();
        result = result * PRIME + ($taxNumber == null ? 43 : $taxNumber.hashCode());
        final Object $sharesPercent = this.getSharesPercent();
        result = result * PRIME + ($sharesPercent == null ? 43 : $sharesPercent.hashCode());
        final Object $ultimateBeneficial = this.getUltimateBeneficial();
        result = result * PRIME + ($ultimateBeneficial == null ? 43 : $ultimateBeneficial.hashCode());
        final Object $legalRepresentative = this.getLegalRepresentative();
        result = result * PRIME + ($legalRepresentative == null ? 43 : $legalRepresentative.hashCode());
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        return result;
    }

    public String toString() {
        return "Owner(title=" + this.getTitle() + ", email=" + this.getEmail() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", dateOfBirth=" + this.getDateOfBirth() + ", nationality=" + this.getNationality() + ", taxNumber=" + this.getTaxNumber() + ", sharesPercent=" + this.getSharesPercent() + ", ultimateBeneficial=" + this.getUltimateBeneficial() + ", legalRepresentative=" + this.getLegalRepresentative() + ", address=" + this.getAddress() + ")";
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

        public OwnerBuilder address(Address address) {
            this.address = address;
            return this;
        }

        public Owner build() {
            return new Owner(title, email, firstName, lastName, dateOfBirth, nationality, taxNumber, sharesPercent, ultimateBeneficial, legalRepresentative, address);
        }

        public String toString() {
            return "Owner.OwnerBuilder(title=" + this.title + ", email=" + this.email + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", dateOfBirth=" + this.dateOfBirth + ", nationality=" + this.nationality + ", taxNumber=" + this.taxNumber + ", sharesPercent=" + this.sharesPercent + ", ultimateBeneficial=" + this.ultimateBeneficial + ", legalRepresentative=" + this.legalRepresentative + ", address=" + this.address + ")";
        }
    }
}
