package Caesar;

import Caesar.Utils.Decode;
import Caesar.Utils.Encode;
import Caesar.Utils.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Main {
    public static void main(String[] args) throws IOException {
        Encode encoder = new Encode();
        Decode decoder = new Decode();
        FileUtils fileUtils = new FileUtils();
        String text = Files.readString(Path.of(args[1], ""));
        int key = Integer.parseInt(args[2]);

        if ("encode".equals(args[0])) {
            String inputPath = args[1];
            String outputPathString = fileUtils.renameFileEnc(inputPath,"_encoded");
            String encodedString = encoder.encode(text, key);
            Path newFile = Files.createFile(Path.of(outputPathString));
            Files.writeString(newFile,encodedString);

        } else if ("decode".equals(args[0])) {
            String inputPath = args[1];
            String outputPathString = fileUtils.renameFileDec(inputPath, "_decoded");
            String decodedString = decoder.decode(text, key);
            Path newFile = Files.createFile(Path.of(outputPathString));
            Files.writeString(newFile,decodedString);
        }
    }
}

