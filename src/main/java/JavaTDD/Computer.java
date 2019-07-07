package JavaTDD;
public class Computer {

    private Printer printer;
    private Keyboard keyboard;

    public Computer(Printer printer, Keyboard keyboard) {
        this.printer = printer;
        this.keyboard = keyboard;
    }

    public void createDocument(){
        String text = keyboard.read();
        Document document = new Document(text);
        printer.print(document);
    }
}
