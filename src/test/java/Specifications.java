import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class Specifications {

    public static RequestSpecification requestSpecification() {
        return new RequestSpecBuilder()
               .setBaseUri("https://4pda.to")//---> Cтартовая URL
               .build();
    }
}
