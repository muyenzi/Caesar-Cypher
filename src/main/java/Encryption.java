public class Encryption {
    public String runCypher(String words , int key){

        int length=words.length();
        int choice = 0;
        char word;
        if(choice == 1) {
            for (int i = 0; i <length; i++) {
                word=words.charAt(i);
                if(word >= 'a' && word <= 'z'){
                    word=(char)(word + key) ;
                    if(word)
                }
            }

            }
            }
        }
    }


//    String ciphertext = "";
//    char alphabet;
//        for(int i=0; i < plaintext.length();i++)
//        {
//        // Shift one character at a time
//        alphabet = plaintext.charAt(i);
//
//        // if alphabet lies between a and z
//        if(alphabet >= 'a' && alphabet <= 'z')
//        {
//        // shift alphabet
//        alphabet = (char) (alphabet + shift);
//        // if shift alphabet greater than 'z'
//        if(alphabet > 'z') {
//        // reshift to starting position
//        alphabet = (char) (alphabet+'a'-'z'-1);
//        }
//        ciphertext = ciphertext + alphabet;
//        }
//
//        // if alphabet lies between 'A'and 'Z'
//        else if(alphabet >= 'A' && alphabet <= 'Z') {
//        // shift alphabet
//        alphabet = (char) (alphabet + shift);
