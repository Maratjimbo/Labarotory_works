package additional_task;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

class MyRandomList {
    private List<Integer> linkedlist;

    public MyRandomList(){
        linkedlist = new LinkedList<Integer>();
    }

    void addNumber(){
        Random rnd = new Random();
        linkedlist.add(rnd.nextInt(100));
    }

    void removeNumber(){
        if(linkedlist.isEmpty()){
            return;
        }
        Integer size = linkedlist.size();
        Random rnd = new Random();
        int tmpIndex = rnd.nextInt(size);
        if (tmpIndex != 0) {
            tmpIndex--;
        }
        linkedlist.remove(tmpIndex);
    }

    int calcZero(){
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