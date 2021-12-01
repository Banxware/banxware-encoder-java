# Banxware Merchant Info Encoder

Add as a dependency:

```xml
<dependency>
    <groupId>com.banxware</groupId>
    <artifactId>banxware-encoder</artifactId>
    <version>1.0-alpha-1</version>
</dependency>
```

Install the dependency:

```shell
mvn install
```

Call the function in your java class:

```java
MerchantLinkData merchantLinkData = Fixtures.merchantObject();
String yourPrivateKey = Fixtures.privateKey();
String banxwarePublicKey = Fixtures.publicKey();

// When
String blob = LinkIntegration.encode(merchantLinkData, banxwarePublicKey, yourPrivateKey);
```

For a more detailed, check the IntegrationTest.

