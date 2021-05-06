package com.coursenet03.dao;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.coursenet03.model.UserLogin;

@Component //supaya bisa dipakai autowired
@Transactional //auto rollback kalo gagal
@Repository
public class RegisterDAO {
	
	@Autowired
	SessionFactory sf;
	
	public void add(UserLogin model) {
		//model.setId(UUID.randomUUID());
		sf.getCurrentSession().save(model);
	}
	
	/**
	 * Fungsi untuk get data user
	 * @return
	 */
	public List<UserLogin> get_all() {
		//hql isinya "from (class modelnya (UserLogin))" 
		List<UserLogin> data = sf.getCurrentSession().createQuery("from UserLogin").list();
		return data;
	}
	
	public void delete(int id) {
		UserLogin data = sf.getCurrentSession().get(UserLogin.class, id);
		sf.getCurrentSession().delete(data);
	}
	
	public UserLogin get(int id) {
		UserLogin data = sf.getCurrentSession().get(UserLogin.class, id);
		return data;
	}
	
	public void update(UserLogin userLogin) {
		UserLogin dataLama = sf.getCurrentSession().get(UserLogin.class, userLogin.getId());
		
		dataLama.setEmail(userLogin.getEmail());
		dataLama.setGender(userLogin.getGender());
		dataLama.setStatus(userLogin.getStatus());
		dataLama.setName(userLogin.getName());
		
		sf.getCurrentSession().update(dataLama);
	}

}
