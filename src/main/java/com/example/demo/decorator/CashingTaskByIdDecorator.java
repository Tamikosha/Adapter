package com.example.demo.decorator;

import com.example.demo.adapter.FindTaskByIdSpi;
import com.example.demo.adapter.TaskData;

import java.util.Optional;
import java.util.UUID;

abstract class CashingTaskByIdDecorator implements FindTaskByIdSpi {
    private final FindTaskByIdSpi delegate;
    public CashingTaskByIdDecorator(FindTaskByIdSpi delegate) {
        this.delegate = delegate;
    }

    abstract Optional<TaskData> retriveFromCache(UUID id);

    abstract void storeInCache(TaskData taskData);

    @Override
    public Optional<TaskData> findTaskById(UUID id) {
        return this.retriveFromCache(id)
                .or(() -> this.delegate.findTaskById(id)
                        .map(taskData -> {
                            this.storeInCache(taskData);
                            return taskData;
                        }));
    }
}
