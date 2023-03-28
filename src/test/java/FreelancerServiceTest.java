import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.homework.services.FreelancerService;

public class FreelancerServiceTest {
    @Test
    void shouldCalculateAmount() {
        FreelancerService service = new FreelancerService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calculate(10000, 3000, 20000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAmount2() {
        FreelancerService service = new FreelancerService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = service.calculate(100000, 60000, 150000);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/free.csv")
    public void shouldCalculateAmount3(int income, int expenses, int threshold, int expected) {
        FreelancerService service = new FreelancerService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }


}
