package co.edu.uniandes.PreprocessKPIGenerator.Models;

public class Task {

	private int id;
	private String name;
	private String useCase;
	private double sequenceNumber;
	private String startDate;
	private String dueDate;
	private boolean isPrivate;
	private int progress;
	private String status;
	private String statusText;
	private String assignedTo;
	private String createdDate;
	private String completedDate;
	private int timeLoggedMin;
	private int billableTime;
	private boolean completedOnTime;
	private int timeEstimated;
	private boolean isReprocessedTask; 
	private int idParentTask;
	
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusText() {
		return statusText;
	}
	public void setStatusText(String statusText) {
		this.statusText = statusText;
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
	public boolean isReprocessedTask() {
		return isReprocessedTask;
	}
	public void setReprocessedTask(boolean isReprocessedTask) {
		this.isReprocessedTask = isReprocessedTask;
	}
	public int getIdParentTask() {
		return idParentTask;
	}
	public void setIdParentTask(int idParentTask) {
		this.idParentTask = idParentTask;
	}
	
	
}
