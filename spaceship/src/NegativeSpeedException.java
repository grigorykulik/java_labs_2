public class NegativeSpeedException extends Exception {
    private String message="The speed cannot be negative";

    public String getMessage() {
        return this.message;
    }
}
