package org.ThreadControlandDeadlocks;

import org.ThreadControlandDeadlocks.concurrencylab.DeadlockScenario;
import org.ThreadControlandDeadlocks.concurrencylab.DeadlockPrevention;
import org.ThreadControlandDeadlocks.concurrencylab.ForkJoinTaskDemo;
import org.ThreadControlandDeadlocks.concurrencylab.ThreadInterruptionDemo;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Running Thread Interruption example
        System.out.println("Running Thread Interruption Example...");
        ThreadInterruptionDemo.main(args);

        // Running Fork/Join example
        System.out.println("\nRunning Fork/Join Framework Example...");
        ForkJoinTaskDemo.main(args);

        // Running Deadlock Scenario example
        System.out.println("\nRunning Deadlock Scenario Example...");
        DeadlockScenario deadlockScenario = new DeadlockScenario();
        Thread t1 = new Thread(deadlockScenario::methodA);
        Thread t2 = new Thread(deadlockScenario::methodB);
        t1.start();
        t2.start();
        t1.join(); // Ensure both threads finish before proceeding
        t2.join();

        // Running Deadlock Prevention example
        System.out.println("\nRunning Deadlock Prevention Example...");
        DeadlockPrevention deadlockPrevention = new DeadlockPrevention();
        Thread t3 = new Thread(deadlockPrevention::methodA);
        Thread t4 = new Thread(deadlockPrevention::methodB);
        t3.start();
        t4.start();
        t3.join(); // Ensure both threads finish before the program ends
        t4.join();
    }
}
