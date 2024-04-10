public class LambdasDemo {

    // Demo Anonymous class
    public static void show() {
        
        System.out.println("In Show Method");
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
                
            }
        });

    }

    public static void greet(Printer printer) {

        printer.print("LamdbasDemo->greet()->In Greet-Hello World!");

    }

    public static void main(String[] args) {
        System.out.println(":In LambdasDemo");
        show();
    }

}
