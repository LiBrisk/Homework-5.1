import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.homework.services.FreelancerService;

public class FreelancerServiceTest {
@Test
void shouldCalculateAmount (){
    FreelancerService service = new FreelancerService();
    int income = 10_000;
    int expenses = 3_000;
    int threshold = 20_000;
    int expected = 3;

    int actual = service.calculate(10000, 3000, 20000);
    Assertions.assertEquals(expected, actual);
    }
}
