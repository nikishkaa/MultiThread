package by.itstep.goutor.lesson45.multithread.model.data;

public class Market {
    int product;
    private volatile boolean flag;

    public Market() {
    }

    public Market(int product) {
        this.product = product;
    }

    public synchronized int get() {
        return product;
    }

    public synchronized void put(int product) {
        this.product = product;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
