package pro.learnup.javaqa.group2.chernykh3;

public class IllegalStepsException extends RuntimeException{
    public IllegalStepsException() {
        super("Шагов не может быть меньше нуля.");
    }
}
