package JavaTDD1;

public class Computer {

    private Printer printer;
    private Keyboard keyboard;

    public Computer(Printer printer, Keyboard keyboard) {
        this.printer = printer;
        this.keyboard = keyboard;
    }

    public void ceateDocument(){
        String text = keyboard.read();
        Document document = new Document(text);
        printer.print(document);
    }
}
