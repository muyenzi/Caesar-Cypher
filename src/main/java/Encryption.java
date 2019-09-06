public class Encryption {
    public String runCypher(String words, int key) {

        int length = words.length();
//        int choice = 0;
        char word;
        String crypted = "";
//        if(choice == 2) {
        for (int i = 0; i < length; i++) {
            word = words.charAt(i);
            if (word >= 'a' && word <= 'z') {
                word = (char) (word + key);
                if (word > 'z') {
                    word = (char) (word - 'z' + 'a' - 1);
                }
                crypted = crypted + word;
            }

            else if (word >='A' && word <='Z'){
                word = (char) (word + key );
                if (word > 'Z') {
                    word =(char) (word - 'Z' + 'A' - 1 );
                }
                crypted = crypted + word;
            }
        }
        return crypted;
    }
}





