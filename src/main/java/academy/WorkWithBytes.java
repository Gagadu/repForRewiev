package academy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        try {
            File myFile = new File(fileName);
            myFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException("Cant create a file", e);
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            for (byte b : data) {
                bufferedWriter.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

