package com.codewithmosh.concurrency.signal;

public class DownloadFileTask implements Runnable{
    private final DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Start download: " +
                Thread.currentThread().getName());

        for (int i = 0; i < 1_000_000; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }

        status.done();

        synchronized (status) {
            status.notify();
        }


        System.out.println("Finish download: " +
                Thread.currentThread().getName());

    }
}

