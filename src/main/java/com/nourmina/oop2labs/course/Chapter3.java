package com.nourmina.oop2labs.course;

public class Chapter3 {
    // THREADS
    // 1. What is multithreading?
    // - Multithreading is a programming concept that allows multiple threads (smaller units of a process) to run concurrently within a single program.
    // - Each thread can execute independently, enabling parallelism and improving the efficiency of resource utilization.
    // - Each program has at least one main thread(the one that starts when the program starts).
    // - Each client works on a seperate thread (instance of a class (the process / program) that extends Thread or implements Runnable)
    // - !! A thread is not a process, and not managed by the program itself, but by the Operating System's thread scheduler !!
    // - In reality, the threads are NOT running at the same exact time, but the OS switches between them very quickly (in sequence), giving the illusion of simultaneous execution.
    // - Multiprogramming vs Multithreading:
    //     - Multiprogramming: In multiprogramming, multiple programs (processes) are loaded into memory (RAMs) and executed by the CPU.
    //       Each program has its own memory space, and the OS manages the switching between programs.
    //     - Multithreading: In multithreading, multiple threads within the same program share the same memory space (Share the same RAM allocated space).
    // - FYI 1: true parallelism occurs when multiple threads run on multiple CPU cores simultaneously (more than 1 CPU core).
    //        otherwise, it is just time slicing (context switching)(sequential execution) on a single core CPU to improve responsiveness.
    // - FYI 2: the main thread can be called using Thread.currentThread()

    // 2. Why use multithreading?
    // - Improved performance: Multithreading can enhance the performance of applications by allowing multiple tasks to be executed simultaneously, especially on multi-core processors.
    // - Responsiveness: Multithreading can improve the responsiveness of applications by allowing background tasks to run without blocking the main thread, which is responsible for user interactions.
    // - Resource sharing: Threads within the same process (program) share the SAME memory space of the process, which allows for efficient communication and data sharing between threads.
    // - Reading large files, videos, or handling multiple client requests in web servers can be done more efficiently using multithreading: we can split the file into smaller parts and read them simultaneously (kinda).

    // 3. How to create threads in Java?
    // - There are 2 main ways to create threads in Java:
    // 1. Extending the Thread class:
    //     - Create a new class that extends the Thread class.
    //     - Override the run() method to define the code that will be executed in the thread.
    // 2. Implementing the Runnable interface:
    //     - Create a new class that implements the Runnable interface.
    //     - Implement the run() method to define the code that will be executed in the thread.
    // - When to use which method?
    //     - Use the Thread class when you want to create a simple thread and do not need to extend any other class (since Java supports single inheritance).
    //     - Use the Runnable interface when you want to create a thread and also need to extend another class.

    // When using JavaFX, we usually use the first method (extending Thread) for simplicity, but if we put it in the Main Class, where it extends Application, we are obliged to use Runnable.

    // 3. Threads Methods:
    // FYI: these methods are inherited from the Thread class & each thread is an instance of the Thread class that EACH HAS DIFFERENT PROPERTIES (like name, priority, state, etc.)
    // - .start(): starts the execution of the thread by calling the run() method.
    // - .isAlive(): checks if the thread is still running.
    // - .setPriority(int priority): sets the priority of the thread (1 to 10) (0 is the lowest, 10 is the highest) (starts with it but when the time comes to scheduling, the OS may ignore it)
    // - .sleep(long milliseconds): pauses the execution of the thread for the specified time.
    // - .join(): makes the current thread wait until the thread on which join() is called is finished.
    //    EXAMPLE: if thread1.join() is called in the main thread, the main thread will wait until thread1 is finished before continuing its execution.
    // - .yield(): makes the current thread give up the CPU and allow other threads to execute. (it gives a chance to other threads to run)

    // 4. Concurrency: (not for final exam, but good to know)
    // - Concurrency is the ability of a program to execute multiple tasks simultaneously.
    // - To be able to have concurrency we need Synchronization:
    // - Synchronization is the process of controlling access to shared resources (like variables, data structures, files, etc.) by multiple threads to prevent data inconsistency and ensure thread safety.
    // - It only allows one thread to access a shared resource at a time.
    // - Syntax:
    public synchronized void synchronizedMethod() {
        // code that needs to be synchronized
    }

    // - We can also use synchronized blocks:
    public void methodWithSynchronizedBlock() {
        synchronized(this) {
            // code that needs to be synchronized
        }
    }
}
