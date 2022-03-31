import java.util.*;

public class StepsManager {

    private Map<Integer, Integer> stepsPerDay = new HashMap<>();


    public int add(int day, int steps) {
        if (stepsPerDay.containsKey(day)) {
            stepsPerDay.put(day, steps + stepsPerDay.get(day));
        } else {
            stepsPerDay.put(day, steps);
        }
        int stepsToGoal;
        int maxDay = 0;
        int maxSteps = 0;
        for (int daySteps : stepsPerDay.keySet()) {
            int goalSteps = stepsPerDay.get(daySteps);
            if (goalSteps > maxSteps) {
                maxSteps = goalSteps;
                maxDay = daySteps;
            }
        }
        stepsToGoal = stepsPerDay.get(maxDay) - stepsPerDay.get(day);
        return stepsToGoal;
    }

}
