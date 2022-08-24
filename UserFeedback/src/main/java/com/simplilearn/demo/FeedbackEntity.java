package com.simplilearn.demo;

public class FeedbackEntity {

	private int Id;
	private String Name;
	private String Email;
	private String Feedback;
	
	public FeedbackEntity()
	{ }

	public FeedbackEntity(String name, String email, String feedback) {
		super();
		Name = name;
		Email = email;
		Feedback = feedback;
	}
	 
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getFeedback() {
		return Feedback;
	}

	public void setFeedback(String feedback) {
		Feedback = feedback;
	}
	
	@Override
	public String toString() {
		return "Feedback [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", Feedback=" + Feedback + "]";
	}
	
}