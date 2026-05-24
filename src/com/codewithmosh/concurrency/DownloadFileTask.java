package com.codewithmosh.concurrency;

public class DownloadFileTask implements Runnable{
    private final DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Start download: " +
                Thread.currentThread().getName());

        for (int i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            System.out.println("Download byte " + i);
            status.incrementTotalBytes();
        }


//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println("Finish download: " +
                Thread.currentThread().getName());

    }
}
