package my_exception;

public class TalException extends Exception{
    public TalException() {
        super("General Exception");
    }

    public TalException(String message) {
        super(message);
    }
}
