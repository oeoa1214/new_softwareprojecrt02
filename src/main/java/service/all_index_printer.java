package service;

public class all_index_printer {
    //내포 클래스의 객체 배열
    public static void  sort(hash_class.Node [] node) {
        hash_class hash = new hash_class();



        var i=0;
        var j=0;
        var temp="";
        for (i = 0; i < hash.hash_size; i++) {
            for (j = 0; j < hash.hash_size; j++) {
                if(0>node[i].key.compareTo(node[j].key))
                {

                    temp = node[i].key;
                    node[i].key=node[j].key;
                    node[j].key=temp;

                }


            }


        }


    }
          /*
      public void index_print(){
          hash_class hash = new hash_class();
          hash[]node=new hash[4];
          sort(hash.Node);


      }
      */
}




