package com.banxware.model;

public final class Address {
    private final String addressLine1;
    private final String addressLine2;
    private final String streetNumber;
    private final String zipCode;
    private final String city;
    private final String state;
    private final String country;

    Address(String addressLine1, String addressLine2, String streetNumber, String zipCode, String city, String state, String country) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public static AddressBuilder builder() {
        return new AddressBuilder();
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public String getAddressLine2() {
        return this.addressLine2;
    }

    public String getStreetNumber() {
        return this.streetNumber;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getCountry() {
        return this.country;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Address)) return false;
        final Address other = (Address) o;
        final Object this$addressLine1 = this.getAddressLine1();
        final Object other$addressLine1 = other.getAddressLine1();
        if (this$addressLine1 == null ? other$addressLine1 != null : !this$addressLine1.equals(other$addressLine1))
            return false;
        final Object this$addressLine2 = this.getAddressLine2();
        final Object other$addressLine2 = other.getAddressLine2();
        if (this$addressLine2 == null ? other$addressLine2 != null : !this$addressLine2.equals(other$addressLine2))
            return false;
        final Object this$streetNumber = this.getStreetNumber();
        final Object other$streetNumber = other.getStreetNumber();
        if (this$streetNumber == null ? other$streetNumber != null : !this$streetNumber.equals(other$streetNumber))
            return false;
        final Object this$zipCode = this.getZipCode();
        final Object other$zipCode = other.getZipCode();
        if (this$zipCode == null ? other$zipCode != null : !this$zipCode.equals(other$zipCode)) return false;
        final Object this$city = this.getCity();
        final Object other$city = other.getCity();
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) return false;
        final Object this$state = this.getState();
        final Object other$state = other.getState();
        if (this$state == null ? other$state != null : !this$state.equals(other$state)) return false;
        final Object this$country = this.getCountry();
        final Object other$country = other.getCountry();
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $addressLine1 = this.getAddressLine1();
        result = result * PRIME + ($addressLine1 == null ? 43 : $addressLine1.hashCode());
        final Object $addressLine2 = this.getAddressLine2();
        result = result * PRIME + ($addressLine2 == null ? 43 : $addressLine2.hashCode());
        final Object $streetNumber = this.getStreetNumber();
        result = result * PRIME + ($streetNumber == null ? 43 : $streetNumber.hashCode());
        final Object $zipCode = this.getZipCode();
        result = result * PRIME + ($zipCode == null ? 43 : $zipCode.hashCode());
        final Object $city = this.getCity();
        result = result * PRIME + ($city == null ? 43 : $city.hashCode());
        final Object $state = this.getState();
        result = result * PRIME + ($state == null ? 43 : $state.hashCode());
        final Object $country = this.getCountry();
        result = result * PRIME + ($country == null ? 43 : $country.hashCode());
        return result;
    }

    public String toString() {
        return "Address(addressLine1=" + this.getAddressLine1() + ", addressLine2=" + this.getAddressLine2() + ", streetNumber=" + this.getStreetNumber() + ", zipCode=" + this.getZipCode() + ", city=" + this.getCity() + ", state=" + this.getState() + ", country=" + this.getCountry() + ")";
    }

    public static class AddressBuilder {
        private String addressLine1;
        private String addressLine2;
        private String streetNumber;
        private String zipCode;
        private String city;
        private String state;
        private String country;

        AddressBuilder() {
        }

        public AddressBuilder addressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }

        public AddressBuilder addressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
            return this;
        }

        public AddressBuilder streetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public AddressBuilder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public AddressBuilder city(String city) {
            this.city = city;
            return this;
        }

        public AddressBuilder state(String state) {
            this.state = state;
            return this;
        }

        public AddressBuilder country(String country) {
            this.country = country;
            return this;
        }

        public Address build() {
            return new Address(addressLine1, addressLine2, streetNumber, zipCode, city, state, country);
        }

        public String toString() {
            return "Address.AddressBuilder(addressLine1=" + this.addressLine1 + ", addressLine2=" + this.addressLine2 + ", streetNumber=" + this.streetNumber + ", zipCode=" + this.zipCode + ", city=" + this.city + ", state=" + this.state + ", country=" + this.country + ")";
        }
    }
}
