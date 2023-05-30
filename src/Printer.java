public class Printer {
    private String message;

    private Printer(String message){
        this.message = message;
    }

    public String concatenateMessage(String newMsg){
        return this.message +" "+ newMsg;
    }

    public static Printer createInstance(String message){
        return new Printer(message);
    }
}
