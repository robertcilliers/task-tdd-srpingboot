package com.example.task.service;

import com.example.task.entity.TaskEntity;
import com.example.task.model.Task;
import com.example.task.respository.TaskPersistRepository;
import com.example.task.respository.TaskRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService {

    private final TaskRespository taskRespository;
    private final TaskPersistRepository taskPersistRepository;

    @Autowired
    public TaskService(TaskRespository taskRespository, TaskPersistRepository taskPersistRepository) {
        this.taskRespository = taskRespository;
        this.taskPersistRepository = taskPersistRepository;
    }

    public Optional<TaskEntity> getTaskById(Integer id) {
        return taskRespository.findById(id);
    }

    public void createTask(Task task) {
        taskRespository.save(new TaskEntity(task));
    }
}
