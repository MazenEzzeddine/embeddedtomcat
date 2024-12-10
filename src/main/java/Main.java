public class Main {
    public static void main(String[] args) {
        Server app = new TomcatServer();
        app.run(args);
    }
}