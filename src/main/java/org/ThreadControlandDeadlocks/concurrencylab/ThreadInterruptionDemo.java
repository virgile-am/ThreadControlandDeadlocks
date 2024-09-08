package org.ThreadControlandDeadlocks.concurrencylab;

public class ThreadInterruptionDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread task = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    if (Thread.interrupted()) {
                        System.out.println("Thread was interrupted! Exiting...");
                        return;
                    }
                    System.out.println("Processing " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted during sleep.");
            }
        });

        task.start();
        Thread.sleep(3000); // Let the task run for 3 seconds
        task.interrupt();    // Interrupt the thread
    }
}