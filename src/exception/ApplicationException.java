package exception;

import model.enums.Exceptions;

public class ApplicationException extends RuntimeException{
    public ApplicationException(Exceptions exceptions) {
        super(exceptions.getMessage());
    }
}
