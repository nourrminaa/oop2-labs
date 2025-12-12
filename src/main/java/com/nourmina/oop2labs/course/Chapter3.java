package com.nourmina.oop2labs.course;

public class Chapter3 {
    // THREADS
    // 1. What is multithreading?
    // - Multithreading is a programming concept that allows multiple threads (smaller units of a process) to run concurrently within a single program.
    // - Each thread can execute independently, enabling parallelism and improving the efficiency of resource utilization.
    // - Each program has at least one main thread (the one that starts when the program starts).
    // - Each client works on a seperate thread (instance of a class (the process / program) that extends Thread or implements Runnable)
    // - !! A thread is not a process, and not managed by the program itself, but by the Operating System's thread scheduler !!
    // - In reality, the threads are NOT running at the same exact time, but the OS switches between them very quickly (in sequence), giving the illusion of simultaneous execution.
    // - Multiprogramming vs Multithreading:
    //     - Multiprogramming: In multiprogramming, multiple programs (processes) are loaded into memory (RAMs) and executed by the CPU.
    //       Each program has its own memory space, and the OS manages the switching between programs.
    //     - Multithreading: In multithreading, multiple threads within the same program share the same memory space (Share the same RAM allocated space).
    // - FYI: true parallelism occurs when multiple threads run on multiple CPU cores simultaneously (more than 1 CPU core).
    //        otherwise, it is just time slicing (context switching)(sequential execution) on a single core CPU to improve responsiveness.

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
}
