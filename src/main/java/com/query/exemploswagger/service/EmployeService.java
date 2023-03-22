package com.query.exemploswagger.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.query.exemploswagger.model.Employe;
import com.query.exemploswagger.repository.EmployeRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EmployeService {
	private final EmployeRepository employeRepository;

	public List<Employe> getDataValueGreaterThan(double dataValue){
		return employeRepository.findByDataValueGreaterThanEqual(dataValue);
	}
}
