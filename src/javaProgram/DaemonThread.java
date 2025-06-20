package javaProgram;

public class DaemonThread extends Thread {
    public DaemonThread(String name) {
        super(name);
    }

    //@override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println(getName() + " is Daemon thread");
        } else {
            System.out.println(getName() + " is User thread");
        }
    }

    public static void main(String[] args) {
        DaemonThread t1 = new DaemonThread("thread1");
        DaemonThread t2 = new DaemonThread("thread2");
        DaemonThread t3 = new DaemonThread("thread3");

        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.setDaemon(true);
        t3.start();
    }
}