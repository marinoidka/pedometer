import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.learnup.javaqa.group2.chernykh3.IllegalDayException;
import pro.learnup.javaqa.group2.chernykh3.IllegalStepsException;
import pro.learnup.javaqa.group2.chernykh3.StepsManager;


public class PedometerTest {

    @Test
    public void shouldAdd() {
        StepsManager sm = new StepsManager();
        sm.add(1, 1);
        sm.add(1, 10000);


        int expected = 10001;
        int actual = sm.add(2, 1);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldAddBigNumbers() {
        StepsManager sm = new StepsManager();
        sm.add(1, 87654);
        sm.add(2, 1);


        int expected = 87652;
        int actual = sm.add(2, 2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCompareComparator() {
        StepsManager sM1 = new StepsManager();
        StepsManager sM2 = new StepsManager();

        sM1.add(1, 1000);
        sM1.add(2, 3000);
        sM1.add(3, 4000);
        sM2.add(1, 1);
        sM2.add(2, 2001);
        sM2.add(3, 1);

        PedometerDaysComparator comparator = new PedometerDaysComparator();

        int actual = comparator.compare(sM1, sM2);

        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCompareComparable() {
        StepsManager sM1 = new StepsManager();
        StepsManager sM2 = new StepsManager();

        sM1.add(1, 1000);
        sM1.add(2, 3000);
        sM1.add(3, 4000);
        sM2.add(1, 100);
        sM2.add(2, 2001);
        sM2.add(3, 100);


        int actual = sM2.compareTo(sM1);

        int expected = -5799;

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

    @Test
    public void ExceptionDayTest() {
        StepsManager sM = new StepsManager();

        Assertions.assertThrows(IllegalDayException.class, () -> {
            sM.add(0, 1000);
        });

    }

    @Test
    public void ExceptionDayTest2() {
        StepsManager sM = new StepsManager();

        Assertions.assertThrows(IllegalDayException.class, () -> {
            sM.add(366, 1000);
        });

    }

    @Test
    public void ExceptionStepsTest() {
        StepsManager sM = new StepsManager();

        Assertions.assertThrows(IllegalStepsException.class, () -> {
            sM.add(1, -1000);
        });
    }
}
