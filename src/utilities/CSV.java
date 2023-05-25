package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

    public static List<String[]> read (String file) {
        List<String[]> data = new LinkedList<String[]>();
        String dataRow;

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((dataRow = br.readLine()) != null) {
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Can't find file");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Can't read file");
        }

        return data;
    }


}
