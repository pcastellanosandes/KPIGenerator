package co.edu.uniandes.PreprocessKPIGenerator.Models;

import java.util.LinkedList;
import java.util.List;

public class Phase {

	private String name;
	private List<Task> tasks;
	
	public Phase(String name) {
		this.name = name;
		tasks = new LinkedList<Task>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Task> getTasks() {
		return tasks;
	}
	public void addTask(Task task) {
		this.tasks.add(task);
	}
	
}
