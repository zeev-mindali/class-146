package lab_solution;

public class NoEmployeesException extends Exception{
    public NoEmployeesException() {
    }

    public NoEmployeesException(String message) {
        super(message);
    }
}
