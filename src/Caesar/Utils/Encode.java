package Caesar.Utils;

public class Encode {

    public String encode(String inputText, int key)  {
        String encryptedText = "";
        for (int i = 0; i < inputText.length(); i++) {
            char currentChar = inputText.charAt(i);
            if (!Character.isAlphabetic(currentChar)) {
                encryptedText = encryptedText + currentChar;
                continue;
            }
            if (Character.isLowerCase(currentChar)){
                int charIndex = Alphabet.ALPHABET_LOWER.indexOf(currentChar);
                int shiftIndex = (charIndex + key) % Alphabet.LATIN_SIZE;
                if (shiftIndex < 0) {
                    shiftIndex = Alphabet.LATIN_SIZE + shiftIndex;
                }
                char cipherChar = Alphabet.ALPHABET_LOWER.charAt(shiftIndex);
                encryptedText = encryptedText + cipherChar;
            } else {
                int charIndex = Alphabet.ALPHABET_UPPER.indexOf(currentChar);
                int shiftIndex = (charIndex + key) % Alphabet.LATIN_SIZE;
                if (shiftIndex < 0) {
                    shiftIndex = Alphabet.LATIN_SIZE + shiftIndex;
                }
                char cipherChar = Alphabet.ALPHABET_UPPER.charAt(shiftIndex);
                encryptedText = encryptedText + cipherChar;
            }
        }
        return encryptedText;
    }
}




