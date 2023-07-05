package com.freshapples.controllers;

import com.freshapples.Application;
import com.freshapples.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.freshapples.model.RegisterModel;

import jakarta.validation.Valid;

/*
 * Class is a controller for /Register, /, /doRegister URLs. /Register is
 * the root directive, / displays the model and creates a new RegisterModel.
 *  /doRegister is called post submission to the / page, it validates the 
 *  data and then submits it to a database 
 * 
 * */

@Controller
@RequestMapping("/") // For accessing page via the navbar.
public class RequestController {
	@GetMapping("/request")
	public String display(Model model) {
		return "request";
	}

}