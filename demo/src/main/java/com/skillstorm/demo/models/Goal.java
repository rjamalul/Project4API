package com.skillstorm.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "goal")
public class Goal {
	
	public Goal() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Goal")
	private Integer id;
	
	@Column(name = "goal_Name")
	private String goalName;
	
	@Column(name = "description_Text")
	@NotNull
	private String descriptionText;
	
	@Column(name = "target_Amount")
	@NotNull
	private double targetAmount;
	
	@Column(name = "current_Amount")
	@NotNull
	private double currentAmount;
	
	@Column(name = "target_Date")
	@NotNull
	private String targetDate; 
	
	@Column(name = "picture")
	@NotNull
	private String picture;
	
	@Column(name = "user_Id")
	@NotNull
	private int userId;

	public Goal(Integer id, String goalName, @NotNull String descriptionText, @NotNull double targetAmount,
			@NotNull double currentAmount, @NotNull String targetDate, @NotNull String picture, @NotNull int userId) {
		super();
		this.id = id;
		this.goalName = goalName;
		this.descriptionText = descriptionText;
		this.targetAmount = targetAmount;
		this.currentAmount = currentAmount;
		this.targetDate = targetDate;
		this.picture = picture;
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGoalName() {
		return goalName;
	}

	public void setGoalName(String goalName) {
		this.goalName = goalName;
	}

	public String getDescriptionText() {
		return descriptionText;
	}

	public void setDescriptionText(String descriptionText) {
		this.descriptionText = descriptionText;
	}

	public double getTargetAmount() {
		return targetAmount;
	}

	public void setTargetAmount(double targetAmount) {
		this.targetAmount = targetAmount;
	}

	public double getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(double currentAmount) {
		this.currentAmount = currentAmount;
	}

	public String getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(String targetDate) {
		this.targetDate = targetDate;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Goal [id=" + id + ", goalName=" + goalName + ", descriptionText=" + descriptionText + ", targetAmount=" + targetAmount
				+ ", currentAmount=" + currentAmount + ", targetDate=" + targetDate + ", picture=" + picture
				+ ", userId=" + userId + "]";
	}
	
	
	
}
