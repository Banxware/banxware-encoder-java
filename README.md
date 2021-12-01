# Banxware Merchant Info Encoder

Firstly you have to authenticate to our github package:

```xml
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                      http://maven.apache.org/xsd/settings-1.0.0.xsd">

  <activeProfiles>
    <activeProfile>github</activeProfile>
  </activeProfiles>

  <profiles>
    <profile>
      <id>github</id>
      <repositories>
        <repository>
          <id>central</id>
          <url>https://repo1.maven.org/maven2</url>
        </repository>
        <repository>
          <id>github</id>
          <url>https://maven.pkg.github.com/banxware/banxware-encoder</url>
          <snapshots>
            <enabled>true</enabled>
          </snapshots>
        </repository>
      </repositories>
    </profile>
  </profiles>
    
  <servers>
    <server>
      <id>github</id>
      <username>USERNAME</username>
      <password>TOKEN</password>
    </server>
  </servers>
</settings>
```

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
// create a merchant object 
MerchantLinkData merchantLinkData = merchantObject();

// import your private key
String privateKey = getPrivateKey();

// call the link integration function passing the parameters above
String blob = LinkIntegration.encode(merchantLinkData, privateKey);
```

For a more detailed, check the IntegrationTest.

