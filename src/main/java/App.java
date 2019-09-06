import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.Console;

public class App {

    public class App {
        public static void main(String[] args) {
            Console myConsole = System.console();
//           System.out.println("Encryption");
            System.out.println("Enter the message :");
            String Words = myConsole.readLine();
            System.out.println("enter the shift key");
            int key =Integer.parseInt (myConsole.readLine());



        }
    }
}