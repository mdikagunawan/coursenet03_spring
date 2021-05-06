package com.coursenet03.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//tostring untuk ngeprint isi dari model(semacem ngecek kodingan udah bener ato blom sepertinya)
@ToString
@Table (name="user_login")
@Entity
public class UserLogin {
	
	@Id
	@Column
	//ini buat generate increment IDnya
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	//private UUID id;
	
	@Column
	@NotBlank(message = "Email harus diisi")
	@Email
	private String email;
	
	@Column
	@NotBlank
	@Size(min = 4, message = "Password min 4 characters")
	private String password;
	
	@Column
	@NotBlank
	@Size(min = 5, max = 30)
	private String name;
	
	@Column
	@NotBlank
	private String gender;
	
	@Column
	@NotBlank
	private String status;
	
}
