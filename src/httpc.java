import java.io.*;
import java.util.*;

public class httpc {

    public static void main(String[] args) throws IOException{

        HTTPLibrary httpLibrary = new HTTPLibrary();

        System.out.println("-------------------cURL started ------------------------------");

        String input;
        do {
            System.out.println("Enter Command or Enter q to exit from the system");
            Scanner scan = new Scanner(System.in);
            input = scan.nextLine();
            if (input.equals("q")) {
                return;
            } else {
                httpLibrary.runCommand(input);
            }
            System.out.println("------------------------------------------------------------------------");
        } while (!input.equals("q"));
    }

}
