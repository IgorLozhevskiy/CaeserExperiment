package Caesar.Utils;

public class FileUtils {
    private static final String TXT = ".txt";

    public String renameFileEnc (String fileName, String suffix) {
        return fileName.substring(0, fileName.length() - 4) + suffix + TXT;
    }
    public String renameFileDec (String fileName, String suffix) {
        return fileName.substring(0, fileName.length() - 12) + suffix + TXT;
    }
}
