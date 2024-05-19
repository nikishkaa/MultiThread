package by.itstep.goutor.lesson45.multithread.model.logic;

import by.itstep.goutor.lesson45.multithread.model.data.Market;

import java.io.PrintStream;

public class Consumer implements Runnable {
    private Market market;
    private PrintStream stream;
    private int id;

    private Thread thread;
    private boolean running;

    public Consumer(Market market, PrintStream stream, int id) {
        this.market = market;
        this.stream = stream;
        this.id = id;
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (running) {
            try {
                int product = market.get();
                stream.printf("Consumer %d use product %d.\n", id, product);
            } catch (InterruptedException exception) {
                stream.println(exception);


            }
        }
    }

    public void stop() {
        running = false;
    }
}
