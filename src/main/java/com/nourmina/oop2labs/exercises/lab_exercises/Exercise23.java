package com.nourmina.oop2labs.exercises.lab_exercises;

// know how much a thread took to finish
public class Exercise23 extends Thread{

    String threadName;
    public Exercise23 (String threadName){
        this.threadName = threadName;
    }

    public void run(){
        // to make the thread take time
        for (int i = 0; i < 100; i++){
            System.out.println(threadName + " -Count: "+ i);
        }
    }

    public static void main(String[] args){
       Exercise23 th1 = new Exercise23("thread1");
       Exercise23 th2 = new Exercise23("thread2");
       Exercise23 th3 = new Exercise23("thread3");

       long before_time = System.currentTimeMillis();
       th1.start();
       th2.start();
       th3.start();

       while (true){
           if (!th1.isAlive() && !th2.isAlive() && !th3.isAlive()) {
               long after_time = System.currentTimeMillis();
               System.out.println("Total time taken: " + (after_time - before_time) + "milliseconds");
               break;
           }
       }
       // NOTE: To measure each thread's execution time separately, record the start and end times inside each thread's run() method, then use join() in main to wait for each thread to finish before calculating the total.
    }
}
