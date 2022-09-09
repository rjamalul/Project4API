package com.skillstorm.demo.controllers;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.demo.models.Goal;
import com.skillstorm.demo.repositories.GenericRepository;
import com.skillstorm.demo.repositories.GenericRepositoryImpl;
import com.skillstorm.demo.services.interfaces.GoalServiceInterface;
import com.skillstorm.demo.services.unitOfWork.IUnitOfWork;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/goals")
public class GoalController {
	
	private final IUnitOfWork unitOfWork;
	private GoalServiceInterface goalServiceInterface;

//	private GenericRepository<T, Serializable>;
	
	@Autowired
	public GoalController(IUnitOfWork unitOfWork, GoalServiceInterface goalServiceInterface) {
		this.unitOfWork = unitOfWork;
		this.goalServiceInterface = goalServiceInterface;
	}
	
//	@GetMapping("/{id}")
//	public Goal findById(@PathVariable int id) {
//		Optional<Goal> goal = unitOfWork.goal().findById(id);
//		return goal.isPresent() ? goal.get() : null;
//	}
	

	
	
	@GetMapping("/getGoals") 
	public ResponseEntity<List<Goal>> getGoals() {
		List<Goal> goals = new ArrayList<Goal>(); 
		goals = goalServiceInterface.findAll();
		return new ResponseEntity<>(goals, HttpStatus.CREATED);		
//		Optional<Goal> goal = unitOfWork.goal().findById(id);
//		return goal.isPresent() ? goal.get() : null;
	}
	
	@RequestMapping(value = "/addGoal", method = RequestMethod.POST)
	@PostMapping
	public ResponseEntity<String> createGoal(@RequestBody Goal goal) {
		goalServiceInterface.saveGoal(goal);
		return new ResponseEntity<>(new String("{}"), HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/updateGoal", method = RequestMethod.POST)
	@PostMapping
	public ResponseEntity<String> updateGoal(@RequestBody Goal goal) {
		goalServiceInterface.saveGoal(goal);
		return new ResponseEntity<>(new String("{}"), HttpStatus.CREATED);
	}
	
//	@PutMapping("/{id}")
//	public ResponseEntity<List<Goal>> updateGoal(@PathVariable int id, @RequestBody Goal goal) {
//		Goal returnGoal = this.unitOfWork.goal().update(goal);
//		if (returnGoal != null) {
//			List<Goal> goals = new ArrayList<>();
//			goals.add(returnGoal);
//			return new ResponseEntity<>(goals, HttpStatus.OK);
//		}
//		
//		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//	}
//	
	@DeleteMapping("/{id}")
	public boolean deleteGoal(@PathVariable int id) {
		boolean isDeleted = unitOfWork.goal().delete(id);
		return !isDeleted;
	}
	
	
	@RequestMapping("user")
	@ResponseBody
	public Principal user(Principal principal)
	{
		return principal;
	}
}
