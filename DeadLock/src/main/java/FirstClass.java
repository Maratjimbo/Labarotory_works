class FirstClass {

    synchronized void firstFun(SecondClass secondClass) {

        System.out.println(Thread.currentThread().getName() + " вошел в метод FirstClass.firstFun ()");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Класс FirstClass прерван");
        }

        System.out.println(Thread.currentThread().getName()+ " пытается вызвать метод SecondClass.deadSecondThread ()");
        secondClass.deadSecondThread();
    }

    synchronized void deadFirstThread() {
        System.out.println("В методе FirstClass.deadFirstThread ()");
    }
}