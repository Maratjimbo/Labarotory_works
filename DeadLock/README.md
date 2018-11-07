# Отчет по лабораторной работе №9

## Задание
Написать программу, приводящую к ситуации взаимной блокировки (deadlock).

## Дополнительное задание

[Reader-Writer] Реализуйте класс MyRandomList (на основе LinkedList) с тремя функциями:
- void addNumber() --- добавление случайного элемента
- void removeNumber() --- удаление элемента со случайным индексом
- int calcZero() --- подсчет числа ненулевых элементов

Реализуйте потоки двух видов: ПОТОКИ первого вида (MyWriteThread) добавляют или удаляют из MyRandomList случайные элементы, ПОТОК второго вида (MyReadThread) --- подсчитывает число ненулевых элементов в массиве и выводят результат на экран. Сделать две версии класса MyRandomList с синхронизацией и без. Показать в mian, что при использовании версии без синхронизации возникает ошибка.


## Инструкция для пользователя

Чтобы запустить программу, нужно запустить main(). После запуска программы создается два потока: первый - записывает или удаляет в листе случайные элементы, второй - подсчитывает в этом листе количество нулей и выводит их. Также создается еще 2 потока, которые выполняют те же самые действия, но только уже с синхронизированной версией листа. Соответственно в первых двух потоках происходит ошибка, когда один первый поток, к примеру, удаляет элемент из листа, а второй поток хочет получить этот элемент и посмотреть на равность его нулю. Вторые 2 потока соответственно с такой ошибкой не встречаются, так как все методы там синхронизированны.

## Тест
#### Тест №1
###### Основное задание
Первый поток вошел в метод FirstClass.firstFun ()  
Второй поток вошел в метод SecondClass.secondFun ()  
Первый поток пытается вызвать метод SecondClass.deadSecondThread ()  
Второй поток пытается вызвать метод FirstClass.deadFirstThread ()  

###### Дополнительное задание
zeroValue in RandomList = 0  
Exception in thread "Thread-1" java.util.ConcurrentModificationException  
	at java.base/java.util.LinkedList$ListItr.checkForComodification(LinkedList.java:970)  
	at java.base/java.util.LinkedList$ListItr.next(LinkedList.java:892)  
	at additional_task.MyRandomList.calcZero(MyRandomList.java:38)  
	at additional_task.MyReadThread.run(MyReadThread.java:27)  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
  
#### Тест №2

###### Основное задание
Первый поток вошел в метод FirstClass.firstFun ()  
Второй поток вошел в метод SecondClass.secondFun ()  
Первый поток пытается вызвать метод SecondClass.deadSecondThread ()  
Второй поток пытается вызвать метод FirstClass.deadFirstThread ()  

###### Дополнительное задание
zeroValue in RandomList = 0  
Exception in thread "Thread-1" java.util.ConcurrentModificationException  
	at java.base/java.util.LinkedList$ListItr.checkForComodification(LinkedList.java:970)  
	at java.base/java.util.LinkedList$ListItr.next(LinkedList.java:892)  
	at additional_task.MyRandomList.calcZero(MyRandomList.java:38)  
	at additional_task.MyReadThread.run(MyReadThread.java:27)  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  

#### Тест №3
###### Основное задание
Первый поток вошел в метод FirstClass.firstFun ()  
Второй поток вошел в метод SecondClass.secondFun ()  
Первый поток пытается вызвать метод SecondClass.deadSecondThread ()  
Второй поток пытается вызвать метод FirstClass.deadFirstThread ()  

###### Дополнительное задание
zeroValue in RandomList = 0  
Exception in thread "Thread-1" java.util.ConcurrentModificationException  
	at java.base/java.util.LinkedList$ListItr.checkForComodification(LinkedList.java:970)  
	at java.base/java.util.LinkedList$ListItr.next(LinkedList.java:892)  
	at additional_task.MyRandomList.calcZero(MyRandomList.java:38)  
	at additional_task.MyReadThread.run(MyReadThread.java:27)  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  
zeroValue in RandomSyncList = 0  

