

import pro.learnup.javaqa.group2.chernykh3.StepsManager;

import java.util.Comparator;

public class PedometerDaysComparator implements Comparator<StepsManager> {

    public int minimumSteps;

    public PedometerDaysComparator() {
        this.minimumSteps = 2000;
    }


    @Override
    public int compare(StepsManager sM1, StepsManager sM2) {
        return normalDay(sM1, minimumSteps) - normalDay(sM2, minimumSteps);
    }

    public int normalDay(StepsManager sM, int minimumSteps) {
        int norm = 0;
        for (int daySteps : sM.stPerDay.values()) {
            if (daySteps > minimumSteps) {
                norm++;
            }
        }
        return norm;
    }






}
