package enums;

public class Email {

    private String to;
    private String message;
    private Status status;

    public String getTo() {
        return to;
    }

    public Email setTo(String to) {
        this.to = to;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Email setMessage(String message) {
        this.message = message;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public Email setStatus(Status status) {
        this.status = status;
        return this;
    }
}
