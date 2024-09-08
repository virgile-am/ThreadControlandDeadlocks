package org.ThreadControlandDeadlocks.concurrencylab;

public class DeadlockScenario {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void methodA() {
        synchronized (lock1) {
            System.out.println("Method A acquired lock1");
            try { Thread.sleep(100); } catch (InterruptedException e) { }
            synchronized (lock2) {
                System.out.println("Method A acquired lock2");
            }
        }
    }

    public void methodB() {
        synchronized (lock2) {
            System.out.println("Method B acquired lock2");
            try { Thread.sleep(100); } catch (InterruptedException e) { }
            synchronized (lock1) {
                System.out.println("Method B acquired lock1");
            }
        }
    }

    public static void main(String[] args) {
        DeadlockScenario deadlock = new DeadlockScenario();

        Thread t1 = new Thread(deadlock::methodA);
        Thread t2 = new Thread(deadlock::methodB);

        t1.start();
        t2.start();
    }
}
