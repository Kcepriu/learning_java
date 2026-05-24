package com.codewithmosh.concurrency.confinement;


public class DownloadFileTask implements Runnable{
    private final DownloadStatus status;

    public DownloadFileTask() {
        this.status = new DownloadStatus();
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

        System.out.println("Finish download: " +
                Thread.currentThread().getName());

    }

    public DownloadStatus getStatus() {
        return status;
    }
}
