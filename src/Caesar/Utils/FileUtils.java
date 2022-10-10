package Caesar.Utils;

public class FileUtils {
    public static final String TXT = ".txt";

    public String addSuffixToFileName(String fileName, String suffix) {
        return fileName.substring(0, fileName.length() - 4) + suffix + TXT;
    }

}
