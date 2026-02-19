package com.taskManager.TaskManager.repository;


import com.taskManager.TaskManager.entity.Task;
import com.taskManager.TaskManager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUser(User user);
}
