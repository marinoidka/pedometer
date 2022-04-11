import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.learnup.javaqa.group2.chernykh3.StepsManager;


public class PedometerTest {

    @Test
    public void shouldAdd() {
        StepsManager sm = new StepsManager();
        sm.add(0, 0);
        sm.add(1, 10000);


        int expected = 10000;
        int actual = sm.add(2, 1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddZeroSteps() {
        StepsManager sm = new StepsManager();
        sm.add(0, 0);
        sm.add(1, 0);


        int expected = 1;
        int actual = sm.add(2, 0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddBigNumbers() {
        StepsManager sm = new StepsManager();
        sm.add(0, 987654);
        sm.add(1, 1);


        int expected = 987653;
        int actual = sm.add(2, 2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCompareComparator() {
        StepsManager sM1 = new StepsManager();
        StepsManager sM2 = new StepsManager();

        sM1.add(0, 1000);
        sM1.add(1, 3000);
        sM1.add(2, 4000);
        sM2.add(0, 0);
        sM2.add(1, 2001);
        sM2.add(2, 0);

        PedometerDaysComparator comparator = new PedometerDaysComparator();

        int actual = comparator.compare(sM1, sM2);

        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCompareComparable() {
        StepsManager sM1 = new StepsManager();
        StepsManager sM2 = new StepsManager();

        sM1.add(0, 1000);
        sM1.add(1, 3000);
        sM1.add(2, 4000);
        sM2.add(0, 0);
        sM2.add(1, 2001);
        sM2.add(2, 0);


        int actual = sM2.compareTo(sM1);

        int expected = -5999;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTest10000Steps() {
        StepsManager sM = new StepsManager();

        sM.add(1, 1001);
        sM.add(2, 1500);
        sM.add(3, 2000);
        sM.add(4, 1000);
        sM.add(5, 2000);
        sM.add(6, 1500);
        sM.add(7, 1000);

        boolean actual = sM.sumSteps() > 10000;

        sM.printAllDaysByCriteria(steps -> actual);

        Assertions.assertTrue(actual);

    }
}
