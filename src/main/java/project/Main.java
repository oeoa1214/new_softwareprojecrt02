package project;

import service.file_reader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {

        file_reader reader = new file_reader();

        reader.readFile(
                "C:\\Users\\oeoa1\\Desktop\\블루아카이브 미카.txt");


    }
}