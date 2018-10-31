
package com.minhtri.management;

import java.time.ZonedDateTime;

import com.minhtri.management.model.Task;
import com.minhtri.management.queue.JobQueueClient;

public class Management {

    public static void main(String[] args) throws InterruptedException {
        Task task1 = new Task();
        task1.setId(1);
        task1.setPayload("This is task payload 1");
        ZonedDateTime plusSeconds = ZonedDateTime.now().plusSeconds(5);
        task1.setScheduledTime(plusSeconds);

        JobQueueClient jobClient = new JobQueueClient();
        jobClient.enqueue(task1);

        Task task2 = new Task();
        task2.setId(2);
        task2.setPayload("This is task payload 2");
        task2.setScheduledTime(ZonedDateTime.now());

        jobClient.enqueue(task2);

        jobClient.shutdown();
    }
}