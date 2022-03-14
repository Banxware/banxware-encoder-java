# Banxware Merchant Info Encoder

## Installing

Add the following dependencies:

Maven: 
```xml
<dependency>
    <groupId>com.banxware</groupId>
    <artifactId>banxware-encoder</artifactId>
    <version>1.0.1</version>
</dependency>

<dependency>
    <groupId>com.nixxcode.jvmbrotli</groupId>
    <artifactId>jvmbrotli</artifactId>
    <version>0.2.0</version>
</dependency>

<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.9</version>
</dependency>
```

Gradle:
```groovy
implementation "com.banxware:banxware-encoder:1.0.1"
implementation 'com.google.code.gson:gson:2.8.9'

implementation group: 'com.nixxcode.jvmbrotli', name: 'jvmbrotli', version: '0.2.0'
implementation group: 'com.nixxcode.jvmbrotli', name: 'DESIRED_ARCHITECTURE', version: '0.2.0'
```

Replace the DESIRED_ARCHITECTURE name with one of the options below:

* jvmbrotli-darwin-x86-amd64
* jvmbrotli-win32-x86-amd64 
* jvmbrotli-linux-x86-amd64 

## Usage

Call the function in your java class:

```java
MerchantLinkData merchantLinkData = Fixtures.merchantObject();
String yourPrivateKey = Fixtures.privateKey();
String banxwarePublicKey = Fixtures.publicKey();

// When
String blob = LinkIntegration.encode(merchantLinkData, banxwarePublicKey, yourPrivateKey);
```

For a more detailed, check the IntegrationTest.

