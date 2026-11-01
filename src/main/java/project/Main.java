package project;
import service.*;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner ;
import service.file_printer;
import service.file_reader;
import java.io.IOException;
import service.hash_class;
public class Main {
    public static void main(String[] args) throws IOException {

        // 객체 초기화 함수

        hash_class.initializationFuntion();
        //파일 리더 객체 선언


        Scanner intscanner = new Scanner(System.in);
        Scanner stringscanner = new Scanner(System.in);




        boolean mySwitch=true;


        String fileName="";
        while(mySwitch){

        {
            IO.println("");
            IO.println("");
            IO.println("");
            try {
                // 5000ms = 5초 동안 정지
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        IO.println("===== 마이 인덱스=====\n" +
                "1.파일 입력하기\n" +
                "2.파일 조회하기(사용자 파일)\n" +
                "3.단어 검색하기\n" +
                "4.전체 인덱스 출력하기\n" +
                "0. 종료\n" +
                "\n" +
                "원하는 기능을 입력하세요: \n");
        
        //처음에 실패하면 종료됨
        int selection=0;
        try {
            selection = (int)intscanner.nextInt();
        }
        catch (InputMismatchException E)
        {

        }

        switch(selection) {
            case 1:
                //test1 파일경로 입력 성공
                try {
                    for(int i=0; i<50; i++)
                        IO.println("");
                    IO.println("파일 경로를 입력 해주세요");
                    fileName = stringscanner.nextLine();
                    file_reader reader = new file_reader();
                    reader.readFile(fileName);
                    for(int i=0; i<50; i++)
                        IO.println("");
                    IO.println("파일이 입력되었습니다.");
                    try {
                        // 2000ms = 2초 동안 정지
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for(int i=0; i<50; i++)
                        IO.println("");
                } catch (InputMismatchException e) {
                    IO.println("잘못된 파일 입력입니다 다시 입력해주세요.");


                }
                break;

            case 2:
                if (fileName == "") {
                    try {
                        // 2000ms = 2초 동안 정지
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    IO.println("아직 파일이 등록되지 않았습니다 먼저 메뉴 1번파일을 먼저 입력해주세요.");
                    for(int i=0; i<50; i++)
                        IO.println("");
                    break;
                }
                for(int i=0; i<50; i++)
                    IO.println("");
                file_printer printer = new file_printer();
                printer.choice();
                break;
            case 3:
                if (fileName == "") {
                    IO.println("아직 파일이 등록되지 않았습니다 먼저 메뉴 1번파일을 먼저 입력해주세요.");
                    try {
                        // 2000ms = 2초 동안 정지
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for(int i=0; i<50; i++)
                        IO.println("");
                    break;
                }
                IO.println("");
                IO.println("");
                try {
                    // 2000ms = 2초 동안 정지
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for(int i=0; i<50; i++)
                    IO.println("");

                IO.println("찾고자 하는 단어를 입력 해주세요.");
                IO.println("");
                IO.println("");

                word_explorer exploer_object = new word_explorer();
                exploer_object.word_explorer();
                break;

            case 4:
                if (fileName == "") {
                    IO.println("아직 파일이 등록되지 않았습니다 먼저 메뉴 1번파일을 먼저 입력해주세요.");

                    try {
                        // 2000ms = 2초 동안 정지
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for(int i=0; i<50; i++)
                        IO.println("");
                    break;
                }
                all_index_printer all_index_object = new all_index_printer();
                all_index_object.all_index_printer();
                break;


            case 0:
                mySwitch = false;


            default:
                IO.println("잘못된 메뉴 입력입니다. 0~4 중 하나의 번호를 입력해주세요.");
          }
        }

        }


























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
    //test 6 성공!!
    /*
        hash_class hash_object=new hash_class();
        IO.print("단어 입력:");
        String testWord = scanner.nextLine();
        hash_object.hash_search(testWord);
     */

    }


    //test 7 메인에서 함수는 static붙여야됨
    /*
    public class myclass{
        public int data;
        public myclass next;
        myclass(int data)
        {
            this.data=data;
        }
    }
    public static void hash_search() {

        myclass hash_object1=new myclass(1);
        myclass hash_object2=new myclass(2);
        myclass hash_object3=new myclass(3);
        myclass hash_object4=new myclass(4);
        hash_object1.next=hash_object2;
        hash_object2.next=hash_object3;
        hash_object3.next=hash_object4;
        myclass temp=hash_object1;
        while(temp!=null)
        {

            IO.print(temp.data);
            temp=temp.next;

        }


    }
 */
}