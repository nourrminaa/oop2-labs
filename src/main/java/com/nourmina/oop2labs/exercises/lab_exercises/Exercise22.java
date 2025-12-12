package com.nourmina.oop2labs.exercises.lab_exercises;

public class Exercise22 implements Runnable{
    String threadName;

    public Exercise22 (String threadName){
        this.threadName = threadName;
    }

    public void run(){
        System.out.println("Thread" + threadName + "running..");
        // simulate some work with a loop: the thread will stop the count of one thread then switch to another thread, then recontinue later from the same point he has stopped
        for (int i = 0; i < 100; i++){
            System.out.println("Thread" + threadName + " Count: " + i);
        }
    }

    public static void main (String[] args){
        Exercise22 thread1 = new Exercise22("th1");
        Exercise22 thread2 = new Exercise22("th2");
        Exercise22 thread3 = new Exercise22("th3");

        // HERE IS THE ONLY DIFFERENCE:
        Thread th1 = new Thread(thread1);
        Thread th2 = new Thread(thread2);
        Thread th3 = new Thread(thread3);

        // notice that the order of output may vary each time you run the program due to the nature of multithreading(the operating system's thread scheduling)
        th1.start();
        th2.start();
        th3.start();
    }
}
