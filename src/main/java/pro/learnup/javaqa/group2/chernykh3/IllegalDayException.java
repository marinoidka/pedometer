package pro.learnup.javaqa.group2.chernykh3;

public class IllegalDayException extends RuntimeException {
    public IllegalDayException() {
        super("Дни могут быть только от 1 до 365.");
    }
}
