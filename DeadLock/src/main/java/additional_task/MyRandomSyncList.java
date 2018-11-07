package additional_task;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class MyRandomSyncList {
    private List<Integer> linkedlist;

    public MyRandomSyncList(){
        linkedlist = new LinkedList<Integer>();
    }

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
        Iterator<Integer> iterator = linkedlist.iterator();
        while (iterator.hasNext()){
            Integer value = iterator.next();
            if(value == 0){
                zeroValue++;
            }
        }
        return zeroValue;
    }
}