package by.itstep.goutor.lesson45.multithread.controller;

import by.itstep.goutor.lesson45.multithread.model.data.Market;
import by.itstep.goutor.lesson45.multithread.model.logic.Consumer;
import by.itstep.goutor.lesson45.multithread.model.logic.Producer;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Market market = new Market();
        Producer producer1 = new Producer(market, System.out, 1000);
        Producer producer2= new Producer(market, System.out, 2000);
        Consumer consumer1 = new Consumer(market, System.out, 1);
        Consumer consumer2 = new Consumer(market, System.out, 2);
        Consumer consumer3 = new Consumer(market, System.out, 3);
        Consumer consumer4 = new Consumer(market, System.out, 4);
        Consumer consumer5 = new Consumer(market, System.out, 5);
        Consumer consumer6 = new Consumer(market, System.out, 6);


        TimeUnit.SECONDS.sleep(10);
        producer1.stop();
        producer2.stop();
        consumer1.stop();
        consumer2.stop();
        consumer3.stop();
        consumer4.stop();
        consumer5.stop();
        consumer6.stop();

    }
}
