public class LambdasDemo {

    public static void show() {
        greet(new ConsolePrinter());

    }

    public static void greet(Printer printer) {

        printer.print("Hello World!");

    }

    public static void main(String[] args) {
        System.out.println(":In LambdasDemo");
        show();
    }

}
