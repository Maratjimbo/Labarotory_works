package additional_task;

import java.util.ArrayList;
import java.util.Random;

class MyWriteThread extends Thread {

    private ArrayList<Integer>order_of_task = new ArrayList<Integer>();
    private MyRandomSyncList myRandomSyncList;
    private MyRandomList myRandomList;
    private final boolean flag;

    public MyWriteThread(MyRandomList list){
        myRandomList = list;
        if(order_of_task.isEmpty()) {
            makeTaskOrder();
        }
        flag = false;
    }

    public MyWriteThread(MyRandomSyncList list){
        myRandomSyncList = list;
        if(order_of_task.isEmpty()) {
            makeTaskOrder();
        }
        flag = true;
    }


    private void makeTaskOrder(){
        Random rnd = new Random();
        for(int i = 0; i < 1000; i++){
            order_of_task.add(rnd.nextInt(2));
        }
    }

    @Override
    public void run(){
        for(int i = 0; i < 1000; i++){
            if(flag)
            {
                if(order_of_task.get(i) == 0){
                    myRandomSyncList.addNumber();
                }
                else {
                    myRandomSyncList.removeNumber();
                }
            }
            else {
                if(order_of_task.get(i) == 0){
                    myRandomList.addNumber();
                }
                else {
                    myRandomList.removeNumber();
                }
            }
        }
    }
}