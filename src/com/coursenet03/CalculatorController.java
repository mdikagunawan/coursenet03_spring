package com.coursenet03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coursenet03.model.CalculatorModel;

@Controller
public class CalculatorController {

	@RequestMapping(value = "/calculator")
	public ModelAndView calculator() {
		// declare model ke controller(import)
		CalculatorModel calculatorModel = new CalculatorModel();

		// data dari model dikirim ke .jsp
		ModelAndView mv = new ModelAndView("calculator", "data", calculatorModel);
		return mv;
	}
}
