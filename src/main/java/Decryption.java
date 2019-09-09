public class Decryption {
    public static  StringBuffer runCypher(String words, int key) {
        StringBuffer decrypted =new StringBuffer();
        int length = words.length();
        char word;
        for (int i = 0; i < length; i++) {
            word = words.charAt(i);
            if (word >= 'a' && word <= 'z') {
                word = (char) (word - key);
                if (word > 'z') {
                    word = (char) (word - 'z' + 'a' - 1);
                }
                decrypted.append(word);
            }
            else if (word >='A' && word <='Z'){
                word = (char) (word - key );
                if (word > 'Z') {
                    word =(char) (word - 'Z' + 'A' - 1 );
                }
                decrypted.append(word);
            }
        }
        return decrypted;
    }
}
