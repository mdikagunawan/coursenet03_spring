package com.coursenet03;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public ModelAndView index() {
		// "home" sebenernya "/WEB-INF/jsp/home.jsp" dirubah dari spring-servlet.xml
		// prefix & suffix
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}

	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("about");
		return mv;
	}

	@RequestMapping(value = "/product/{brand}")
	public ModelAndView product(@PathVariable String brand) {
		// "brand" buat kirim data brand ke file jsp
		ModelAndView mv = new ModelAndView("product", "brand", brand);
		return mv;
	}

	@RequestMapping(value = "/product/{brand}/{tipe}")
	public ModelAndView product_detail(@PathVariable String brand, @PathVariable String tipe) {

		// HashMap buat mindahin data lebih dari satu. Data integer dkk harus dijadiin
		// string
		int i = 0;

		HashMap<String, String> data = new HashMap<String, String>();
		data.put("brand", brand);
		data.put("tipe", tipe);
		data.put("i", "" + i);

		ModelAndView mv = new ModelAndView("product_detail", "data", data);
		return mv;
	}

	@RequestMapping(value = "/calculator/{hitung}/{angka1}/{angka2}")
	public ModelAndView product_detail(@PathVariable String hitung, @PathVariable int angka1,
			@PathVariable int angka2) {

		hitung = hitung.toLowerCase();
		String sHitung;
		int hasil;

		if (hitung.equals("add")) {
			hasil = angka1 + angka2;
			sHitung="+";
		}
		else if (hitung.equals("subtract")) {
			hasil = angka1 - angka2;
			sHitung="-";
		}
		else if (hitung.equals("multiple")) {
			hasil = angka1 * angka2;
			sHitung="x";
		}
		else if (hitung.equals("divide")) {
			hasil = angka1 / angka2;
			sHitung="/";
		}
		else {
			hasil=0;
			sHitung="";
		}

		HashMap<String, String> data = new HashMap<String, String>();
		data.put("sHitung", "" + sHitung);
		data.put("angka1", "" + angka1);
		data.put("angka2", "" + angka2);
		data.put("hasil", "" + hasil);

		ModelAndView mv = new ModelAndView("calculator", "data", data);
		return mv;
	}
}
