import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void minimumTimeRequiredTest1() {
        int[] jobs = {3, 2, 3};
        int k = 3;
        int expected = 3;
        int actual = new Solution().minimumTimeRequired(jobs, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minimumTimeRequiredTest2() {
        int[] jobs = {3, 2, 3};
        int k = 3;
        int expected = 3;
        int actual = new Solution().minimumTimeRequired(jobs, k);

        Assertions.assertEquals(expected, actual);
    }
}
