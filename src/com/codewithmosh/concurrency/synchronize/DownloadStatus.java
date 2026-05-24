package com.codewithmosh.concurrency.synchronize;

public class DownloadStatus {
    private int totalBytes;
    private int totalFiles;
    private final Object  totalBytesLock = new Object();

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        //synchronized (this) { // Bad direction
        synchronized (totalBytesLock) {
            totalBytes++;
        }
    }
    public synchronized  void IncrementalTotalFiles() {
        //отут ми фактично синхронізуємось по this
        totalFiles++;
    }

}
