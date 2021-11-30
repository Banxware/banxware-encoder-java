package model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Address {
    String addressLine1;
    String addressLine2;
    String streetNumber;
    String zipCode;
    String city;
    String state;
    String country;
}
