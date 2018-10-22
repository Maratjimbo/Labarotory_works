package additional_task;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

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
        for (Integer aLinkedlist : linkedlist) {
            if (aLinkedlist == 0) {
                zeroValue++;
            }
        }
        return zeroValue;
    }
}
