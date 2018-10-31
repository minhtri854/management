
package com.minhtri.management.model;

import java.time.ZonedDateTime;

public class Task {

    private int id;
    private String payload;
    private ZonedDateTime scheduledTime;

    public Task() {
        super();
    }

    public Task(int id, String payload, ZonedDateTime scheduledTime) {
        super();
        this.id = id;
        this.payload = payload;
        this.scheduledTime = scheduledTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public ZonedDateTime getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(ZonedDateTime scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

}
