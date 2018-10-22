package additional_task;

import java.util.ArrayList;
import java.util.Random;

public class MyWriteThread extends Thread {

    private ArrayList<Integer>order_of_task;
    private MyRandomSyncList myRandomSyncList;
    private MyRandomList myRandomList;
    private boolean flag;

    public MyWriteThread(MyRandomList list){
        myRandomList = list;
        makeTaskOrder();
        flag = false;
    }

    public MyWriteThread(MyRandomSyncList list){
        myRandomSyncList = list;
        makeTaskOrder();
        flag = true;
    }


    public void makeTaskOrder(){
        Random rnd = new Random();
        for(int i = 0; i < 100; i++){
            order_of_task.add(rnd.nextInt(1));
        }
    }

    @Override
    public void run(){
        for(int i = 0; i < 100; i++){
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
