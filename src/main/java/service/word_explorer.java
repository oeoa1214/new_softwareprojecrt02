package service;
import java.util.Scanner ;

public class word_explorer {

    public void word_explorer()
    {
        Scanner scanner3 = new Scanner(System.in);
        hash_class hash_object = new hash_class();
        String Word = scanner3.nextLine();
        //영어 말고 다른 문자 막는 법 찾아내기
        if(Word==null) {
            IO.println("");
            IO.println("");
            IO.println("");
            IO.println("찾고자 하는 단어는 저장되어 있지 않습니다.");
            try {
                // 2000ms = 2초 동안 정지
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int i=0; i<50; i++)
                IO.println("");
            return;
        }
        hash_object.hash_search(Word);
    }


}
