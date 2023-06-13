package runtimeexception;

public class AgeIllegalRunTimeException extends RuntimeException{
    public AgeIllegalRunTimeException() {
    }

    public AgeIllegalRunTimeException(String message) {
        super(message);
    }
}
