package by.itstep.goutor.lesson45.multithread.model.logic;

import by.itstep.goutor.lesson45.multithread.model.data.Market;

import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {
    private boolean running;
    private Market market;
    private Thread thread;
    private PrintStream stream;

    public Producer(Market market, PrintStream stream) {
        this.market = market;
        this.stream = stream;
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        int product = 1;

        while (running) {
            market.put(product++);
        }
    }

    public void stop() {
        running = false;
    }
}
