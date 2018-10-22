package additional_task;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class MyRandomSyncList {
    List<Integer> linkedlist;

    public synchronized void addNumber(){
        Random rnd = new Random();
        linkedlist.add(rnd.nextInt(100));
    }

    public synchronized void removeNumber(){
        if(linkedlist.isEmpty()){
            return;
        }
        Integer size = linkedlist.size();
        Random rnd = new Random();
        int tmp_index = rnd.nextInt(size);
        if (tmp_index != 0) {
            tmp_index--;
        }
        linkedlist.remove(tmp_index);
    }

    public synchronized int calcZero(){
        int zeroValue = 0;
        ListIterator<Integer> listIterator = linkedlist.listIterator();
        while(listIterator.hasNext()){
            if(listIterator.next() == 0){
                zeroValue++;
            }
        }
        return zeroValue;
    }
}

