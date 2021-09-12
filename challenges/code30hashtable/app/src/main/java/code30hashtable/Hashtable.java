package code30hashtable;

import java.util.LinkedList;

public class Hashtable {
//    LinkedList<Object>[] arr;
//
//    public void HashTable(int size) {
//        this.arr= new LinkedList[size];
//
//        for(int j = 0; j < this.arr.length; ++j) {
//            this.arr[j] = new LinkedList();
//        }
//
//    }
//

public Hash[] array =new Hash[20];
    public int hash(String key){
        int k=0;
        int result=0;
        for (int i = 0; i < key.length(); i++) {
            k= k+(int)key.charAt(i);
            result=Math.round(k/29);
        }

        return result;
    }

    public void add(String key, int value){
        if(array[hash(key)] ==null){
            array[hash(key)]=new Hash(key,value);
        }else {
            Hash newValue=new Hash(key,value);
            array[hash(key)].next=newValue;
        }

    }


    public boolean contains(String key){
        Hash current = array[hash(key)];

        while (current!= null){
            if(current.key==key){
                 return true;
            }
            current=current.next;

        }
        return false;
    }
    public int get(String NewKey){
        Hash current = array[hash(NewKey)];
        int T= 0;
        while (current!= null){
            if(current.key==NewKey){
                T=current.value;
            }
            current=current.next;

        }
        return T;
    }
    public static String repeatedWord (String text){

        String[] repeatWord = text.split(" ");

        for(int i = 0; i<repeatWord.length; i++){
            for(int j= 0; j<i; j++){

                if (repeatWord[i].equals(repeatWord[j].toLowerCase()))
                    return repeatWord[i].toLowerCase();
            }
        }

        return null;
    }

}
