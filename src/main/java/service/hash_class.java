package service;
import java.io.Serializable;
public class hash_class implements Serializable{
    public int hash_size=13;
    private Node [] hash_array= new Node[hash_size];

    public static class Node implements Serializable{
        public String key;
   ;
        private int index;
        //충돌한 다음 노드
        private Node next;

        public Node( String key, int index)
        {
            //생정자에 유효성 검증하기☆☆☆☆☆☆☆
            this (key , index ,null);

        }

        public Node( String key, int index,Node next)
        {
            this.key=key;
            this.index=index;
            this.next=next;

        }


    }




     private int hash_function(String word){

        int sum=0;
        int hash_addr=0;
        for (int i=0; i<word.length(); i++)
        sum+=word.charAt(i);
        hash_addr= sum%hash_size;
        return hash_addr;
    }











}
