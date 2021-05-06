package com.coursenet03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
public class WebController {

		// http://localhost:8080/
		// output	: "welcome to my website"
		@RequestMapping(value = "/")
		@ResponseBody
		public String index() {
			return "Welcome to my website";
		}
		
		@RequestMapping(value ="/about")
		@ResponseBody
		public String about_us() {
			return "Created by me";
		}
		
		@RequestMapping(value ="/products")
		@ResponseBody
		public String product() {
			return "Samsung";
		}
		
		@RequestMapping(value ="/products/{brand}")
		@ResponseBody
		public String product2(@PathVariable String brand) {
			if (brand.equals("samsung")) 
				return "samsung galaxy";
			else if(brand.equals("lenovo")) 
				return "a6000";
			else 
				return "";
		}
		
		@RequestMapping(value="/products/{brand}/{tipe}")
		@ResponseBody
		public String product3(@PathVariable String brand, @PathVariable String tipe) {
			return "Product " + brand + " with type " +tipe;
		}
		
		// PR
		// http://localhost:8080/calculator/add/1/3 === 4
		// http://localhost:8080/calculator/subtract/5/3 === 2
		// http://localhost:8080/calculator/multiple/5/3 === 15
		// http://localhost:8080/calculator/divide/9/3 === 3
		
		@RequestMapping(value="/calculator/{hitung}/{angka1}/{angka2}")
		@ResponseBody
		public String calculator(@PathVariable String hitung, @PathVariable int angka1, @PathVariable int angka2) {
			
			hitung=hitung.toLowerCase();
			int hasil;
			
			if (hitung.equals("add"))
				hasil=angka1+angka2;
			else if(hitung.equals("subtract")) 
				hasil=angka1-angka2;
			else if (hitung.equals("multiple")) 
				hasil=angka1*angka2;
			else if (hitung.equals("divide")) 
				hasil=angka1/angka2;
			else
				hasil=0;
			
			return ""+hasil;
		}
		
		//convert to maven project
		//pom.xml
		//spring-servlet.xml
		//web.xml
		//webcontroller.java
			
}
