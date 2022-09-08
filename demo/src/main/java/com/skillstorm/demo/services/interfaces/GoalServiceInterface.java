package com.skillstorm.demo.services.interfaces;

import java.util.List;

import com.skillstorm.demo.models.Goal;

public interface GoalServiceInterface extends GenericService<Goal, Integer> {
	void saveGoal(Goal goal);
	boolean delete(int id);
}
