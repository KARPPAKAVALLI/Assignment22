package com.assignment22.cpu;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Scheduler {
    private Queue<Job> jobQueue;
    private int currentTime;

    public Scheduler(Comparator<Job> comparator) {
        this.jobQueue = new PriorityQueue<>(comparator);
        this.currentTime = 0;
    }

    // Add job to the queue
    public void addJob(Job job) {
        jobQueue.offer(job);
    }

    // Process jobs in the queue
    public void processJobs() {
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int jobCount = 0;

        while (!jobQueue.isEmpty()) {
            Job job = jobQueue.poll();
            int waitingTime = Math.max(0, currentTime - job.arrivalTime);
            int turnaroundTime = waitingTime + job.processingTime;

            totalWaitingTime += waitingTime;
            totalTurnaroundTime += turnaroundTime;
            jobCount++;

            System.out.println("Processing " + job + ": Waiting Time = " + waitingTime + ", Turnaround Time = " + turnaroundTime);

            currentTime += job.processingTime;
        }

        if (jobCount > 0) {
            System.out.println("Average Waiting Time: " + (double) totalWaitingTime / jobCount);
            System.out.println("Average Turnaround Time: " + (double) totalTurnaroundTime / jobCount);
        } else {
            System.out.println("No jobs to process.");
        }
    }
}

