# Отчет по лабораторной работе №9

## Задание
Написать текстовый чат для двух пользователей на сокетах. Чат должен быть реализован по принципу клиент-сервер. Один пользователь находится на сервере, второй --- на клиенте. Адреса и порты задаются через командную строку: клиенту --- куда соединяться, серверу --- на каком порту слушать. При старте программы выводится текстовое приглашение, в котором можно ввести одну из следующих команд:
1. Задать имя пользователя (@name Vasya)
2. Послать текстовое сообщение (Hello)
3. Выход (@quit)

Принятые сообщения автоматически выводятся на экран. Программа работает по протоколу UDP.


## Дополнительное задание

In coming


## Инструкция для пользователя

Для запуска программы, нужно запустить сервер, потом соответственно клиент. Для клиента появится сообщение, в котором предлагается ввести порт, на котором работает сервер. Послу ввода порта, проиходит подключение к серверу, и сервер сразу же пишет клиенту сообщение о том, какие команды доступны ему. После этого клиент может писать сообщения серверу, сервер же в ответ писать сообщения клиенту.

## Тест
#### Тест №1
###### Основное задание

Client:

нояб. 07, 2018 10:12:58 AM Client main
INFO: Enter the port of server:
33333
нояб. 07, 2018 10:13:01 AM Client main
INFO: Server connection established
нояб. 07, 2018 10:13:01 AM Client main
INFO: Available command:
@name Name - Enter your name
Message - Send message
@quit - Disconnect
нояб. 07, 2018 10:13:01 AM Client main
INFO: Enter your message to server:
@name UserName
нояб. 07, 2018 10:13:14 AM Client main
INFO: Client sent message to server
нояб. 07, 2018 10:13:14 AM Client main
INFO: Wait message from server
нояб. 07, 2018 10:13:14 AM Client main
INFO: Server : Now your name on server: UserName
нояб. 07, 2018 10:13:14 AM Client main
INFO: Enter your message to server:
Hello, world
нояб. 07, 2018 10:13:19 AM Client main
INFO: Client sent message to server
нояб. 07, 2018 10:13:19 AM Client main
INFO: Wait message from server
нояб. 07, 2018 10:13:26 AM Client main
INFO: Server : Hello, im server
нояб. 07, 2018 10:13:26 AM Client main
INFO: Enter your message to server:
@quit
нояб. 07, 2018 10:13:31 AM Client main
INFO: Client sent message to server
нояб. 07, 2018 10:13:31 AM Client main
INFO: Disconnect from server
нояб. 07, 2018 10:13:31 AM Client main
INFO: Message from server:
нояб. 07, 2018 10:13:31 AM Client main
INFO: Connection terminated

Server:

нояб. 07, 2018 10:12:45 AM Server main
INFO: Waiting for client connection
нояб. 07, 2018 10:13:01 AM Server main
INFO: Client is connected
нояб. 07, 2018 10:13:01 AM Server main
INFO: Server waiting message from client
нояб. 07, 2018 10:13:14 AM Server main
INFO: Message from client : @name UserName
нояб. 07, 2018 10:13:14 AM Server main
INFO: Server waiting message from UserName
нояб. 07, 2018 10:13:19 AM Server main
INFO: Message from UserName : Hello, world
нояб. 07, 2018 10:13:19 AM Server main
INFO: Enter your message to UserName
Hello, im server
нояб. 07, 2018 10:13:26 AM Server main
INFO: Server wrote message to UserName
нояб. 07, 2018 10:13:26 AM Server main
INFO: Server waiting message from UserName
нояб. 07, 2018 10:13:31 AM Server main
INFO: Message from UserName : @quit
нояб. 07, 2018 10:13:31 AM Server main
INFO: Client initialize connections suicide
нояб. 07, 2018 10:13:31 AM Server main
INFO: Client disconnected
нояб. 07, 2018 10:13:31 AM Server main
INFO: All connections was closed

###### Дополнительное задание


#### Тест №2

###### Основное задание
Client:

нояб. 07, 2018 10:15:49 AM Client main
INFO: Enter the port of server:
33333
нояб. 07, 2018 10:15:52 AM Client main
INFO: Server connection established
нояб. 07, 2018 10:15:52 AM Client main
INFO: Available command:
@name Name - Enter your name
Message - Send message
@quit - Disconnect
нояб. 07, 2018 10:15:52 AM Client main
INFO: Enter your message to server:
Hello, my name Marat
нояб. 07, 2018 10:15:57 AM Client main
INFO: Client sent message to server
нояб. 07, 2018 10:15:57 AM Client main
INFO: Wait message from server
нояб. 07, 2018 10:16:05 AM Client main
INFO: Server : Hello, client
нояб. 07, 2018 10:16:05 AM Client main
INFO: Enter your message to server:
@quit
нояб. 07, 2018 10:16:10 AM Client main
INFO: Client sent message to server
нояб. 07, 2018 10:16:10 AM Client main
INFO: Disconnect from server
нояб. 07, 2018 10:16:10 AM Client main
INFO: Message from server:
нояб. 07, 2018 10:16:10 AM Client main
INFO: Connection terminated

Server:

нояб. 07, 2018 10:15:46 AM Server main
INFO: Waiting for client connection
нояб. 07, 2018 10:15:52 AM Server main
INFO: Client is connected
нояб. 07, 2018 10:15:52 AM Server main
INFO: Server waiting message from client
нояб. 07, 2018 10:15:57 AM Server main
INFO: Message from client : Hello, my name Marat
нояб. 07, 2018 10:15:57 AM Server main
INFO: Enter your message to client :
Hello, client
нояб. 07, 2018 10:16:05 AM Server main
INFO: Server wrote message to client.
нояб. 07, 2018 10:16:05 AM Server main
INFO: Server waiting message from client
нояб. 07, 2018 10:16:10 AM Server main
INFO: Message from client : @quit
нояб. 07, 2018 10:16:10 AM Server main
INFO: Client initialize connections suicide
нояб. 07, 2018 10:16:10 AM Server main
INFO: Client disconnected
нояб. 07, 2018 10:16:10 AM Server main
INFO: All connections was closed

###### Дополнительное задание


#### Тест №3
###### Основное задание

Client:

нояб. 07, 2018 10:17:20 AM Client main
INFO: Enter the port of server:
33333
нояб. 07, 2018 10:17:23 AM Client main
INFO: Server connection established
нояб. 07, 2018 10:17:23 AM Client main
INFO: Available command:
@name Name - Enter your name
Message - Send message
@quit - Disconnect
нояб. 07, 2018 10:17:23 AM Client main
INFO: Enter your message to server:
@quit
нояб. 07, 2018 10:17:26 AM Client main
INFO: Client sent message to server
нояб. 07, 2018 10:17:26 AM Client main
INFO: Disconnect from server
нояб. 07, 2018 10:17:26 AM Client main
INFO: Message from server:
нояб. 07, 2018 10:17:26 AM Client main
INFO: Connection terminated

Server:

нояб. 07, 2018 10:17:17 AM Server main
INFO: Waiting for client connection
нояб. 07, 2018 10:17:23 AM Server main
INFO: Client is connected
нояб. 07, 2018 10:17:23 AM Server main
INFO: Server waiting message from client
нояб. 07, 2018 10:17:26 AM Server main
INFO: Message from client : @quit
нояб. 07, 2018 10:17:26 AM Server main
INFO: Client initialize connections suicide
нояб. 07, 2018 10:17:26 AM Server main
INFO: Client disconnected
нояб. 07, 2018 10:17:26 AM Server main
INFO: All connections was closed
###### Дополнительное задание


