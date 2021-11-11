package data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Uploader {

    public void uploadToFile(String author, int id, String firstLine, String secondLine, String thirdLine) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/data/uploadedPoems"));
            writer.write("name of author: " + author);
            writer.write("\n" + firstLine);
            writer.write("\n" + secondLine);
            writer.write("\n" + thirdLine);
            writer.write("\nEnd of poem number: " + id + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
