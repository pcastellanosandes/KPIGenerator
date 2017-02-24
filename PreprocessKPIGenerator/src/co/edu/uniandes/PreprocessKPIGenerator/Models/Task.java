package co.edu.uniandes.PreprocessKPIGenerator.Models;

public class Task {

	private int id;
	private String name;
	private String useCase;
	private double sequenceNumber;
	private String description;
	private String startDate;
	private String dueDate;
	private String priority;
	private boolean isPrivate;
	private int progress;
	private Status status;
	private String assignedTo;
	private String createdDate;
	private String completedDate;
	private int timeLoggedMin;
	private int billableTime;
	private boolean completedOnTime;
	private int timeEstimated;
	private String tags;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUseCase() {
		return useCase;
	}
	public void setUseCase(String useCase) {
		this.useCase = useCase;
	}
	public double getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(double sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public boolean isPrivate() {
		return isPrivate;
	}
	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
	public int getProgress() {
		return progress;
	}
	public void setProgress(int progress) {
		this.progress = progress;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getCompletedDate() {
		return completedDate;
	}
	public void setCompletedDate(String completedDate) {
		this.completedDate = completedDate;
	}
	public int getTimeLoggedMin() {
		return timeLoggedMin;
	}
	public void setTimeLoggedMin(int timeLoggedMin) {
		this.timeLoggedMin = timeLoggedMin;
	}
	public int getBillableTime() {
		return billableTime;
	}
	public void setBillableTime(int billableTime) {
		this.billableTime = billableTime;
	}
	public boolean isCompletedOnTime() {
		return completedOnTime;
	}
	public void setCompletedOnTime(boolean completedOnTime) {
		this.completedOnTime = completedOnTime;
	}
	public int getTimeEstimated() {
		return timeEstimated;
	}
	public void setTimeEstimated(int timeEstimated) {
		this.timeEstimated = timeEstimated;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	
	
}
