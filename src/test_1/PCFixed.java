package test_1;

class Q {
    private int n;
    boolean flag = false;

    synchronized int get() {
        if (flag) {
            System.out.println("Got: " + n);
        }
        flag = false;
        try {
            notify();
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return n;

    }

    synchronized void put(int n) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.n = n;
        System.out.println("put: " + n);
        flag = true;
        notify();
    }
}

class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        new Thread(this, "Producer").start();
        this.q = q;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        new Thread(this, "Consumer").start();
        this.q = q;
    }

    @Override
    public void run() {
        while (true)
            q.get();
    }
}

class PCFixed {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}