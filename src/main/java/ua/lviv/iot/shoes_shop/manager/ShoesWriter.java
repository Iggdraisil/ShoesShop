package ua.lviv.iot.shoes_shop.manager;

import ua.lviv.iot.shoes_shop.shoes.Shoes;

import java.io.*;
import java.util.List;

public class ShoesWriter {
    public static void writeToFile(final List<Shoes> listToWrite)
            throws IOException {
        final File myFile = new File("ShoesList");
        try (FileOutputStream fos = new FileOutputStream(myFile);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bufferedWriter = new BufferedWriter(osw)) {

            for (final Shoes shoes: listToWrite) {
                bufferedWriter.write(shoes.getHeaders() + "\n");
                bufferedWriter.write(shoes.toCSV() + "\n");
            }
        }
    }
}
