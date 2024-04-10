/**
 * LambdasDemo
 */
public class LambdasDemo {

     // greet method with String message
   /*  public static void show() {

        greet((String message) -> {

            System.out.println(message);
        });

    }
    */
    // greet method with message (removed variable type as string)
    /* public static void show() {

        greet(( message) -> {

            System.out.println(message);
        });

    } */
    
   // removing class body, vairable type, and parenthesis 
    public static void show() {
        System.out.println("LambdasDemo->In show()");
        greet(message -> System.out.println(message)); 
    } 

    public static void greet(Printer printer) {

        System.out.println("LambdasDemo->greet()");
        printer.print("HelloWorld");

    }

    public static void main(String[] args) {
        System.out.println("LambdasDemo->In main()");
        show();
    }


}
