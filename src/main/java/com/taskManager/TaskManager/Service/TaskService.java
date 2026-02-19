package com.taskManager.TaskManager.Service;

import com.taskManager.TaskManager.entity.Task;
import com.taskManager.TaskManager.entity.User;
import com.taskManager.TaskManager.repository.TaskRepository;
import com.taskManager.TaskManager.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public Task createTask(Task task, User user) {
        task.setUser(user);
        task.setStatus("PENDING");
        return taskRepository.save(task);
    }

    public List<Task> getUserTasks(User user) {
        return taskRepository.findByUser(user);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
