package com.hp.haze.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hp.haze.model.Task;
import com.hp.haze.repository.TaskRepository;

//@Service
public class TaskServiceImpl implements TaskService {
	/**@Autowired
	private TaskRepository taskRepository; 
	
	@Transactional
	public void add(Task task) {
		taskRepository.add(task);

	}

	@Transactional
	public void edit(Task task) {
		taskRepository.edit(task);

	}

	@Transactional
	public void delete(int id) {
		taskRepository.delete(id);

	}

	@Transactional
	public Task getTask(int id) {
		return taskRepository.getTask(id);
	}

	@Transactional
	public List getAllTask() {
		return taskRepository.getAllTask();
	}
*/
}
