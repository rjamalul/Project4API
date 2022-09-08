package com.skillstorm.demo.models;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class Users implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_Id")
	private int user_Id;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "username")
	private String username;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "password")
	private String password;
	
	

	public Users() {
		
	}
	
	
	public Users(int user_Id, String username) {
		this.user_Id = user_Id;
		this.username = username;
	}
	
	
	public Users(int user_Id, String username, String password) {
		super();
		this.user_Id = user_Id;
		this.username = username;
		this.password = password;
	}



	public int getUser_Id() {
		return user_Id;
	}


	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users user = (Users) o;
        return user_Id == user.user_Id ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_Id );
    }	
}
