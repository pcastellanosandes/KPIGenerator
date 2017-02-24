package co.edu.uniandes.PreprocessKPIGenerator.Models;

import java.util.LinkedList;
import java.util.List;

public class Project {

	private String name;
	private List<Phase> phases;
	
	
	public Project(String name) {
		this.name = name;
		phases = new LinkedList<Phase>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Phase> getPhases() {
		return phases;
	}
	public void addPhase(Phase phase) {
		this.phases.add(phase);
	}
}
