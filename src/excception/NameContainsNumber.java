package excception;

public class NameContainsNumber extends Throwable {
    private final String message;

    public NameContainsNumber(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
