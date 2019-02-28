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
             BufferedWriter buffReader = new BufferedWriter(osw)) {

            for (final Shoes shoes: listToWrite) {
                buffReader.write(shoes.getHeaders() + "\n");
                buffReader.write(shoes.toCSV() + "\n");
            }
        } finally {
            System.out.println("Writing to file was successful");
        }
    }
}
