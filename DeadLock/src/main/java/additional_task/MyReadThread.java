package additional_task;

class MyReadThread extends Thread {
    private MyRandomSyncList myRandomSyncList;
    private MyRandomList myRandomList;
    private final boolean flag;

    public MyReadThread(MyRandomList list){
        myRandomList = list;
        flag = false;
    }

    public MyReadThread(MyRandomSyncList list){
        myRandomSyncList = list;
        flag = true;
    }

    @Override
    public void run(){
        for(int i = 0; i < 15; i++){
            if(flag){
                myRandomSyncList.calcZero();
            }
            else{
                myRandomList.calcZero();
            }
        }
    }
}
