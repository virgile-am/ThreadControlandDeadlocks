# Thread Control and Deadlocks Lab

## Overview
This project demonstrates key multithreading concepts such as thread interruption, the Fork/Join framework for parallel processing, deadlock scenarios, and deadlock prevention techniques. The code is organized into individual exercises, which are invoked from a single `Main` class.


## Running the Code
1. **Thread Interruption:**
    - This demonstrates the use of the `interrupt()` method to stop a running thread gracefully. The thread checks its interrupted state and exits early when interrupted.

2. **Fork/Join Framework:**
    - This demonstrates parallel processing using the Fork/Join framework to calculate the sum of an integer array. The task splits the array recursively to process chunks in parallel.

3. **Deadlock Scenario:**
    - This demonstrates a simple deadlock scenario where two threads hold locks on different objects and wait for each other, resulting in a deadlock.

4. **Deadlock Prevention:**
    - This demonstrates how to prevent deadlocks by using ordered locking. By acquiring locks in a consistent order, the possibility of deadlock is eliminated.

## Usage
1. Clone the repository or download the source code.
2. Open the project in your preferred Java IDE (IntelliJ IDEA is recommended).
3. Build the project using Maven or Gradle.
4. Run the `Main` class to execute all exercises sequentially.

## Author
Ndayambaje Virgile
