class SecondClass {

    synchronized void secondFun(FirstClass firstClass) {

        System.out.println(Thread.currentThread().getName() + " вошел в метод SecondClass.secondFun ()");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Класс SecondClass прерван");
        }

        System.out.println(Thread.currentThread().getName() + " пытается вызвать метод FirstClass.deadFirstThread ()");
        firstClass.deadFirstThread();
    }

    synchronized void deadSecondThread() {
        System.out.println("В методе SecondClass.deadSecondThread ()");
    }
}