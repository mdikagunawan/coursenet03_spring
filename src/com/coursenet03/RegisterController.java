package com.coursenet03;

import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coursenet03.dao.RegisterDAO;
import com.coursenet03.model.UserLogin;

@Controller
public class RegisterController {
	
	@Autowired
	RegisterDAO dao;
	
	@RequestMapping(value="/register")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView("register");
		return mv;
	}
	
	@RequestMapping(value="/register2")
	public ModelAndView register2() {
		
		//declare model UserLogin ke controller(import)
		UserLogin userLogin = new UserLogin();
		
		//data dari model UserLogin.java dikirim ke register2.jsp. Yang nama ditengah harus sesuai dengan nama class modelnya dengan huruf kecil didepannya
		ModelAndView mv = new ModelAndView("register2", "userLogin", userLogin);
		return mv;
	}
	
	@RequestMapping(value="/proses_register", method=RequestMethod.POST)
	public ModelAndView proses_register(
			@RequestParam String email,
			@RequestParam String password,
			@RequestParam String name,
			@RequestParam String gender,
			@RequestParam String status
			) {
		
		HashMap<String, String> data = new HashMap<String, String>();
			data.put("email", email);
			data.put("password", password);
			data.put("name", name);
			data.put("gender", gender);
			data.put("status", status);
				
		ModelAndView mv = new ModelAndView("success", "data", data);
		return mv;
	}
	
	//@PostMapping jadi ngga perlu ketik method=RequestMethod.POST
	@PostMapping(value="/proses_register2")
	public ModelAndView proses_register2(@ModelAttribute @Valid UserLogin userLogin, BindingResult result) {
		
		if(result.hasErrors()) {
			List<ObjectError> er = result.getAllErrors();
			for(ObjectError e:er) {
				System.out.println(e.getDefaultMessage());
			}
			
			ModelAndView mv = new ModelAndView("register2", "data", userLogin);
			return mv;
		}
		
		dao.add(userLogin);
		
		ModelAndView mv = new ModelAndView("success2", "data", userLogin);
		return mv;
	}
	
	@GetMapping(value="/list")
	public ModelAndView list_user() {
		List<UserLogin> data = dao.get_all();
		
		ModelAndView mv = new ModelAndView("list", "data", data);
		return mv;
	}
	
	@PostMapping(value="/delete_user")
	public ModelAndView delete_user(@RequestParam int id) {
		dao.delete(id);
		ModelAndView mv = new ModelAndView("redirect:/list");
		return mv;
	}
	
	@GetMapping(value="/edit_user/{id}")
	public ModelAndView edit_user(@PathVariable int id) {
		
		UserLogin userLogin = dao.get(id);
		ModelAndView mv = new ModelAndView("edit", "userLogin", userLogin);
		return mv;
	}
	
	@PostMapping("/proses_edit")
	public ModelAndView proses_edit(@ModelAttribute UserLogin userLogin) {
		
		dao.update(userLogin);
		ModelAndView mv = new ModelAndView("redirect:/list");
		return mv;
	}
}
