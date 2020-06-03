package com.array;

public class CustomHashMap<K,V> {

    static class Entry<K,V>{

        K key;
        V value;
        Entry<K,V> next;
         public Entry(K Key, V value){
             this.key= key;
             this.value= value;
             this.next= null;
         }
    }

    int capacity= 4;
    Entry<K,V> table [];
    int size;
    public CustomHashMap(int capacity){
        this.capacity= capacity;
        this.table = new Entry[capacity];
        size=0;
    }

    public void put(K key, V value){

        int hash=hashKey(key);

        if(table[hash]== null){
            //It means we do not have entry for that particular hash
           table[hash]= new Entry<>(key,value) ;
        }
        //If the entry is there in table , it means we need to check wheteher the update would be done or
        //will add a new node .

        else{
            Entry current = table[hash];


            while(current.next!=null){

                if(current.key.equals(key)){//here I am updating the value
                    current.value= value;
                   return;
                }

                current= current.next;


            }

            if(current.key.equals(key)){
                current.value= value;
                return;

            }
            else{
                current.next=new Entry(key,value);
            }


        }


    }

    public void get(){


    }

    public int hashKey(K key){

        int hash= key.hashCode()%capacity;
          return hash;
    }


}
