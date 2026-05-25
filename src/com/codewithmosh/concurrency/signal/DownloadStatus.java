package com.codewithmosh.concurrency.signal;

public class DownloadStatus {
    //!!!!!!!!!!!!!!11
    //volatile - заставляє не кешувати значення змінної між потоками. При зміні в одному одразу змінюється в інших потоках
    private volatile boolean  isDone;



    private int totalBytes;
    private final Object  totalBytesLock = new Object();

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        synchronized (totalBytesLock) {
            totalBytes++;
        }
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}
