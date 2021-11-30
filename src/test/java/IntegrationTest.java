import com.nixxcode.jvmbrotli.common.BrotliLoader;
import lombok.SneakyThrows;
import model.Address;
import model.MerchantLinkData;
import model.Owner;
import model.Revenue;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.Test;

import java.net.URLEncoder;
import java.time.Instant;
import java.util.Collections;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegrationTest {

    public static final String DEV_URL = "https://panther-services-api-dev.pc-in.net/link-integration?merchant_info=";

    @Test
    @SneakyThrows
    void givenAnMerchantObjectItShouldEncodeAndSuccessfullySaveTheObjectUsingBanxwareService() {
        BrotliLoader.isBrotliAvailable();

        // Given
        String base64Encode = LinkIntegration.encode(merchantObject());
        String blob = URLEncoder.encode(base64Encode, "UTF-8");

        // When
        HttpClient client = HttpClients.custom().build();
        HttpUriRequest request = RequestBuilder
                .post()
                .setUri(DEV_URL + blob)
                .setHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                .setHeader("Tenant-Code", "TEST-TENANT")
                .build();

        HttpResponse response = client.execute(request);

        // Then
        assertEquals(response.getStatusLine().getStatusCode(), 200);
    }


    private static MerchantLinkData merchantObject() {
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
}