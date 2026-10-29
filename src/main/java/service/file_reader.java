package service;
import java.io.*;
import java.io.Serializable;

public class file_reader implements Serializable {
    public void readFile(String fileName) throws IOException {


        //스트림을 생성하고 파일을 열어 스트림과 연결
        FileReader fin = new FileReader(fileName);
        int c;
        String word = "";
        //문자를 c 에 읽음 . 파일 끝까지 반복
        // 문자 c 화면에 출력
        int count=0;
        int index=0;
        int hash_addr=0;
        //함수 호출하기 위해서 hash_table 선언
        hash_class hash_table = new hash_class();
        while ((c = fin.read()) != -1) {

            //문자 하나씩 출력 공백문자 일 떈 공백문자 출력
            System.out.print((char) c);
            if ((char) c == ' ') {
             /*   //제산함수
                hash_addr=hash_table.hash_function(word);
                //삽입 함수
                hash_table.hash_insertion(word,hash_addr,index);
               */
                word= "";
            } else {
                word += (char) c;

            }
            ++count;
            index=count/80;
        }

        //마지막 단어
        if (word.equals("") != true) {
            /*
            hash_addr=hash_function(word);

            hash_insertion(word,hash_addr,index);
            */
        }



        fin.close();



    }


}

