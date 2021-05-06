package com.coursenet03.model;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//tostring untuk ngeprint isi dari model(semacem ngecek kodingan udah bener ato blom sepertinya)
@ToString
public class CalculatorModel {
	
	@NotBlank
	private String angka1;
	
	@NotBlank
	private String operation;
	
	@NotBlank
	private String angka2;
	
}
