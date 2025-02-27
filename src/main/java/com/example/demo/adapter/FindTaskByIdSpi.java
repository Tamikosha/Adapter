package com.example.demo.adapter;

import java.util.Optional;
import java.util.UUID;

@FunctionalInterface
interface FindTaskByIdSpi {

    Optional<TaskData> findTaskById(UUID id);

}