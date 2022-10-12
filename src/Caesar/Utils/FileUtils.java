package Caesar.Utils;

import Caesar.Main;

public class FileUtils {
    private static final String TXT = ".txt";

    public String renameFile (String fileName, String suffix) {
        if (fileName.endsWith("_encoded.txt")) {
            return fileName.substring(0, fileName.lastIndexOf("_encoded.txt")) + suffix + TXT;
        } else if (fileName.endsWith(TXT)) {
            return fileName.substring(0, fileName.length() - 4) + suffix + TXT;
        }
        return fileName;
    }
}
