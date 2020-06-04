package com.custom;

public class CustomLinkedHashMap<K,V > {

    static class Entry<K,V>{

        K key;
        V value;
        Entry<K,V> next;
        Entry<K,V> before, after;

        public Entry(K key, V value){
            this.key=key;
            this.value= value;
            this.next= null;
            this.before= null;
            this.after= null;

          }

        }

        int size;
        int capacity;
        Entry head;
        Entry tail;

    Entry[] table;
    public CustomLinkedHashMap(int capacity){
      this.size=0;
      this.capacity=capacity;

      this.table= new Entry[capacity];

    }

    public void put(K key, V value){

        Entry entry= new Entry(key,value);

        boolean replace =false;

        int hash= hash(key);

        if(table[hash]== null){
            table[hash]= entry;
            size++;
            return;
        }


        Entry current = table[hash];

        while(null != current.next){

            if(current.key.equals(key)){
                current.value= value;
                replace=true;
                return;
            }
            current= current.next;
        }

        if(current.key.equals(key)){
            current.value= value;
            replace=true;
        }
        else{

            current.next=entry;
            size++;
        }

}

public boolean remove(K key){

        //now firts check the entry in table
    int hash= hash(key);



    if(null!=table[hash])
    {
        Entry current= table[hash];

        while(null!=current ){
            if(current.key.equals(key)){
                table[hash]= table[hash].next;
              deleteMaintainOrder(current);
            }

            current= current.next;
        }
    }
    return false;


}

public void deleteMaintainOrder(Entry entry){

        if(entry.key.equals(head.key)){
            head= entry.after;
            entry.after.before= null;

        }

    if(entry.key.equals(tail.key)){

         tail=entry.before;
         entry.before.after=null;
    }

        Entry current= head;

        while(null != current){
            if(entry.key.equals(current.key)){

                entry.before.after=entry.after;
                entry.after.before=entry.before;



            }
            current= current.after;

        }


}



public void insertMaintainOrder(Entry node){
        if(head==null){
            head=node;
            tail= node;

        }
        else{
            tail.after=node;
            node.before=tail;
            tail=node;
        }


}

   public int hash(K key){

        return key.hashCode()%capacity;
   }
}
