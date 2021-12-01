import com.banxware.LinkIntegration;
import com.banxware.model.MerchantLinkData;
import com.nixxcode.jvmbrotli.common.BrotliLoader;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegrationTest {

    public static final String DEV_URL = "https://panther-services-api-dev.pc-in.net/merchant-integration";

    @Test
    void givenAnMerchantObjectItShouldEncodeAndSuccessfullySaveTheObjectUsingBanxwareService() throws IOException {
        BrotliLoader.isBrotliAvailable();

        // Given
        MerchantLinkData merchantLinkData = Fixtures.merchantObject();
        String yourPrivateKey = Fixtures.privateKey();
        String banxwarePublicKey = Fixtures.publicKey();

        // When
        String blob = LinkIntegration.encode(merchantLinkData, banxwarePublicKey, yourPrivateKey);

        HttpClient client = HttpClients.custom().build();
        HttpUriRequest request = RequestBuilder
                .put()
                .setUri(DEV_URL)
                .setEntity(new StringEntity("{\"merchantInfo\":\"" + blob + "\"}", ContentType.APPLICATION_JSON))
                .setHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                .setHeader("Tenant-Code", "TEST-TENANT")
                .build();

        HttpResponse response = client.execute(request);

        // Then
        assertEquals(200, response.getStatusLine().getStatusCode());
    }
}