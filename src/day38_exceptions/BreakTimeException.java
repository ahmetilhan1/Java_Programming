package day38_exceptions;

public class BreakTimeException extends RuntimeException{
    public BreakTimeException() {
        super("It's Break Time");
    }
}
