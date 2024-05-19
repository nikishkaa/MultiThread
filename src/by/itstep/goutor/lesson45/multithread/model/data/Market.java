package by.itstep.goutor.lesson45.multithread.model.data;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Market {
    private BlockingQueue<Integer> queue;

    public Market() {
        queue = new ArrayBlockingQueue<>(1);
    }

    public  int get() throws InterruptedException {
        return queue.take();
    }


    public  void put(int product) throws InterruptedException {
        queue.put(product);
    }

}
