package com.query.exemploswagger.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.query.exemploswagger.service.EmployeService;

import lombok.RequiredArgsConstructor;

@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/employe")
public class EmployeController {
	
	private final EmployeService employeService;
	
	
}
