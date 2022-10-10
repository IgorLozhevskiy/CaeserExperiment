package Caesar;

public class Decode {
    public static final String ALPHABET_LOWER = "abcdefghijklmnopqrstuvwxyz";
    public static final String ALPHABET_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final int LATIN_SIZE = 26;


    public static String decode(String inputText, int key) { // переименовала по совету Кости (зашифровать)

        String decryptedText = "";
        for (int i = 0; i < inputText.length(); i++) {
            char currentChar = inputText.charAt(i); // переменная текущий символ
            if (!Character.isAlphabetic(currentChar)) { // если символ не из нашего алфавита, то к decryptedText прибавляем наш
                // inputText под индексом i, а затем прерываем цикл
                decryptedText = decryptedText + currentChar;
                continue;
            }

            if (Character.isLowerCase(currentChar)) {
                int charIndex = ALPHABET_LOWER.indexOf(currentChar);
                int shiftIndex = (charIndex - key) % LATIN_SIZE;
                if (shiftIndex < 0) {
                    shiftIndex = LATIN_SIZE + shiftIndex;
                }
                char cipherChar = ALPHABET_LOWER.charAt(shiftIndex);
                decryptedText = decryptedText + cipherChar;
            } else {
                int charIndex = ALPHABET_UPPER.indexOf(currentChar);
                int shiftIndex = (charIndex - key) % LATIN_SIZE;
                if (shiftIndex < 0) {
                    shiftIndex = LATIN_SIZE + shiftIndex;
                }
                char cipherChar = ALPHABET_UPPER.charAt(shiftIndex);
                decryptedText = decryptedText + cipherChar;
            }
        }
        return decryptedText;
    }
}
