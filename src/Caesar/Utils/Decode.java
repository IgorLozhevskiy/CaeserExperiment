package Caesar.Utils;

public class Decode {

    public String decode(String inputText, int key) {

        String decryptedText = "";
        for (int i = 0; i < inputText.length(); i++) {
            char currentChar = inputText.charAt(i);
            if (!Character.isAlphabetic(currentChar)) {
                decryptedText = decryptedText + currentChar;
                continue;
            }

            if (Character.isLowerCase(currentChar)) {
                int charIndex = Alphabet.ALPHABET_LOWER.indexOf(currentChar);
                int shiftIndex = (charIndex - key) % Alphabet.LATIN_SIZE;
                if (shiftIndex < 0) {
                    shiftIndex = Alphabet.LATIN_SIZE + shiftIndex;
                }
                char cipherChar = Alphabet.ALPHABET_LOWER.charAt(shiftIndex);
                decryptedText = decryptedText + cipherChar;
            } else {
                int charIndex = Alphabet.ALPHABET_UPPER.indexOf(currentChar);
                int shiftIndex = (charIndex - key) % Alphabet.LATIN_SIZE;
                if (shiftIndex < 0) {
                    shiftIndex = Alphabet.LATIN_SIZE + shiftIndex;
                }
                char cipherChar = Alphabet.ALPHABET_UPPER.charAt(shiftIndex);
                decryptedText = decryptedText + cipherChar;
            }
        }
        return decryptedText;
    }
}
