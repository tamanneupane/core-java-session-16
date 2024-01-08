package excception;

public class NameFormatException extends Throwable {
    private final String message;

    public NameFormatException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
