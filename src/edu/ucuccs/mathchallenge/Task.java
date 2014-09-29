package edu.ucuccs.mathchallenge;

public class Task {

	private int id;
	private String desc;
	
	public Task(String desc){
		this.desc = desc;
	}
	public Task(){
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	
}
