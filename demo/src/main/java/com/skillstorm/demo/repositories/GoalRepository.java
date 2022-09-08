package com.skillstorm.demo.repositories;

import org.springframework.stereotype.Repository;

import com.skillstorm.demo.models.Goal;

@Repository
public interface GoalRepository extends GenericRepository<Goal, Integer> {

}
