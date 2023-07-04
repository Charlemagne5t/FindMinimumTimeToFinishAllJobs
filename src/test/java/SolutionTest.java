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
    /**/
    @Test
    public void minimumTimeRequiredTest3() {
        int[] jobs = {9899456,8291115,9477657,9288480,5146275,7697968,8573153,3582365,3758448,9881935,2420271,4542202};
        int k = 9;
        int expected = 9899456;
        int actual = new Solution().minimumTimeRequired(jobs, k);

        Assertions.assertEquals(expected, actual);
    }
}
