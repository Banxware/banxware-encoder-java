import model.Address;
import model.MerchantLinkData;
import model.Owner;
import model.Revenue;

import java.time.Instant;
import java.util.Collections;
import java.util.Date;

class Fixtures {

    static MerchantLinkData merchantObject() {
        Address address = Address.builder()
                .addressLine1("FOO")
                .addressLine2("FOO")
                .streetNumber("FOO")
                .zipCode("FOO")
                .city("FOO")
                .state("FOO")
                .country("FOO")
                .build();

        String date = Date.from(Instant.now()).toString();
        Owner owner = Owner.builder()
                .title("FOO")
                .email("FOO")
                .firstName("FOO")
                .lastName("FOO")
                .dateOfBirth(date)
                .nationality("FOO")
                .taxNumber("FOO")
                .sharesPercent(50.5F)
                .ultimateBeneficial(true)
                .legalRepresentative(true)
                .address(address)
                .build();

        Revenue revenue = Revenue.builder()
                .month(12)
                .revenueInCents(5000000)
                .currency("123")
                .build();


        return MerchantLinkData.builder()
                .merchantId("FOOOO")
                .name("FOOOO")
                .email("FOOOO")
                .address(address)
                .owners(Collections.singletonList(owner))
                .timeOfRunBusinessInMonths(24)
                .lastSixMonthsRevenue(Collections.singletonList(revenue))
                .legalForm("FOOOO")
                .phoneNumber("FOOOO")
                .responsiblePublicAuthority("FOOOO")
                .foundationDate(date)
                .registrationNumber("FOOOO")
                .register("FOOOO")
                .crefoId("FOOOO")
                .website("FOOOO")
                .numberOfEmployees(240)
                .taxNumber("FOOOO")
                .subjectToVat(false)
                .vatId("FOOOO")
                .build();
    }


    static String privateKey() {
        return "-----BEGIN PRIVATE KEY-----\n" +
                "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDN+P8IEeZq/CHE\n" +
                "K4pKHXzp5Qf2UZcXpSvmIZpia5TCyk3AxeHQ2GgFaxvVd7BJYt1tURR8Bq6d7CXi\n" +
                "YAwzQS4JLDDLhBPm4VpBdcceohdi9/19QfDIN12pNoRZIGYv+rhxYEw3x8hjzaTa\n" +
                "oYjhL7AI5OVLz+F7fsqy367nJzUVJtT4iFF7gdDt9dh9Dzau7rhpN1L8whRhvhb3\n" +
                "jELhRadOj9g03ypf2tiKc0Vo88gaP1KeXl2ibXKpssTm29DFbZPJPg8lqLARL1RE\n" +
                "an0uhP+Vp6gwUholQScm/48IOn+Uz8fJB95XFZYeP50Do+Gx8JslPlhOPq8d+Puk\n" +
                "XpDDWSB1AgMBAAECggEAe713GZYHY4aNkpjFv7jvbmTV37ksmFv2f474fOA8wrle\n" +
                "9Mzs2NbpxzeNxTTeh3gJpr7rG4e4J8/TAqjJK5Gg4onV1q5GdpIz8tebBGBExIRP\n" +
                "mYyf5ui8MAg8gn7gZTquzA4aO/id/rdwrpgU75QCoZVB28XLpLGLfOK85Mm9LjLM\n" +
                "jthsUtA8qmMVvaWeyHOgLcUSKCWxYanVLJTDxAqXx2vGC4S7vRov+IPcKCJAuRl9\n" +
                "0WbkFWWYIaSW6SfZUAmpnsb/Crfpf05iiC7uaRnrxqWS0f+jlkUeObaw3OnCmI3X\n" +
                "LY2UdNke90j/Zj/e3Qysh9Tsb/WqGTQiCsn9PterEQKBgQD/atwXnKDsDZ+BHOqz\n" +
                "utGq1hmh2Qz5TNqZc7XlQLZgI8cygOa58A85OShI1UYgfq2GKob7UgBu7kv+ok0w\n" +
                "TzXnf9u5m+oGFFr1gDFKhnKwY5PxoESvNiQkjqahwoSps8K/Szh3REC/hA1AEgWV\n" +
                "6w4f0VO4rSyOG9CngWBdn+xZOwKBgQDOcUPpe9xzM+3+vAIZh0DCJDVVgRQNYR/J\n" +
                "AGDvlKiV1EhxU6toSL6PJhgcJqlo5+O7X0pHeMD8THH7AFhozgCTmhV+YtEuOBPK\n" +
                "5HbYxYLDgE0hRxVDDQSwape/CDWkwqTzFy0mTAoaxHyMILljstXU2F4Sod0IVXlF\n" +
                "gEI2GRFSDwKBgFSqO2KoTL9ylJjb2QDSwIV8iuqXZDGPRDbxoC3qEYo00ebvy4t/\n" +
                "A8zYIX5jE+fZlfOPTUcpm3MqEo7JhgSpfRjLzS3tfNmfDberUqt9fa7ykyvZEGtz\n" +
                "6u8jSiD8tbT7HWcDrCf8u+nAABRo5OkZDYmGfdYNsWM53SRpQmRGirXZAoGBAIQ8\n" +
                "0X+yM5gn33+Y9s9bcAPsJa3LrQiU+kNK1s0gsIypGm5dZiK61jXj9PWzXjkwsRPJ\n" +
                "Ck+V7iiu3yQlKHyZ2Iyz2qjGq6+rhCInDmn0urp4aO+0FM6KfEJ1RRa9L3+GnxqH\n" +
                "8gfiFWboDc/E9nwChi59GmVdAbTg63m1mrQEgq/JAoGAeDfDMkb4Xnwfae6zMb+X\n" +
                "/vKJtiKb7NElBLlYfXLHKU0tyU5WVcawta17AE8YW3s/fjPRE4yAP3eyyVGzemRt\n" +
                "zBDvI6dhfjXMuLz2FkPmnKMLcHA/Wn9J+4GE8tZfGKCRZMgC22ieV9S3fO0JBj1Z\n" +
                "JfCVzWQjbFvx2y4Vkob6XLQ=\n" +
                "-----END PRIVATE KEY-----";
    }


    static String publicKey() {
        return "-----BEGIN PUBLIC KEY-----\n" +
                "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqvgNuKWVctbL4ieNFIvU\n" +
                "nvp5D5VDRMavotIRNG49SNtnndoYEneIk5NXGhiwyOkms5eXGvduLgQdIFFMELsM\n" +
                "sbHp1KEfhwyNXAcN37A94cTDnze4dzI0v6jOAndYtcFNJumDp5bDiTN2bbVWhUeh\n" +
                "miFCf8UrkmULwEwfgLoNG+grsr5nMlByi0wOVUabK5asMwIzwUTGBdISWWyv7YMF\n" +
                "v0Wmx42EUHH6pzSzrciQ1sJTEVqA7STxJkM2Wc1CKl36qT5O3+b41lAgOT5wj8bm\n" +
                "ibv61DNuMAcVyVkMRKT4vd03OL8Ahaz9TW7gco7jLQGurjG6l0S6dn3kPy4Hmngf\n" +
                "swIDAQAB\n" +
                "-----END PUBLIC KEY-----";
    }
}
