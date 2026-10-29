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

        int count=0;
        int index=0;
        int hash_addr=0;
        //함수 호출하기 위해서 hash_table 선언
        hash_class hash_table = new hash_class();
        //글자들을 더해서 프린터 클래스로 보내기
        file_printer printer = new file_printer();
        String sum="";
        while ((c = fin.read()) != -1) {




           //출력할 단어들 더하기
            sum+=(char)c;

            if ((char)c == ' '||(char)c=='.'||(char)c==','||(char)c=='"'||(char)c=='?'||(char)c=='!')
            {

                if (!word.isEmpty()){
                    if(word.contains("`s")) {
                        word = word.substring( 0, word.length() - 2);
                    }
                    word.toLowerCase();
                /*   //제산함수
                hash_addr=hash_table.hash_function(word);
                //삽입 함수
                hash_table.hash_insertion(word,hash_addr,index);
               */
                }


                // 단어 초기화
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

        //글자 더한 값 버퍼에 저장
        printer.buffer(sum);


    }


}

