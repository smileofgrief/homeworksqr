import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;


public class SQRServiceTest {
    @Test
    public void calcTestFewValueFinded() {
        SQRService service = new SQRService();
        int actual = service.calc(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcTestOneValueFinded() {
        SQRService service = new SQRService();
        int actual = service.calc(80, 110);
        int expected = 1;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcTestManyValueFinded() {
        SQRService service = new SQRService();
        int actual = service.calc(80, 100_000);
        int expected = 90;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcTestZeroValueFinded() {
        SQRService service = new SQRService();
        int actual = service.calc(80, 90);
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }
}