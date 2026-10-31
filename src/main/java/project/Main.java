package project;
import java.util.Scanner ;
import service.file_printer;
import service.file_reader;
import java.io.IOException;
import service.hash_class;
public class Main {
    public static void main(String[] args) throws IOException {
        //test1 파일경로 입력 성공
        IO.println("파일경로를 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        hash_class.initializationFuntion();
        file_reader reader = new file_reader();
        String fileName = scanner.nextLine();
        reader.readFile(fileName);
        file_printer printer = new file_printer();

        printer.choice();
        /*
        //test3 정렬되는지 확인
        String []test=new String[4];
        test[0]="aris";
        test[1]="mika";
        test[2]="yuuha";
        test[3]="noah";
        var i=0;
        var j=0;
        var temp="";
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                if(0>test[i].compareTo(test[j]))
                {

                    temp = test[i];
                    test[i]=test[j];
                    test[j]=temp;

                }


            }


        }
        for(int k=0; k<4;k++)
          IO.println(test[k]);
       */
       /*
        //test4 제산함수 확인하기
        var hash_size = 30;
        var test_word = "banana";
        var result = 0;
        hash_class test = new hash_class();
        result = test.test_function(test_word);
        IO.println(result);
        */

    }
}