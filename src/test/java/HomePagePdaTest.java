import models.HomePagePda;
import models.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomePagePdaTest {

    HomePagePda homePagePda = new HomePagePda();

    @Test
    //проверка, что код ответа 200
    public void isResponseOK() {
        Assertions.assertEquals(Utils.codeOK, homePagePda.getResponseCode(Utils.BASE_URL));
    }

    @Test
    public void getHeadersInfo() {
        //получение headers
        String s = homePagePda.getHeaders(Utils.BASE_URL);
        System.out.println(s);
    }

    @Test
    public void getStatusLine() {
        //получение statusLine: протокол, код ответа, фраза ответа
        String s = homePagePda.getStatusLine(Utils.BASE_URL);
        System.out.println(s);
    }

    @Test
    public void getContentType() {
        //получение ContentType
        String s = homePagePda.getContentType(Utils.BASE_URL);
        System.out.println(s);
    }
}
