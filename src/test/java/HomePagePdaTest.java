import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.junit.Test;

public class HomePagePdaTest {

    @Test
    public void getRequestCheckStatusCode() {
        RestAssured.given()
                .spec(Specifications.requestSpecification())//---> Указание RequestSpecification для формирования request
                .get("special/samsung")//---> Endpoint для выполнения запроса GET
                .then()
                .statusCode(HttpStatus.SC_OK);//---> Проверка статус код
    }
}
