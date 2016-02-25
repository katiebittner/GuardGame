import org.junit.Test;

import static org.junit.Assert.*;

public class MathinatorSpec {
    //Inputs: (long) x = 13 Output: (int) 4

    //Inputs: (long) x = 1235 Output: (int) 2
    @Test
    public void answerTest() {
        Mathinator mathinator = new Mathinator();
        int expected = 4;
        long sample = 13;
        int actual = mathinator.answer(sample);
        assertEquals("asserting that the answer is correct", expected, actual);

        int expected2 = 2;
        long sample2 = 1235;
        int actual2 = mathinator.answer(sample2);
        assertEquals("asserting that the answer is correct", expected2, actual2);

        int expected3 = 1;
        long sample3 = 2147483647;
        int actual3 = mathinator.answer(sample3);
        assertEquals("asserting that the answer is correct", expected3, actual3);

        int expected4 = 0;
        long sample4 = 0;
        int actual4 = mathinator.answer(sample4);
        assertEquals("asserting that the answer is correct", expected4, actual4);

    }
}
