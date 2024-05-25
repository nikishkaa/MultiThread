package by.itstep.goutor.lesson45.multithread.model.logic;

import by.itstep.goutor.lesson45.multithread.model.data.Market;

import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {
    private boolean running;
    private Market market;
    private Thread thread;
    private PrintStream stream;
    private int id;


    public Producer(Market market, PrintStream stream, int id) {
        this.market = market;
        this.stream = stream;
        this.id = id;
        running = true;
        thread = new Thread(this);
        thread.start();
    }


    @Override
    public void run() {
        int product = 1;

        while (running) {
            try {
                market.put(product);
                stream.printf("Producer id %d put product %d.\n ", id, product++);
                TimeUnit.MICROSECONDS.sleep(10);
            } catch (InterruptedException exception) {
                stream.println(exception);
            }
        }
    }

    public void stop() {
        running = false;
    }
}
