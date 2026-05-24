package com.codewithmosh.concurrency.confinement;

public class DownloadStatus {
    private int totalBytes;


    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        totalBytes++;
    }
}
