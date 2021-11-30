package model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Owner {
    String title;
    String email;
    String firstName;
    String lastName;
    String dateOfBirth;
    String nationality;
    String taxNumber;
    Float sharesPercent; // TODO
    Boolean ultimateBeneficial;
    Boolean legalRepresentative;
    Address address;
}
