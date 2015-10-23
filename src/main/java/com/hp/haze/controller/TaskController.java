package com.hp.haze.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hp.haze.model.Task;
import com.hp.haze.repository.TaskRepository;
import com.hp.haze.service.TaskService;

@Controller
public class TaskController {
	
	private TaskRepository taskRepository;
	
	@RequestMapping("/task")
	public String setupForm(Map<String, Object>map){
		Task task = new Task();
		map.put("task", task);
		map.put("taskList", taskRepository.findAll());
		return "task";
	} 
}
