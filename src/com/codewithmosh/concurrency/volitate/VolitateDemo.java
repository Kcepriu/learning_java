package com.codewithmosh.concurrency.volitate;

public class VolitateDemo {
    static void main() {
        var status = new DownloadStatus();

        Thread thread1 = new Thread(new DownloadFileTask(status));

        Thread thread2 = new Thread(()-> {
            while (!status.isDone()) {};
            System.out.println("Finished program:" + status.getTotalBytes());
        });

        thread1.start();
        thread2.start();;

    }
}
