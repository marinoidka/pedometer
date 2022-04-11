package pro.learnup.javaqa.group2.chernykh3;

import java.util.*;
import java.util.function.Predicate;


public class StepsManager implements Comparable<StepsManager> {

    public Map<Integer, Integer> stPerDay = new HashMap<>();


    public int add(int day, int steps) {
        if (stPerDay.containsKey(day)) {
            stPerDay.put(day, steps + stPerDay.get(day));
        } else {
            stPerDay.put(day, steps);
        }
        int stepsToGoal;
        int maxDay = 0;
        int maxSteps = 0;
        for (int daySteps : stPerDay.keySet()) {
            int goalSteps = stPerDay.get(daySteps);
            if (goalSteps > maxSteps) {
                maxSteps = goalSteps;
                maxDay = daySteps;
            }
        }
        stepsToGoal = stPerDay.get(maxDay) - stPerDay.get(day) + 1;
        return stepsToGoal;
    }

    public int sumSteps() {
        int sum = 0;
        for (int daySteps : stPerDay.keySet()) {
            sum += stPerDay.get(daySteps);
        }
        return sum;
    }

    @Override
    public int compareTo(StepsManager sM) {
        return sumSteps() - sM.sumSteps();
    }

    public void printAllDaysByCriteria(Predicate<Integer> steps) {
        Map<Integer, Integer> toPrint = new HashMap<>();

        int i = 1;

        for (int daySteps : stPerDay.values()) {
            if (steps.test(daySteps)) {
                toPrint.put(i, daySteps);
                System.out.println("День " + i + " шагов " + toPrint.get(i) + " .");
            }
            i++;
        }
    }

}
