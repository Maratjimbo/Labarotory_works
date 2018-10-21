public class Deadlock extends Thread {
    FirstClass firstClass = new FirstClass();
    SecondClass secondClass = new SecondClass();

    Deadlock() {
        Thread.currentThread().setName("Первый поток");
        Thread thread = new Thread(this,"Второй поток");
        thread.start();

        firstClass.firstFun(secondClass); // получить блокировку для объекта firstClass
    }

    public void run() {
        secondClass.secondFun(firstClass); // получить блокировку для объекта secondClass
    }
}