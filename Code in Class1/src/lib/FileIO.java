package lib;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
    private ArrayList<String> fileRows = new ArrayList();
    private String filename;

    public FileIO(String fileName) {
        this.filename = fileName;
    }

    public void setFileData() throws FileNotFoundException {
        String path = new File(filename).getAbsolutePath();
        File inFileHandle = new File(path);
        try {
            Scanner sc = new Scanner(inFileHandle);
            String line = null;
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                fileRows.add(line);
            }
        } catch (FileNotFoundException e) {
            String message = "File not found.";
            throw new FileNotFoundException(message);
        }
    }

    public ArrayList<String> getFileData() {
        return fileRows;
    }
}
