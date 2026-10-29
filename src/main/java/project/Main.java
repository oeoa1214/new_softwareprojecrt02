package project;
import java.util.Scanner ;
import service.file_reader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        IO.println("파일경로를 입력해주세요.");
        Scanner scanner=new Scanner(System.in);
        file_reader reader = new file_reader();
        String fileName = scanner.nextLine();


        reader.readFile(fileName);


    }
}