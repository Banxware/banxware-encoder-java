package model;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class MerchantLinkData {
    String merchantId;
    String name;
    String email;
    Address address;
    List<Owner> owners;
    Integer timeOfRunBusinessInMonths;
    List<Revenue> lastSixMonthsRevenue;
    String legalForm;
    String phoneNumber;
    String responsiblePublicAuthority;
    String foundationDate;
    String registrationNumber;
    String register;
    String crefoId;
    String website;
    Integer numberOfEmployees;
    String taxNumber;
    Boolean subjectToVat;
    String vatId;
}
