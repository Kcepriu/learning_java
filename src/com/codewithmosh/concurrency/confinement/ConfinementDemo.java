package com.codewithmosh.concurrency.confinement;


import java.util.ArrayList;
import java.util.List;

public class ConfinementDemo {
    static void main() {
        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();

        for (int i=0;  i<10; i++) {
            var task = new DownloadFileTask();
            tasks.add(task);

            Thread thread = new Thread(task);
            thread.start();
            threads.add(thread);

        }

        for (var thread: threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        var totalBytes = tasks.stream().
                map(task -> task.getStatus().getTotalBytes()).
                reduce(0, Integer::sum);


        System.out.println("Finished program:" + totalBytes);
    }
}
