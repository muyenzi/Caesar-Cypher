import java.io.BufferedReader;
import  java.io.IOException;
import  java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the message :");
        String Words = null;
        try {
            String words = bufferedReader.readLine();
            System.out.println("Enter the shift key value");
            int key = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Press 1.TO Encrypt or 2.TO Decrypt");
            int choice = Integer.parseInt(bufferedReader.readLine());
            if(choice==1) {
                System.out.println("Encrypted text is " + Encryption.runCaesar(words, key));
            }
            else {
                System.out.println("Decrypted text is " + Decryption.runCypher(words, key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
