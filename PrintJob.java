import java.util.*;

// คลาสงานพิมพ์
class PrintJob {
    String jobId;
    String user;
    int pages;
    long submitTime;

    public PrintJob(String jobId, String user, int pages) {
        this.jobId = jobId;
        this.user = user;
        this.pages = pages;
        this.submitTime = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return jobId + "[" + pages + "p]";
    }
}

public class PrinterSystem {
    public static void main(String[] args) {
        // === Algorithm A: FIFO ===
        Queue<PrintJob> fifo = new ArrayDeque<>();
        fifo.add(new PrintJob("J1", "A", 20));
        fifo.add(new PrintJob("J2", "B", 2));
        fifo.add(new PrintJob("J3", "C", 15));
        fifo.add(new PrintJob("J4", "D", 1));
        fifo.add(new PrintJob("J5", "E", 10));

        System.out.println("=== FIFO Order ===");
        while (!fifo.isEmpty()) {
            System.out.println("Printing: " + fifo.remove());
        }

        // === Algori
