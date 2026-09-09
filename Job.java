class PrintJob {
    String id;
    String user;
    int pages;
    long submitTime;

    public PrintJob(String id, String user, int pages) {
        this.id = id;
        this.user = user;
        this.pages = pages;
        this.submitTime = System.currentTimeMillis();
    }
}

// FIFO
import java.util.Queue;
import java.util.ArrayDeque;

Queue<PrintJob> fifoQueue = new ArrayDeque<>();
fifoQueue.add(new PrintJob("J1", "A", 20));
fifoQueue.add(new PrintJob("J2", "B", 2));

// SJF
import java.util.PriorityQueue;
import java.util.Comparator;

PriorityQueue<PrintJob> sjfQueue = new PriorityQueue<>(
    Comparator.comparingInt(job -> job.pages)
);
sjfQueue.add(new PrintJob("J1", "A", 20));
sjfQueue.add(new PrintJob("J2", "B", 2));
