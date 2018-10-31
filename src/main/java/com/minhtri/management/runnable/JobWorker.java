
package com.minhtri.management.runnable;


import com.minhtri.management.model.Task;

public class JobWorker implements Runnable {

    private Task task;

    public JobWorker(Task task) {
        this.task = task;
    }

    public void run() {
        // manage task
        System.out.println(Thread.currentThread().getName() + ": " + task.getPayload());
    }

}
