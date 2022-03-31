public class Main {
    public static void main(String[] args) {
        StepsManager stepsManager = new StepsManager();

        System.out.println("Количесвто шагов до цели: " + stepsManager.add(0, 1000));
        System.out.println("Количесвто шагов до цели: " + stepsManager.add(0, 3000));
        System.out.println("Количесвто шагов до цели: " + stepsManager.add(1, 2000));
        System.out.println("Количесвто шагов до цели: " + stepsManager.add(2, 3000));
        System.out.println("Количесвто шагов до цели: " + stepsManager.add(3, 1000));
        System.out.println("Количесвто шагов до цели: " + stepsManager.add(4, 1000));
        System.out.println("Количесвто шагов до цели: " + stepsManager.add(4, 1000));
        System.out.println("Количесвто шагов до цели: " + stepsManager.add(4, 3000));
        System.out.println("Количесвто шагов до цели: " + stepsManager.add(5, 1000));

    }
}
