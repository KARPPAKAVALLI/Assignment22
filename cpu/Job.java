package com.assignment22.cpu;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;

class Job {
    int jobId;
    int processingTime;
    int arrivalTime;
    int priority; // Optional: used for priority scheduling

    public Job(int jobId, int processingTime, int arrivalTime, int priority) {
        this.jobId = jobId;
        this.processingTime = processingTime;
        this.arrivalTime = arrivalTime;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobId=" + jobId +
                ", processingTime=" + processingTime +
                ", arrivalTime=" + arrivalTime +
                ", priority=" + priority +
                '}';
    }
}

