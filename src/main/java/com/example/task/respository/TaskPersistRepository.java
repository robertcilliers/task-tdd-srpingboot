package com.example.task.respository;

import com.example.task.entity.TaskEntity;
import com.example.task.model.Task;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TaskPersistRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insertTask(TaskEntity task) {
        entityManager.createNativeQuery("INSERT INTO TASK(description, title) VALUES (?,?)")
                .setParameter(1, task.getDescription())
                .setParameter(2,task.getTitle())
                .executeUpdate();
    }
}
