package com.assignment22.cpu;

public class Main {
    public static void main(String[] args) {
        // Creating jobs
        Job job1 = new Job(1, 5, 0, 2);
        Job job2 = new Job(2, 3, 1, 1);
        Job job3 = new Job(3, 8, 2, 3);
        Job job4 = new Job(4, 6, 3, 2);

        // Priority Scheduler
        Scheduler priorityScheduler = new Scheduler(JobComparator.PriorityComparator);
        priorityScheduler.addJob(job1);
        priorityScheduler.addJob(job2);
        priorityScheduler.addJob(job3);
        priorityScheduler.addJob(job4);
        System.out.println("\nPriority Scheduling:");
        priorityScheduler.processJobs();
    }
}

