
package com.minhtri.management.queue;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.minhtri.management.model.Task;
import com.minhtri.management.runnable.JobWorker;

public class JobQueueClient {

    private final ScheduledExecutorService service = Executors.newScheduledThreadPool(20);

    public void enqueue(Task task) {
        // create new runnable and schedule it with service.
        long delay = ChronoUnit.SECONDS.between(ZonedDateTime.now(), task.getScheduledTime());
        JobWorker jobWorker = new JobWorker(task);
        service.schedule(jobWorker, delay, TimeUnit.SECONDS);
    }

    public void shutdown() {
        service.shutdown();
    }

}
