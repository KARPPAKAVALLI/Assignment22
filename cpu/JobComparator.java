package com.assignment22.cpu;

import java.util.Comparator;

class JobComparator {
    public static Comparator<Job> PriorityComparator = new Comparator<Job>() {
        public int compare(Job j1, Job j2) {
            return Integer.compare(j2.priority, j1.priority); // Higher priority first
        }
    };
}

