package com.example.task.respository;

import com.example.task.entity.TaskEntity;
import com.example.task.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRespository extends CrudRepository<TaskEntity, Integer> {
}
