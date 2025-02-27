package com.example.demo.adapter;

import java.util.UUID;

public class TaskData {
    private final UUID id;

    public TaskData(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "TaskData{id=" + id + "}";
    }
}
