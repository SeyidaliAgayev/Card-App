package model.enums;

public enum Exceptions {
    USERNAME_NOT_FOUND("Username does not exist!"),
    LOW_BALANCE_EXCEPTION("Balance is not enough to transfer!"),
    INVALID_OPTION("Invalid Option!"),
    THE_SAME_CARD_NUMBER_EXCEPTION("You can not send money to yourself!"),
    EMPTY_CARD_NUMBER_EXCEPTION("Receiver card number can not be empty!");

    private final String message;

    Exceptions(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
