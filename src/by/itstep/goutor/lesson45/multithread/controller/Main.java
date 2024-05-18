package by.itstep.goutor.lesson45.multithread.controller;

import by.itstep.goutor.lesson45.multithread.model.data.Market;
import by.itstep.goutor.lesson45.multithread.model.logic.Consumer;
import by.itstep.goutor.lesson45.multithread.model.logic.Producer;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Market market = new Market();
        Producer producer = new Producer(market, System.out);
        Consumer consumer = new Consumer(market, System.out, 1);


        TimeUnit.SECONDS.sleep(10);
        producer.stop();
        consumer.stop();

    }
}
