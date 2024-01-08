package enums;

public enum Status {

    PENDING("The message is pending.", 1),
    FAILED("The message has failed.", 2),
    SENT("The message was sent.", 3);

    private String message;

    private int code;

    //
    Status(String statusCode, int code) {
        this.message = statusCode;
        this.code = code;
        //
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
}
