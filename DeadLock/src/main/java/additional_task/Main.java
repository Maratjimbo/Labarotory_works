package additional_task;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyRandomList myRandomList = new MyRandomList();
        MyRandomSyncList myRandomSyncList = new MyRandomSyncList();
        MyWriteThread m1 = new MyWriteThread(myRandomList);
        m1.start();
        MyReadThread myReadThread = new MyReadThread(myRandomList);
        myReadThread.start();
        m1.join();
        myReadThread.join();

        MyWriteThread m3 = new MyWriteThread(myRandomSyncList);
        m3.start();
        MyReadThread myReadThread2 = new MyReadThread(myRandomSyncList);
        myReadThread2.start();
    }
}
