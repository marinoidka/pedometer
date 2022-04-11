import pro.learnup.javaqa.group2.chernykh3.StepsManager;

public class Main {
    public static void main(String[] args) {
        StepsManager sM1 = new StepsManager();

        StepsManager sM2 = new StepsManager();

        sM1.add(0, 1000);
        sM1.add(1, 2500);
        sM1.add(1, 2500);
        sM1.add(1, 2500);
        sM1.add(2, 1500);
        sM1.add(2, 1000);
        sM1.add(2, 3500);
        sM1.add(3, 500);
        sM1.add(3, 1000);
        sM1.add(3, 4000);
        sM1.add(4, 100);
        sM1.add(4, 200);
        System.out.println("Чтобы превысить текущий максимум шагов сделай еще: " + sM1.add(4, 700) + " шагов.");

        sM2.add(0, 3000);
        sM2.add(1, 500);
        sM2.add(1, 500);
        sM2.add(1, 500);
        sM2.add(2, 100);
        sM2.add(2, 100);
        sM2.add(2, 350);
        sM2.add(3, 5000);
        sM2.add(3, 100);
        sM2.add(3, 400);
        sM2.add(4, 100);
        sM2.add(4, 200);
        System.out.println("Чтобы превысить текущий максимум шагов сделай еще: " + sM2.add(4, 700) + " шагов.");


        System.out.println("Первый шагомер по сумме шагов прошел с разницей в " + sM1.compareTo(sM2) + " шагов.");

        PedometerDaysComparator comparator = new PedometerDaysComparator();
        System.out.println("Разница в днях у шагомеров составляет " + comparator.compare(sM1, sM2) + " дней.");

        StepsManager sM3 = new StepsManager();

        sM3.add(1, 10);
        sM3.add(2, 15);
        sM3.add(3, 20);
        sM3.add(4, 10);
        sM3.add(5, 20);
        sM3.add(6, 15);
        sM3.add(7, 0);

        sM3.printAllDaysByCriteria(steps -> steps == 15 || steps == 20);

        StepsManager sM = new StepsManager();

        sM.add(1, 1000);
        sM.add(2, 15000);
        sM.add(3, 2000);
        sM.add(4, 1000);
        sM.add(5, 2000);
        sM.add(6, 1500);
        sM.add(7, 1000);

        sM.printAllDaysByCriteria(steps -> steps > 10000);








    }
}
