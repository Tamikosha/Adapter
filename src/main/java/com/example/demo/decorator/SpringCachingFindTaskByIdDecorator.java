package com.example.demo.decorator;

import com.example.demo.adapter.FindTaskByIdSpi;
import com.example.demo.adapter.TaskData;
import org.springframework.cache.Cache;

import java.util.Optional;
import java.util.UUID;

public class SpringCachingFindTaskByIdDecorator extends CashingTaskByIdDecorator {

    private final Cache cache;
    public SpringCachingFindTaskByIdDecorator(FindTaskByIdSpi delegate, Cache cache) {
        super(delegate);
        this.cache = cache;
    }

    @Override
    Optional<TaskData> retriveFromCache(UUID id) {
        return Optional.ofNullable(this.cache.get(id, TaskData.class));
    }

    @Override
    void storeInCache(TaskData task) {
        this.cache.put(task.getId(), task);
    }
}
