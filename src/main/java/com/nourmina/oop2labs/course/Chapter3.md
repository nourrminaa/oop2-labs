# Chapter 3 – Threads (Java)

## 1. What is Multithreading?

- **Multithreading** is a programming concept that allows multiple threads (smaller units of a process) to run concurrently within a single program.
- Each thread can execute independently, enabling parallelism and better resource utilization.
- Every program has **at least one main thread**, which starts when the program begins.
- Each client usually works on a **separate thread** (an instance of a class that extends `Thread` or implements `Runnable`).
- ⚠️ A **thread is NOT a process** and is **not managed by the program**, but by the **Operating System’s thread scheduler**.
- Threads do **not truly run at the same time** on a single-core CPU. The OS switches between them very quickly, creating the *illusion* of simultaneous execution.

### Multiprogramming vs Multithreading

- **Multiprogramming**
    - Multiple programs (processes) are loaded into memory.
    - Each program has its **own memory space**.
    - The OS switches between programs.

- **Multithreading**
    - Multiple threads exist **within the same program**.
    - Threads **share the same memory space** (same RAM allocation).

### FYI
- True parallelism happens when threads run on **multiple CPU cores**.
- On a single-core CPU, execution is done using **time slicing (context switching)**.
- The current running thread can be accessed using:
  ```java
  Thread.currentThread();
  ```

---

## 2. Why Use Multithreading?

- **Improved performance** on multi-core processors.
- **Better responsiveness**, especially in UI applications.
- **Efficient resource sharing** since threads share the same memory.
- Useful for:
    - Reading large files
    - Playing videos
    - Handling multiple client requests (e.g., web servers)

---

## 3. Creating Threads in Java

There are **two main ways** to create threads in Java:

### 1. Extending the `Thread` Class
- Create a class that extends `Thread`.
- Override the `run()` method.

### 2. Implementing the `Runnable` Interface
- Create a class that implements `Runnable`.
- Implement the `run()` method.

### When to Use Which?
- Use **Thread** when:
    - You don’t need to extend another class.
- Use **Runnable** when:
    - You need to extend another class (Java allows only single inheritance).

> 💡 In **JavaFX**, since the main class extends `Application`, we usually use `Runnable`.

---

## 4. Thread Methods

> These methods come from the `Thread` class. Each thread has its own properties (name, priority, state, etc.).

- `start()` → Starts the thread and calls `run()`.
- `isAlive()` → Checks if the thread is still running.
- `setPriority(int)` → Sets thread priority (1–10). *(May be ignored by the OS)*
- `sleep(long ms)` → Pauses the thread for a specified time.
- `join()` → Makes the current thread wait until another thread finishes.
- `yield()` → Gives other threads a chance to execute.

---

## 5. Concurrency & Synchronization (Extra – Not for Final Exam)

- **Concurrency** is the ability to execute multiple tasks at the same time.
- To achieve concurrency safely, we need **synchronization**.
- **Synchronization** controls access to shared resources to prevent data inconsistency.
- Only **one thread** can access a synchronized resource at a time.

### Synchronized Method Example

```java
public synchronized void synchronizedMethod() {
    // code that needs synchronization
}
```

### Synchronized Block Example

```java
public void methodWithSynchronizedBlock() {
    synchronized (this) {
        // code that needs synchronization
    }
}
```