package org.ThreadControlandDeadlocks.concurrencylab;

public class DeadlockPrevention {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void methodA() {
        synchronized (lock1) {
            System.out.println("Method A acquired lock1");
            synchronized (lock2) {
                System.out.println("Method A acquired lock2");
            }
        }
    }

    public void methodB() {
        synchronized (lock1) {  // Changed order to prevent deadlock
            System.out.println("Method B acquired lock1");
            synchronized (lock2) {
                System.out.println("Method B acquired lock2");
            }
        }
    }

    public static void main(String[] args) {
        DeadlockPrevention deadlockPrevention = new DeadlockPrevention();

        Thread t1 = new Thread(deadlockPrevention::methodA);
        Thread t2 = new Thread(deadlockPrevention::methodB);

        t1.start();
        t2.start();
    }
}
