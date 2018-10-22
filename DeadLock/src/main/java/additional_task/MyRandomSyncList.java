package additional_task;

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

    public synchronized void calcZero(){
        int zeroValue = 0;
        for (Integer aLinkedlist : linkedlist) {
            if (aLinkedlist == 0) {
                zeroValue++;
            }
        }
    }
}

