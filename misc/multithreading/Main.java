package misc.multithreading;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Worker worker = new Worker(i);
            worker.start();
        }

        for (int i = 5; i < 10; i++) {
            Runner runner = new Runner(i);
            Thread thread = new Thread(runner);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
