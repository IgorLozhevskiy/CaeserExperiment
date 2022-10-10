package Caesar;

public class Encode {

    public static final String ALPHABET_LOWER = "abcdefghijklmnopqrstuvwxyz";
    public static final String ALPHABET_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final int LATIN_SIZE = 26;

    public static String encode(String inputText, int key)  {
        String encryptedText = "";
        for (int i = 0; i < inputText.length(); i++) {
            char currentChar = inputText.charAt(i);
            if (!Character.isAlphabetic(currentChar)) {
                encryptedText = encryptedText + currentChar;
                continue;
            }
            if (Character.isLowerCase(currentChar)){
                int charIndex = ALPHABET_LOWER.indexOf(currentChar);
                int shiftIndex = (charIndex + key) % LATIN_SIZE;
                if (shiftIndex < 0) {
                    shiftIndex = LATIN_SIZE + shiftIndex;
                }
                char cipherChar = ALPHABET_LOWER.charAt(shiftIndex);
                encryptedText = encryptedText + cipherChar;
            } else {
                int charIndex = ALPHABET_UPPER.indexOf(currentChar);
                int shiftIndex = (charIndex + key) % LATIN_SIZE;
                if (shiftIndex < 0) {
                    shiftIndex = LATIN_SIZE + shiftIndex;
                }
                char cipherChar = ALPHABET_UPPER.charAt(shiftIndex);
                encryptedText = encryptedText + cipherChar;
            }
        }
        return encryptedText;
    }
}




