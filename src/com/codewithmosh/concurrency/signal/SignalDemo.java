package com.codewithmosh.concurrency.signal;

public class SignalDemo {
    static void main() {
        var status = new DownloadStatus();

        Thread thread1 = new Thread(new DownloadFileTask(status));

        Thread thread2 = new Thread(()-> {
            while (!status.isDone()) {
                synchronized (status) {
                    try {
                        status.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            };
            System.out.println("Finished program:" + status.getTotalBytes());
        });

        thread1.start();
        thread2.start();

    }
}
