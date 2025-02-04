package org.curso;

public class ThreadMain {

    public static void main(String[] args) {
        int threadCount = 0;
        try {
            while (true) {
                Thread thread = new Thread(() -> {
                    try {
                        Thread.sleep(10000L);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });
                thread.start();
                threadCount++;
                System.out.println("threadCount : " + threadCount);
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Maximum number of threads: " + threadCount);
        }
    }
}
