/**
 * ConsolePrinter
 */
public class ConsolePrinter implements Printer {

    public static void main(String[] args) {
        
        System.out.println("Hello World!");
    }

    @Override
    public void print(String message) {
        
       System.out.println("Welcome to print message:"+ message);
    }

    
}