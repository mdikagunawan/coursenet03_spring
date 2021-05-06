package com.coursenet03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coursenet03.dao.RegisterDAO;
import com.coursenet03.model.UserLogin;

@RestController
public class UserController {
	
	@Autowired
	RegisterDAO dao;
	
	
	@GetMapping(value="/user")
	public List<UserLogin> get_all(){
		return dao.get_all();
	}
	
	@PostMapping(value="/user")
	public String add(@RequestBody UserLogin data){
		dao.add(data);
		return "Success Create";
	}
	
	@PutMapping(value="/user")
	public String edit(@RequestBody UserLogin data){
		dao.update(data);
		return "Success Update";
	}
	
	@DeleteMapping(value="/user/{id}")
	public String delete(@PathVariable int id){
		dao.delete(id);
		return "Success Delete";
	}
}