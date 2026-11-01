package service;
import java.io.Serializable;
//해쉬클래스
public class hash_class implements Serializable{

    public static int hash_size=1000;

    private static Node [] hash_table= new Node[hash_size];

  //객체 선언 없이 호출+ 어느곳이나공유할려고
    public static void initializationFuntion() {
        for (int i = 0; i < 1000; i++) {
            hash_table[i]=new Node("",0);

        }
    }
    public hash_class()
    {

    }

    public hash_class(String key,int index)
    {
        int hash_addr=hash_function(key);
         new Node(key,index);


    }

    public static class Node implements Serializable{
        public String key;

        private int index;
        //충돌한 다음 노드
        private Node next;

        public Node( String key, int index)
        {
            //생성자에 유효성 검증
            this (key , index ,null);

        }
        // Node 클래스는
        // int data
        // string key
        // 다른 노드들을 참조하는 Node ref 3개로 이루어져 있다.
        //key=63=>h(key)는 address이고 이다 =11

        public Node( String key, int index,Node next)
        {
            this.key=key;
            this.index=index;
            this.next=next;

        }


    }



     public int hash_function(String word){

        int sum=0;
        int hash_addr=0;
        for (int i=0; i<word.length(); i++)
        sum+=word.charAt(i);
        hash_addr= sum%hash_size;
        return hash_addr;
    }

    public void hash_insertion(String word,int index){
        //해쉬 함수로 부터 hash_addr받음
        int hash_addr=hash_function(word);
        //객체 배열 순회
        //초기값저장
        int initialPos=hash_addr;
        int n=1;
        //do while로 만들기
        do{
            // 1번 비었을 경우 대입
            if(hash_table[hash_addr].key.equals(""))
            {
                hash_table[hash_addr].key=word;
                hash_table[hash_addr].index=index;
                return;
            }
            if(!hash_table[hash_addr].key.equals(""))
            {  //안 비었는데 단어랑 키가 같은 경우
                Node temp=hash_table[hash_addr];
                if(temp.key.equals(word))
                {
                    Node nextConnection_object =new Node(word, index);
                    while(temp.next!=null) {
                        temp = temp.next;
                    }
                    temp.next= nextConnection_object;
                    return;
                }
                //안 비었는데 키랑 단어가 다른경우 1차조사법 방법으로 비어 있는 곳 찾기
                else {
                hash_addr=((initialPos)+n)%hash_size;
                }
            }
            n++;
        }

        while(initialPos!=hash_addr);


        IO.println("공간부족");

        }

            //어떻게 아스키코드가 같은데 같은 글자면 저장하고 다른글자면 +1 하지

    public void hash_search(String word) {

       int hash_addr= hash_function(word);
        Node temp=hash_table[hash_addr];
        System.out.printf("%-13s  %-5s %s\n", "단어", "", "줄번호");
        String sum="";
        while(temp!=null)
        {

            sum+=temp.index;
            sum+=" ";

            temp=temp.next;

        }
        System.out.printf("%-15s  %-5s %s\n",word, "", sum);



    }
    //오버 라이딩
    public void hash_search() {
        System.out.printf("%-13s  %-5s %s\n", "단어", "", "줄번호");
        Node temp = new Node("", 0);
        for(int i=0; i<hash_size;i++) {
            temp=hash_table[i];
            if(hash_table[i].key!="") {

                String sum = "";
                String word=temp.key;
                while (temp != null) {

                    sum += temp.index;
                    sum += " ";

                    temp = temp.next;


                }
                //왼쪽 15폭으로 공백채워서 맞추기 중간 5폭 공백채워서 맞추기
                System.out.printf("%-15s  %-5s %s\n", word, "", sum);

            }
        }

    }

    public static void  hash_sort() {
        hash_class hash = new hash_class();
        Node temp = new Node("", 0);


        var i = 0;
        var j = 0;

        for (i = 0; i < hash.hash_size; i++) {
            for (j = 0; j < hash.hash_size; j++) {
                if (0 > hash_table[i].key.compareTo(hash_table[j].key)) {

                    temp = hash_table[i];
                    hash_table[i] = hash_table[j];
                    hash_table[j] = temp;

                }


            }


        }


    }






    }


    /*test3
    public int test_function  (String word){


        int sum = 0;
        int hash_addr = 0;
        for (int i = 0; i < word.length(); i++)
            sum += word.charAt(i);
        hash_addr = sum % hash_size;
        return hash_addr;
    }
    */











