package com.nourmina.oop2labs.exercises.lab_exercises;

public class Exercise21 extends Thread{
    String threadName;

    public Exercise21 (String threadName){
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
        Exercise21 thread1 = new Exercise21("th1");
        Exercise21 thread2 = new Exercise21("th2");
        Exercise21 thread3 = new Exercise21("th3");

        // notice that the order of output may vary each time you run the program due to the nature of multithreading(the operating system's thread scheduling)
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
