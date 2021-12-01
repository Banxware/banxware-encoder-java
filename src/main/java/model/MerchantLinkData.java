package model;

import java.util.List;

public final class MerchantLinkData {
    private final String merchantId;
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

    MerchantLinkData(String merchantId, String name, String email, Address address, List<Owner> owners, Integer timeOfRunBusinessInMonths, List<Revenue> lastSixMonthsRevenue, String legalForm, String phoneNumber, String responsiblePublicAuthority, String foundationDate, String registrationNumber, String register, String crefoId, String website, Integer numberOfEmployees, String taxNumber, Boolean subjectToVat, String vatId) {
        this.merchantId = merchantId;
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
        return this.merchantId;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public Address getAddress() {
        return this.address;
    }

    public List<Owner> getOwners() {
        return this.owners;
    }

    public Integer getTimeOfRunBusinessInMonths() {
        return this.timeOfRunBusinessInMonths;
    }

    public List<Revenue> getLastSixMonthsRevenue() {
        return this.lastSixMonthsRevenue;
    }

    public String getLegalForm() {
        return this.legalForm;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getResponsiblePublicAuthority() {
        return this.responsiblePublicAuthority;
    }

    public String getFoundationDate() {
        return this.foundationDate;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public String getRegister() {
        return this.register;
    }

    public String getCrefoId() {
        return this.crefoId;
    }

    public String getWebsite() {
        return this.website;
    }

    public Integer getNumberOfEmployees() {
        return this.numberOfEmployees;
    }

    public String getTaxNumber() {
        return this.taxNumber;
    }

    public Boolean getSubjectToVat() {
        return this.subjectToVat;
    }

    public String getVatId() {
        return this.vatId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MerchantLinkData)) return false;
        final MerchantLinkData other = (MerchantLinkData) o;
        final Object this$merchantId = this.getMerchantId();
        final Object other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !this$merchantId.equals(other$merchantId))
            return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        final Object this$owners = this.getOwners();
        final Object other$owners = other.getOwners();
        if (this$owners == null ? other$owners != null : !this$owners.equals(other$owners)) return false;
        final Object this$timeOfRunBusinessInMonths = this.getTimeOfRunBusinessInMonths();
        final Object other$timeOfRunBusinessInMonths = other.getTimeOfRunBusinessInMonths();
        if (this$timeOfRunBusinessInMonths == null ? other$timeOfRunBusinessInMonths != null : !this$timeOfRunBusinessInMonths.equals(other$timeOfRunBusinessInMonths))
            return false;
        final Object this$lastSixMonthsRevenue = this.getLastSixMonthsRevenue();
        final Object other$lastSixMonthsRevenue = other.getLastSixMonthsRevenue();
        if (this$lastSixMonthsRevenue == null ? other$lastSixMonthsRevenue != null : !this$lastSixMonthsRevenue.equals(other$lastSixMonthsRevenue))
            return false;
        final Object this$legalForm = this.getLegalForm();
        final Object other$legalForm = other.getLegalForm();
        if (this$legalForm == null ? other$legalForm != null : !this$legalForm.equals(other$legalForm)) return false;
        final Object this$phoneNumber = this.getPhoneNumber();
        final Object other$phoneNumber = other.getPhoneNumber();
        if (this$phoneNumber == null ? other$phoneNumber != null : !this$phoneNumber.equals(other$phoneNumber))
            return false;
        final Object this$responsiblePublicAuthority = this.getResponsiblePublicAuthority();
        final Object other$responsiblePublicAuthority = other.getResponsiblePublicAuthority();
        if (this$responsiblePublicAuthority == null ? other$responsiblePublicAuthority != null : !this$responsiblePublicAuthority.equals(other$responsiblePublicAuthority))
            return false;
        final Object this$foundationDate = this.getFoundationDate();
        final Object other$foundationDate = other.getFoundationDate();
        if (this$foundationDate == null ? other$foundationDate != null : !this$foundationDate.equals(other$foundationDate))
            return false;
        final Object this$registrationNumber = this.getRegistrationNumber();
        final Object other$registrationNumber = other.getRegistrationNumber();
        if (this$registrationNumber == null ? other$registrationNumber != null : !this$registrationNumber.equals(other$registrationNumber))
            return false;
        final Object this$register = this.getRegister();
        final Object other$register = other.getRegister();
        if (this$register == null ? other$register != null : !this$register.equals(other$register)) return false;
        final Object this$crefoId = this.getCrefoId();
        final Object other$crefoId = other.getCrefoId();
        if (this$crefoId == null ? other$crefoId != null : !this$crefoId.equals(other$crefoId)) return false;
        final Object this$website = this.getWebsite();
        final Object other$website = other.getWebsite();
        if (this$website == null ? other$website != null : !this$website.equals(other$website)) return false;
        final Object this$numberOfEmployees = this.getNumberOfEmployees();
        final Object other$numberOfEmployees = other.getNumberOfEmployees();
        if (this$numberOfEmployees == null ? other$numberOfEmployees != null : !this$numberOfEmployees.equals(other$numberOfEmployees))
            return false;
        final Object this$taxNumber = this.getTaxNumber();
        final Object other$taxNumber = other.getTaxNumber();
        if (this$taxNumber == null ? other$taxNumber != null : !this$taxNumber.equals(other$taxNumber)) return false;
        final Object this$subjectToVat = this.getSubjectToVat();
        final Object other$subjectToVat = other.getSubjectToVat();
        if (this$subjectToVat == null ? other$subjectToVat != null : !this$subjectToVat.equals(other$subjectToVat))
            return false;
        final Object this$vatId = this.getVatId();
        final Object other$vatId = other.getVatId();
        if (this$vatId == null ? other$vatId != null : !this$vatId.equals(other$vatId)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $merchantId = this.getMerchantId();
        result = result * PRIME + ($merchantId == null ? 43 : $merchantId.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        final Object $owners = this.getOwners();
        result = result * PRIME + ($owners == null ? 43 : $owners.hashCode());
        final Object $timeOfRunBusinessInMonths = this.getTimeOfRunBusinessInMonths();
        result = result * PRIME + ($timeOfRunBusinessInMonths == null ? 43 : $timeOfRunBusinessInMonths.hashCode());
        final Object $lastSixMonthsRevenue = this.getLastSixMonthsRevenue();
        result = result * PRIME + ($lastSixMonthsRevenue == null ? 43 : $lastSixMonthsRevenue.hashCode());
        final Object $legalForm = this.getLegalForm();
        result = result * PRIME + ($legalForm == null ? 43 : $legalForm.hashCode());
        final Object $phoneNumber = this.getPhoneNumber();
        result = result * PRIME + ($phoneNumber == null ? 43 : $phoneNumber.hashCode());
        final Object $responsiblePublicAuthority = this.getResponsiblePublicAuthority();
        result = result * PRIME + ($responsiblePublicAuthority == null ? 43 : $responsiblePublicAuthority.hashCode());
        final Object $foundationDate = this.getFoundationDate();
        result = result * PRIME + ($foundationDate == null ? 43 : $foundationDate.hashCode());
        final Object $registrationNumber = this.getRegistrationNumber();
        result = result * PRIME + ($registrationNumber == null ? 43 : $registrationNumber.hashCode());
        final Object $register = this.getRegister();
        result = result * PRIME + ($register == null ? 43 : $register.hashCode());
        final Object $crefoId = this.getCrefoId();
        result = result * PRIME + ($crefoId == null ? 43 : $crefoId.hashCode());
        final Object $website = this.getWebsite();
        result = result * PRIME + ($website == null ? 43 : $website.hashCode());
        final Object $numberOfEmployees = this.getNumberOfEmployees();
        result = result * PRIME + ($numberOfEmployees == null ? 43 : $numberOfEmployees.hashCode());
        final Object $taxNumber = this.getTaxNumber();
        result = result * PRIME + ($taxNumber == null ? 43 : $taxNumber.hashCode());
        final Object $subjectToVat = this.getSubjectToVat();
        result = result * PRIME + ($subjectToVat == null ? 43 : $subjectToVat.hashCode());
        final Object $vatId = this.getVatId();
        result = result * PRIME + ($vatId == null ? 43 : $vatId.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantLinkData(merchantId=" + this.getMerchantId() + ", name=" + this.getName() + ", email=" + this.getEmail() + ", address=" + this.getAddress() + ", owners=" + this.getOwners() + ", timeOfRunBusinessInMonths=" + this.getTimeOfRunBusinessInMonths() + ", lastSixMonthsRevenue=" + this.getLastSixMonthsRevenue() + ", legalForm=" + this.getLegalForm() + ", phoneNumber=" + this.getPhoneNumber() + ", responsiblePublicAuthority=" + this.getResponsiblePublicAuthority() + ", foundationDate=" + this.getFoundationDate() + ", registrationNumber=" + this.getRegistrationNumber() + ", register=" + this.getRegister() + ", crefoId=" + this.getCrefoId() + ", website=" + this.getWebsite() + ", numberOfEmployees=" + this.getNumberOfEmployees() + ", taxNumber=" + this.getTaxNumber() + ", subjectToVat=" + this.getSubjectToVat() + ", vatId=" + this.getVatId() + ")";
    }

    public static class MerchantLinkDataBuilder {
        private String merchantId;
        private String name;
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

        public MerchantLinkData build() {
            return new MerchantLinkData(merchantId, name, email, address, owners, timeOfRunBusinessInMonths, lastSixMonthsRevenue, legalForm, phoneNumber, responsiblePublicAuthority, foundationDate, registrationNumber, register, crefoId, website, numberOfEmployees, taxNumber, subjectToVat, vatId);
        }

        public String toString() {
            return "MerchantLinkData.MerchantLinkDataBuilder(merchantId=" + this.merchantId + ", name=" + this.name + ", email=" + this.email + ", address=" + this.address + ", owners=" + this.owners + ", timeOfRunBusinessInMonths=" + this.timeOfRunBusinessInMonths + ", lastSixMonthsRevenue=" + this.lastSixMonthsRevenue + ", legalForm=" + this.legalForm + ", phoneNumber=" + this.phoneNumber + ", responsiblePublicAuthority=" + this.responsiblePublicAuthority + ", foundationDate=" + this.foundationDate + ", registrationNumber=" + this.registrationNumber + ", register=" + this.register + ", crefoId=" + this.crefoId + ", website=" + this.website + ", numberOfEmployees=" + this.numberOfEmployees + ", taxNumber=" + this.taxNumber + ", subjectToVat=" + this.subjectToVat + ", vatId=" + this.vatId + ")";
        }
    }
}
