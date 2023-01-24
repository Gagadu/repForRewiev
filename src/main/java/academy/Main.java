package academy;

public class Main {
    public static void main(String[] args) {
        byte[] a = {112, 100, 33};
        WorkWithBytes workWithBytes = new WorkWithBytes();
        workWithBytes.writeBytesToFile("text.txt", a);
    }
}
